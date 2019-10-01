package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProfileFragment extends Fragment {

    //vriskei ton singed in user kai ta courses tou sistimatos
    private User user;
    private List<Courses> courses;

    //Firebase vars
    private FirebaseAuth mAuth;

    // orizw firbasedatabe gia tous users
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    //vriskei ta TextViews pou tha provalonte oi plirofories tou user stin profile page
    private TextView UserNameTextView;
    private TextView DailyQuestsSolved;
    private TextView CoursesCompleted;
    private TextView ProfileScore;
    private TextView DailyQuestAttempts;
    private TextView CoursesStarted;
    private TextView Comments;

    // log out button
    private Button LogOutButton;

    // more option buttons
    private ImageView HelpImage;
    private ImageView UserStatistics;
    private ImageView AboutUs;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_profile_fragment_layout,container,false);

        //instanciate Firebase auth
        mAuth=FirebaseAuth.getInstance();
        // fortonei ton singed in user apo ta shear prefs
        user = DataHelper.loadUserProfileFromSP(getActivity());

        //vriskei ta views
        UserNameTextView = view.findViewById(R.id.user_profile_username);
        DailyQuestsSolved = view.findViewById(R.id.daily_quest_value);
        CoursesCompleted = view.findViewById(R.id.courses_completed_value);
        ProfileScore = view.findViewById(R.id.profile_score_value);
        DailyQuestAttempts = view.findViewById(R.id.daily_quest_attempts_value);
        CoursesStarted = view.findViewById(R.id.courses_started_value);
        Comments = view.findViewById(R.id.comments_value);
        LogOutButton = view.findViewById(R.id.log_out_button);
        HelpImage = view.findViewById(R.id.help_Image);
        UserStatistics = view.findViewById(R.id.user_statistics_image);
        AboutUs = view.findViewById(R.id.about_us_image);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        courses = new ArrayList<>();

        //provalei ta stats tou user
        if (mAuth.getCurrentUser() == null){
            startActivity(new Intent(getActivity(),AuthenticationActivity.class));
        }
        else {
            UserNameTextView.setText(mAuth.getCurrentUser().getDisplayName());
            DailyQuestsSolved.setText(String.valueOf(user.getPractiseTestSolved().size()));
            CoursesCompleted.setText(String.valueOf(user.getCoursesCompleted().size()));
            ProfileScore.setText(String.valueOf(user.getProfileScore()));
            DailyQuestAttempts.setText(String.valueOf(user.getPractiseTestInProgresses().size() + user.getPractiseTestSolved().size()));
            CoursesStarted.setText(String.valueOf(user.getCoursesInProgress().size() + user.getCoursesCompleted().size()));
//            Comments.setText(String.valueOf(user.getUserComments().size()));
        }
        // aposindesi tou xristi apo tin efarmogi
        LogOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                DataHelper.saveUserProfileToSP(getActivity(),null);
                startActivity(new Intent(getActivity(),AuthenticationActivity.class));
                getActivity().finish();
            }
        });


        // fortonei tous uses apo tin vasi
        // pigeni stin firebase sto ref pou einai oi users
        DatabaseReference courseRef = databaseReference.child("courses");

        // diavazei ta courses pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi
//        courseRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                // adiazei tin courses
//                courses = new ArrayList<>();
//
//                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton messages
//                //kai ma sto epistrefei opou kathe children autou tou snapshot einai enas user
//
//                for (DataSnapshot ds : dataSnapshot.getChildren()) {
//                    Courses m = ds.getValue(Courses.class);
//                    courses.add(m);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });

        HelpImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HelpActivity.class));
            }
        });

        UserStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                List<Tuple> coresesToRecap = findCorsesToRecap();
//                ShowMessage("Courses To Recapitulate",
//                        "You seem to need a recapitulation at those courses: \n"+
//                        coresesToRecap.get(0).getX()+"\n"+
//                                coresesToRecap.get(1).getX()+"\n"+
//                                coresesToRecap.get(2).getX()+"\n"+
//                                "we suggest you to try those courses again ");
            }
        });

        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMessage("About Us", "This project made for educational purposes for the 8th semester's subject Educational Software at University Of Piraeus.\n"+
                "Our Team: \n"+
                "Kottaridis Athanasios AM P15059 \n"+
                        "Tsilis Dimitrios AM P11159 \n"+
                        "Diatsigkos Ioannis AM P15037");
            }
        });


        return view;
    }

    public void ShowMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    private List<Tuple> findCorsesToRecap(){
        List<Tuple> userCourses = new ArrayList<>();
        List<Tuple> userTests = new ArrayList<>();
        List<Tuple> testAndCourses = new ArrayList<>();
        List<Tuple> coursesToRecap = new ArrayList<>();

        if (user.getCoursesInProgress() != null)
            for (Courses course : user.getCoursesInProgress()) {
                userCourses.add(new Tuple(course.getTitle(), Collections.frequency(user.getCoursesInProgress(), course)));
            }
        if (user.getPractiseTestInProgresses() != null)
            for (PractiseTests test : user.getPractiseTestInProgresses()) {
                userTests.add(new Tuple(test.getCourse(), Collections.frequency(user.getCoursesInProgress(), test)));
            }

        testAndCourses.addAll(userTests);
        testAndCourses.addAll(userCourses);

        for (Courses course:courses){
            coursesToRecap.add(new Tuple(course.getTitle(), Collections.frequency(testAndCourses, course)));
        }


        return coursesToRecap;
    }
}
