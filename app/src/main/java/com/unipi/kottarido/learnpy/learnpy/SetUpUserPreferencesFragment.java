package com.unipi.kottarido.learnpy.learnpy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetUpUserPreferencesFragment extends Fragment {

    //antikimeno sindedemenou xristi
    private User user;

    // lista me tis katigories ton kefalewn
    private List<CourseCategory> courseCategories;

    //gia to recycle view
    private RecyclerView mView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    // orizw firbasedatabe gia ta cources
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.set_up_user_preferences_fragment,container,false);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        // fortonei ta CourseCategories sti FB
        //new UploadCoursesToFB();

        // ftiaxnei ta course categories
        courseCategories = new ArrayList<>();

//        //
//        //kanei add sto sistima tin Introduction To Python
//        //
//        CourseCategory category = new CourseCategory("Introduction To Python","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fintroduction_to_python_image.jpg.png?alt=media&token=deee3b5c-afa4-457c-83fe-8b1546e35cbb",null);
//        courseCategories.add(category);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category);
//
//        //
//        //kanei add sto sistima tin Data Analisis - Big Data category
//        //
//
//        CourseCategory category2 = new CourseCategory("Data Analysis - Big Data","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fdata_analysis.png?alt=media&token=f789d39e-0fa5-43e2-8b36-b0293ad818f8",null);
//        courseCategories.add(category2);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category2);
//
//        //
//        //kanei add sto sistima tin Machine Learning category
//        //
//
//        CourseCategory category3 = new CourseCategory("Machine Learning","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fmachine_learning.png?alt=media&token=999f3fe8-6644-4fd5-9f88-011be4089d0e",null);
//        courseCategories.add(category3);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category3);
//
//        //
//        //kanei add sto sistima tin Web Development - Django category
//        //
//
//        CourseCategory category4 = new CourseCategory("Web Development - Django","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fweb_app_django.png?alt=media&token=2e53e04e-4297-419f-b8d0-bcedffebaebb",null);
//        courseCategories.add(category4);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category4);
//
//        //
//        //kanei add sto sistima tin Desktop And GUI Applications category
//        //
//
//        CourseCategory category5 = new CourseCategory("Desktop And GUI Applications ","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fdesktop_and_gui_applications.png?alt=media&token=921a995f-443a-410e-9ba6-407a6160b5f3",null);
//        courseCategories.add(category5);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category5);
//
//        //
//        //kanei add sto sistima tin Scientific And Numeric Applications category
//        //
//
//        CourseCategory category6 = new CourseCategory("Scientific And Numeric Applications","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fsientific_and_numeric_applications.png?alt=media&token=9d7236f4-bf99-4604-bee3-8f50d2fbf96a",null);
//        courseCategories.add(category6);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category6);
//
//        //
//        //kanei add sto sistima tin Software Development category
//        //
//
//        CourseCategory category7 = new CourseCategory("Software Development","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fsoftware_development_aplications.png?alt=media&token=191b2bfe-499f-4ebd-83e3-1ba620d2d132",null);
//        courseCategories.add(category7);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category7);
//
//        //
//        //kanei add sto sistima tin Security And Cryptography category
//        //
//
//        CourseCategory category8 = new CourseCategory("Security And Cryptography","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fsecurity_and_cryptography.png?alt=media&token=b154cd2a-2f25-4ad4-b072-2f75061f111a",null);
//        courseCategories.add(category8);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category8);
//
//        //
//        //kanei add sto sistima tin Games And 3D Graphics category
//        //
//
//        CourseCategory category9 = new CourseCategory("Games And 3D Graphics","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fgames_and_3d_graphics.png?alt=media&token=c61363ba-53d0-45db-996d-bedb42267afd",null);
//        courseCategories.add(category9);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category9);
//
//        //
//        //kanei add sto sistima tin Scripting And Web Scripting category
//        //
//
//        CourseCategory category10 = new CourseCategory("Scripting And Web Scripting","https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/CourseCategoryIcons%2Fscripting_web_scripting.png?alt=media&token=0a8906b8-3102-404d-a8ff-9fada6af0710",null);
//        courseCategories.add(category10);
//        // paw stin firebase kai apothikeuw to category
//        DataHelper.uploadCourseCategory(category10);



        // pigeni stin firebase sto ref pou einai ta courses categories
        DatabaseReference coursesRef = databaseReference.child("CourseCategories");

        // diavazei ta courses pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi
        coursesRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // adiazei tin courses
                courseCategories = new ArrayList<>();

                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton messages
                //kai ma sto epistrefei opou kathe children autou tou snapshot einai ena course

                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    CourseCategory m = ds.getValue(CourseCategory.class);
                    courseCategories.add(m);

                    //enimeronei ta messages ston adapter gia na ta kanei desplay sto Recycle view
                    ((SetUpUserPreferencesRecyclerViewAdapter) mAdapter).setmCoursesCategories(courseCategories);
                    mView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // kanei setup to recycler view
        // vriskoume to recycler view
        mView = view.findViewById(R.id.courses_categories_recycler_view);

        // ftiaxnoume ton layout manager
        // diladi pos tha diaxirizete to layout you recycler view
        // o GrigdLayoutManager leei oti se kathe grami tou recycler view tha eixei 2 items
        mlayoutManager = new GridLayoutManager(getActivity(),2);
        mView.setLayoutManager(mlayoutManager);

        //kanoume instantiate ton adapter pou dimiourgisame
        //kai pername ton adapter sto recycler view
        //me auton ton tropo leme pos na xiristei ta items

        mAdapter = new SetUpUserPreferencesRecyclerViewAdapter(courseCategories,getActivity());
        mView.setAdapter(mAdapter);

        //on Recycle view item click event einai to interface pou ftia3ame ston adapter
        //to xirizomaste opos xirizomaste kai ta apla onclick event
        ((SetUpUserPreferencesRecyclerViewAdapter)mAdapter).setOnItemClickListener(new SetUpUserPreferencesRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {

                if ( courseCategories.get(pos).isChecked())
                    courseCategories.get(pos).setChecked(false);
                else
                    courseCategories.get(pos).setChecked(true);

                // enimeronei ton adapter
                ((SetUpUserPreferencesRecyclerViewAdapter)mAdapter).setmCoursesCategories(courseCategories);
                mView.setAdapter(mAdapter);

                // ftiaxnei tin lista me tis protimisis tou user
                ArrayList<CourseCategory> userPreferences = new ArrayList<>();
                for(CourseCategory category: courseCategories){
                    if (category.isChecked())
                        userPreferences.add(category);
                }

                // arxikopoiei ta level tou user se ola ta category
                List<Tuple> userLevels = new ArrayList<>();
                for(CourseCategory category :courseCategories)
                    userLevels.add(new Tuple(category.getCategoryName(),1));

                // tin epistrefei sto setup activity
                ((SetUpProfileActivity)getActivity()).setUserPreferences(userLevels, userPreferences);

            }
        });
        return view;
    }


}
