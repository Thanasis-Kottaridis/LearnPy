package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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

import java.util.ArrayList;
import java.util.List;

public class MainCoursesCategoriesFragment extends Fragment {

    private List<CourseCategory> courseCategories;

    // gia to help
    private Toolbar toolbar;

    //gia to RecycleView
    private RecyclerView mView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    // orizw firbasedatabe gia ta cources
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_course_categories_fragment_layout,container,false);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

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

        courseCategories = new ArrayList<>();

//        //
//        //kanei add sto sistima ta courses
//        //
//        new UploadCoursesToFB();


        // pigeni stin firebase sto ref pou einai ta courses categories
        DatabaseReference coursesRef = databaseReference.child("CourseCategories");

        // diavazei ta courses categories pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na ta diavazei apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi
        coursesRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // adiazei tin courses
                courseCategories = new ArrayList<>();

                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton CourseCategories
                //kai ma sto epistrefei opou kathe children autou tou snapshot einai ena course

                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    CourseCategory cc = ds.getValue(CourseCategory.class);
                    courseCategories.add(cc);

                    //enimeronei ta messages ston adapter gia na ta kanei desplay sto Recycle view
                    ((CoursesCategoriesRecyclerViewAdapter) mAdapter).setmCourses(courseCategories);
                    mView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


//        for (int i = 0; i < 10; i++)
//            courses.add(new Courses("Test Item "+i , R.drawable.cources_cover,chapters));

        // kanei setup to recycler view
        // vriskoume to recycler view
        mView = view.findViewById(R.id.courses_recycler_view);

        // ftiaxnoume ton layout manager
        // diladi pos tha diaxirizete to layout you recycler view
        // o GrigdLayoutManager leei oti se kathe grami tou recycler view tha eixei 2 items
        mlayoutManager = new GridLayoutManager(getActivity(),2);
        mView.setLayoutManager(mlayoutManager);

        //kanoume instantiate ton adapter pou dimiourgisame
        //kai pername ton adapter sto recycler view
        //me auton ton tropo leme pos na xiristei ta items

        mAdapter = new CoursesCategoriesRecyclerViewAdapter(getActivity(),courseCategories);
        mView.setAdapter(mAdapter);

        // ftiaxnw to event sto onClick tou kathe item tou recycler view
        // to opoio einai to interface pou ftia3ame sto CoursesRecyclerView
        ((CoursesCategoriesRecyclerViewAdapter) mAdapter).setOnItemClickListener(new CoursesCategoriesRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(CourseCategory category) {
                // kanei set ston view pager tou main activity to fragment gia ta courses
                ((MainActivity)getActivity()).goToCategoryCourses(category);
            }
        });

        return view;
    }

    public void uploadCourse(Courses course){
        //paw stin dieuthinsei tis firebase pou exw fiaksi
        //kai dimiourgw ena child node to opoio tha apothikeuei ta courses
        DatabaseReference Ref = databaseReference.child("courses");

        //pame mesa sto Courses tis firebase kai vazoume to kenourio course
        // DatabaseReference newMessageRef = messageRef.push();
        Ref.push().setValue(course);
    }

}
