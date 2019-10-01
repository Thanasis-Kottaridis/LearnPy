package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainCourseFragment extends Fragment {
    //the current connected user
    private User currentUser;
    // gets the user level for this category
    private int userCategoryLevel;

    // to course category pou exei epile3ei o xristis
    private CourseCategory courseCategory;

    // list me ta courses pou einai katacorimena se auto to category
    private List<Courses> courses;

    // gia to help
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    //gia to RecycleView
    private RecyclerView mView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    // orizw firbasedatabe gia ta practice tests
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_courses_fragment_layout,container,false);

        // fortonei ta stixia sxetika me to course apo tA SHEARD PREFERENCES
        loadCourseCategory();


        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        // fortonei ton user pou einai sindedemenos apo ta shared prefs me tin voithia tou data helper
        currentUser = DataHelper.loadUserProfileFromSP(getActivity());
        //finds out user category level
        for(Tuple categoryLevel : currentUser.getUserLevels()){
            if(categoryLevel.getX().equals(courseCategory.getCategoryName()))
                userCategoryLevel = categoryLevel.getY();
        }

        //ftiaxnei to help stin toollbar
        toolbar = view.findViewById(R.id.main_courses_toolBar);
        toolbar.inflateMenu(R.menu.help_menu);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                startActivity(new Intent(getActivity(), HelpActivity.class));
                return false;
            }
        });

        // vazei to title sto colapsing toolbar
        collapsingToolbarLayout = view.findViewById(R.id.main_courses_collapsingToolbar);
        collapsingToolbarLayout.setTitle(courseCategory.getCategoryName());


        // apothikeuei ta courses stin fb
//        new UploadCoursesToFB();

        courses = new ArrayList<>();

        //fortonei apo tin firebase ta courses tis category

        // pigeni stin firebase sto ref pou einai ta courses tou category
        // pigeni stin firebase sto ref pou einai ta courses categories
        //
       // DatabaseReference coursesRef = databaseReference.child("courses").child(courseCategory.getCategory().replaceAll("\\s+",""));
        DatabaseReference coursesRef = databaseReference.child("courses").child(courseCategory.getCategoryName().replaceAll("\\s+",""));

        //DatabaseReference coursesRef = databaseReference.child("courses");

        // diavazei ta courses categories pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na ta diavazei apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi

        coursesRef.addValueEventListener((new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // adiazei tin courses
               courses = new ArrayList<>();

                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton CourseCategories
                // kai ma sto epistrefei opou kathe children autou tou snapshot einai ena course

                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    Courses cc = ds.getValue(Courses.class);
                    courses.add(cc);

                    //enimeronei ta messages ston adapter gia na ta kanei desplay sto Recycle view
                    ((CoursesRecyclerViewAdapter) mAdapter).setmCourses(courses);
                    mView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        }));

//        coursesRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                // adiazei tin courses
//                courses = new ArrayList<>();
//
//                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton CourseCategories
//                //kai ma sto epistrefei opou kathe children autou tou snapshot einai ena course
//
//                for(DataSnapshot ds : dataSnapshot.getChildren()) {
//                    Courses cc = ds.getValue(Courses.class);
//                    courses.add(cc);
//
//                    //enimeronei ta messages ston adapter gia na ta kanei desplay sto Recycle view
//                    ((CoursesRecyclerViewAdapter) mAdapter).setmCourses(courses);
//                    mView.setAdapter(mAdapter);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });



        // kanei setup to recycler view
        // vriskoume to recycler view
        mView = view.findViewById(R.id.courses_recycler_view);

        // ftiaxnoume ton layout manager
        // diladi pos tha diaxirizete to layout you recycler view
        mlayoutManager = new LinearLayoutManager(getActivity());
        mView.setLayoutManager(mlayoutManager);

        //kanoume instantiate ton adapter pou dimiourgisame
        //kai pername ton adapter sto recycler view
        //me auton ton tropo leme pos na xiristei ta items

        mAdapter = new CoursesRecyclerViewAdapter(courses, userCategoryLevel);
        mView.setAdapter(mAdapter);

        //ftiaxnw to event sto onClick tou kathe item tou recycler view
        ((CoursesRecyclerViewAdapter) mAdapter).setOnTestItemClickListener(new CoursesRecyclerViewAdapter.OnTestItemClickListener() {
            @Override
            public void onTestItemClick(Courses mCourse) {

                //checks if user level is greater or equal with course level
                if(userCategoryLevel >= mCourse.getLevel()){
                    //metatrepw to course se jason gia na to stilw sto intent
                    Gson gson = new Gson();
                    String json = gson.toJson(mCourse);

                    // ftiaxnw to intent
                    Intent intent = new Intent(getActivity(), CourseActivity.class);
                    intent.putExtra(MainActivity.EXTRA_COURSES_COURSE, json);
                    startActivity(intent);
                    //getActivity().finish();
                }
                else {
                    ShowMessage("This course is for level: "+mCourse.getLevel()+" and more and your level is: "+userCategoryLevel);
                }

            }
        });

        return view;
    }

    private void loadCourseCategory(){
        //fortonei to pref file
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(DataHelper.PREF_FILE, Context.MODE_PRIVATE);
        //fortwnw apo to bundle to course category
        Gson gson = new Gson();
        // diavazei ton user se json morfi pao to pref file
        String json = sharedPreferences.getString(MainActivity.COURSE_CATEGORY_KEY,null);
        //dilwnw ton tipo pou tha ginei metatropei to string pou diavasa
        Type type = new TypeToken<CourseCategory>(){}.getType();
        //ftiaxnw to gason metatrepontas to string sto type pou orisa
        courseCategory = gson.fromJson(json,type);
        // clear arguments

    }

    public void ShowMessage(String s){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setCancelable(true);
        builder.setTitle("Alert!");
        builder.setMessage(s);
        builder.show();
    }
}
