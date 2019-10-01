package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FirebaseFunctionsException;
import com.google.firebase.functions.HttpsCallableResult;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class MainPractiseFragment extends Fragment {

    //Log TAGS
    public static final String TAG = "MainPractiseFragment";

    //Today's challenge instance
    private PractiseTests TodaysChallenge;

    // list me ta tests
    private List<CourseCategory> categories;

    // gia to help
    private Toolbar toolbar;

    //gia to today's challenge (TC = today's challenge)
    private CardView TCContainer;
    private TextView TCTitleTextView;
    private Button TCButton;
    private View.OnClickListener TCListener;

    //gia to RecycleView
    private RecyclerView mView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    // orizw firbasedatabe gia ta practice tests
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    // firebase cloud functions instance
    private FirebaseFunctions firebaseFunctions;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_practise_fragment_layout, container, false);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        //initialise cloud function instance
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        firebaseFunctions = FirebaseFunctions.getInstance();

        //ftiaxnei to help stin toollbar
        toolbar = view.findViewById(R.id.main_practice_toolBar);
        toolbar.inflateMenu(R.menu.help_menu);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                startActivity(new Intent(getActivity(), HelpActivity.class));
                return false;
            }
        });

        //
        //GIA TO TODAY'S CHALLENGE
        //

        //vriskw ta views
        TCContainer = view.findViewById(R.id.todays_challenge_container);
        TCTitleTextView = view.findViewById(R.id.todays_challenge_title);
        TCButton = view.findViewById(R.id.start_todays_challenge_button);

        //Apothikeuei stin firebase to today's test

//        List<Chapter> chapters = new ArrayList<>();
//        Chapter chapter1 = new Chapter("'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter2 = new Chapter("Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter3 = new Chapter("You can also use python as calculator! To add two numbers, just use '+'.",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter4 = new Chapter("You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter5 = new Chapter("To divide (and conquer) you can use '/'. ",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        chapters.add(chapter1);
//        chapters.add(chapter2);
//        chapters.add(chapter3);
//        chapters.add(chapter4);
//        chapters.add(chapter5);
//
//        // ftiaxnw to TC
//        TodaysChallenge = new PractiseTests("Today's Challenge", chapters);
//
//        // paw stin firebase kai apothikeuw to todays challenge
//        uploadTC(TodaysChallenge);
//
//        TodaysChallenge = null;

        //fortonei apo tin firebase to today's challenge

        // pigeni stin firebase sto ref pou einai to today's challenge
        DatabaseReference TDRef = databaseReference.child("today's challenge");

        //diavazei ta courses pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi

        TDRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                TodaysChallenge = dataSnapshot.getValue(PractiseTests.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });

        TCListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //metatrepw to Today's Challenge se jason gia na to stilw sto intent
//                Gson gson = new Gson();
//                String json = gson.toJson(TodaysChallenge);

//                // ftiaxnw to intent
//                Intent intent = new Intent(getActivity(), PracticeActivity.class);
//                intent.putExtra(MainActivity.EXTRA_PRACTICE_TEST, json);
//                startActivity(intent);

                Gson gson = new Gson();
                //gets the current user from SP as a jason
                User currentUser = DataHelper.loadUserProfileFromSP(getActivity());
                String userJson = gson.toJson(currentUser);

                Task<String> result;
                boolean flag = true;

                // loops over users preferences
                for (CourseCategory preference : currentUser.getUserPreferences()) {
                    //checks if user level is greater than 1 on this course category
                    for (Tuple userInfo : currentUser.getUserLevels()) {
                        if (userInfo.getX().equals(preference.getCategoryName())) {
                            if (!(userInfo.getY() > 1)) {
                                flag = false;
                            }
                        }
                    }
                }

                if (flag) {
                    // gets the list of preference categories and converts the to json
                    String courseCategoriesJson = gson.toJson(currentUser.getUserPreferences());
                    result = createDynamicTest(userJson, courseCategoriesJson, "Daily Practise Test");
                } else {
                    ShowMessage("You have to complete at least one course of all your preferences to enable today's challenge");

                }

            }
        };

        //event sto patima tou today's challenge
        TCContainer.setOnClickListener(TCListener);
        TCButton.setOnClickListener(TCListener);


        //
        //GIA TA PRACTICE TESTS
        //

        // initialise categories
        categories = new ArrayList<>();

        //Apothikeuei stin firebase to introduction to python practice test

//        List<Chapter> chapters = new ArrayList<>();
//        Chapter chapter1 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter2 = new Chapter(""
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter3 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter4 = new Chapter("",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter5 = new Chapter("",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        chapters.add(chapter1);
//        chapters.add(chapter2);
//        chapters.add(chapter3);
//        chapters.add(chapter4);
//        chapters.add(chapter5);
//
//        //arxikopoiei ta tests
//        tests = new ArrayList<>();
//
//        PractiseTests test = new PractiseTests("Introduction To Python Practice",chapters,"Introduction To Python");
//
//
//
//        // paw stin firebase kai apothikeuw ta test
//        uploadPracticeTests(test);

        //apothikeuei to arithmetic in python practice test
//        List<Chapter> chapters = new ArrayList<>();
//        Chapter chapter1 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter2 = new Chapter(""
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter3 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter4 = new Chapter("",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter5 = new Chapter("",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        chapters.add(chapter1);
//        chapters.add(chapter2);
//        chapters.add(chapter3);
//        chapters.add(chapter4);
//        chapters.add(chapter5);
//
//        //arxikopoiei ta tests
//        tests = new ArrayList<>();
//
//        PractiseTests test = new PractiseTests("Arithmetic In Python Practice Test",chapters,"Arithmetic In Python");
//
//        // paw stin firebase kai apothikeuw ta test
//        uploadPracticeTests(test);

        // vazei to variable basics Practice test

//        List<Chapter> chapters = new ArrayList<>();
//        Chapter chapter1 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter2 = new Chapter(""
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter3 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter4 = new Chapter("",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter5 = new Chapter("",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        chapters.add(chapter1);
//        chapters.add(chapter2);
//        chapters.add(chapter3);
//        chapters.add(chapter4);
//        chapters.add(chapter5);
//
//        //arxikopoiei ta tests
//        tests = new ArrayList<>();
//
//        PractiseTests test = new PractiseTests("Variable Basics Practice Test",chapters,"Variable Basics");
//
//        // paw stin firebase kai apothikeuw ta test
//        uploadPracticeTests(test);


        // vazei to data types in python

//        List<Chapter> chapters = new ArrayList<>();
//        Chapter chapter1 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter2 = new Chapter(""
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter3 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter4 = new Chapter("",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter5 = new Chapter("",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        chapters.add(chapter1);
//        chapters.add(chapter2);
//        chapters.add(chapter3);
//        chapters.add(chapter4);
//        chapters.add(chapter5);
//
//        //arxikopoiei ta tests
//        tests = new ArrayList<>();
//
//        PractiseTests test = new PractiseTests("Data Types In Python Practice Test",chapters,"Data Types In Python");
//
//        // paw stin firebase kai apothikeuw ta test
//        uploadPracticeTests(test);

        // vazei to operating on data types

//        List<Chapter> chapters = new ArrayList<>();
//        Chapter chapter1 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter2 = new Chapter(""
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter3 = new Chapter("",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter4 = new Chapter("",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter5 = new Chapter("",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        chapters.add(chapter1);
//        chapters.add(chapter2);
//        chapters.add(chapter3);
//        chapters.add(chapter4);
//        chapters.add(chapter5);
//
//        //arxikopoiei ta tests
//        tests = new ArrayList<>();
//
//        PractiseTests test = new PractiseTests("Operating On Data Types Practice Test",chapters,"Data Types In Python Practice Test");
//
//        // paw stin firebase kai apothikeuw ta test
//        uploadPracticeTests(test);

        // gose to Course categories firebase reference
        DatabaseReference courseCategoriesRef = databaseReference.child("CourseCategories");

        // gets course categoris who is stored in FB
        // We make a listener to read categories from FB
        // on every uploado/update
        // or every time on create lunches

        courseCategoriesRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // reinitialise categories
                categories = new ArrayList<>();

                //every time data changes gets a snapshot from categories
                //and returns every children of this snapshot as a course Category OBJ

                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    CourseCategory m = ds.getValue(CourseCategory.class);
                    categories.add(m);


                    //updates course categories Recycle view
                    ((PractiseRecyclerViewAdapter) mAdapter).setmCategories(categories);
                    mView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });


        // kanei setup to recycler view
        // vriskoume to recycler view
        mView = view.findViewById(R.id.practise_test_recycler_view);

        // ftiaxnoume ton layout manager
        // diladi pos tha diaxirizete to layout you recycler view
        mlayoutManager = new LinearLayoutManager(getActivity());
        mView.setLayoutManager(mlayoutManager);

        //kanoume instantiate ton adapter pou dimiourgisame
        //kai pername ton adapter sto recycler view
        //me auton ton tropo leme pos na xiristei ta items

        mAdapter = new PractiseRecyclerViewAdapter(categories);
        mView.setAdapter(mAdapter);

        //ftiaxnw to event sto onClick tou kathe item tou recycler view
        ((PractiseRecyclerViewAdapter) mAdapter).setOnTestItemClickListener(new PractiseRecyclerViewAdapter.OnTestItemClickListener() {
            @Override
            public void onTestItemClick(CourseCategory mCategories) {
                //Load user profile from SP
                // converts mCategories and user profile to json

                Gson gson = new Gson();
                //gets the current user from SP as a jason
                User currentUser = DataHelper.loadUserProfileFromSP(getActivity());
                String userJson = gson.toJson(currentUser);

                // gets the list of the practice test categories and converts the to json
                List<CourseCategory> courseCategories = new ArrayList<>();
                courseCategories.add(mCategories);
                String courseCategoriesJson = gson.toJson(courseCategories);

                Task<String> result;

                //checks if user level is greater than 1 on this course category
                for (Tuple userInfo : currentUser.getUserLevels()) {
                    if (userInfo.getX().equals(mCategories.getCategoryName())) {
                        if (userInfo.getY() > 1) {
                            //calls the create dynamicTest Function
                            Task<String> recommendationJson = createDynamicTest(userJson, courseCategoriesJson, mCategories.getCategoryName());
//                            List<ChapterRecommendation> recommendations = getRecommendationFromJson(recommendationJson.getResult());
//                            ShowMessage(String.valueOf(recommendations.get(1).getAverageScore()));
                        } else
                            ShowMessage("You have to complete at least one course of " + mCategories.getCategoryName() + " to enable the practise test");
                    }
                }
            }
        });


        return view;
    }

    public void uploadTC(PractiseTests test) {
        //paw stin dieuthinsei tis firebase pou exw fiaksi
        //kai dimiourgw ena child node to opoio tha apothikeuei ta courses
        DatabaseReference Ref = databaseReference.child("today's challenge");

        //pame mesa sto Courses tis firebase kai vazoume to kenourio course
        // DatabaseReference newMessageRef = messageRef.push();
        Ref.setValue(test);
    }

    public void uploadPracticeTests(PractiseTests test) {
        //paw stin dieuthinsei tis firebase pou exw fiaksi
        //kai dimiourgw ena child node to opoio tha apothikeuei ta tests
        DatabaseReference Ref = databaseReference.child("practice test");

        //pame mesa sto practice test tis firebase kai vazoume to kenourio course
        // DatabaseReference newMessageRef = messageRef.push();
        Ref.push().setValue(test);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.help_menu, menu);
    }

    // method who calls createDynamicTest cloud function
    private Task<String> createDynamicTest(String currentUser, String categories, final String categoryTile) {
        // create the arguments to the callable function
        // gets the user from SP


        // map works as a lists were each element is a tuple (key,value)
        Map<String, Object> data = new HashMap<>();
        data.put("currentUser", currentUser);
        data.put("courseCategories", categories);
        data.put("push", true); // pass any data in map

        return firebaseFunctions
                .getHttpsCallable("createDynamicPracticeTest")
                .call(data)
                .continueWith(new Continuation<HttpsCallableResult, String>() {
                    @Override
                    public String then(@NonNull Task<HttpsCallableResult> task) {
                        // This continuation runs on either success or failure, but if the task
                        // has failed then getResult() will throw an Exception which will be
                        // propagated down.
                        String recommendationJson = (String) task.getResult().getData();
                        //converts the string to a list of practice recommendation objects
                        List<ChapterRecommendation> recomendation = getRecommendationFromJson(recommendationJson);

                        getRecommendedChapters(recomendation,categoryTile);

                        Toast.makeText(getActivity(), "OK!!!!", Toast.LENGTH_LONG).show();
                        return recommendationJson;
                    }
                });

    }

    // this method gets the recommendation json and convert it into a chapter recomendation List
    private List<ChapterRecommendation> getRecommendationFromJson(String json) {
        //fortwnw apo to to intent to test
        Gson gson = new Gson();
        //dilwnw ton tipo pou tha ginei metatropei to string pou diavasa
        Type type = new TypeToken<List<ChapterRecommendation>>() {
        }.getType();
        //ftiaxnw to gason metatrepontas to string sto type pou orisa
        return gson.fromJson(json, type);
    }

    // this method reads the chapters for the recommended practice test
    private void getRecommendedChapters(final List<ChapterRecommendation> recommendationList, final String categoryTitle) {
        final List<Chapter> practiceTestChapters = new ArrayList<>();

        //finds the firebase ref to this specific chapter
        DatabaseReference ref = databaseReference.child("courses");


        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

//                for each recommended chapter
                for (ChapterRecommendation recommendation : recommendationList){
                    practiceTestChapters.add(dataSnapshot
                            .child(recommendation.category.replaceAll("\\s+", ""))
                            .child(recommendation.courseID)
                            .child("chapters")
                            .child(recommendation.chapterID)
                            .getValue(Chapter.class));
                }

                // checks if practiceTestChapters size is >= 10
                if (practiceTestChapters.size() >= 10) {

                    // creates the practise test
                    PractiseTests practiseTests = new PractiseTests(categoryTitle, practiceTestChapters);

                    // converts the practice test to jason and send it to practice Activity
                    Gson gson = new Gson();
                    String json = gson.toJson(practiseTests);

                    // ftiaxnw to intent
                    Intent intent = new Intent(getActivity(), PracticeActivity.class);
                    intent.putExtra(MainActivity.EXTRA_PRACTICE_TEST, json);
                    startActivity(intent);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


//        return practiceTestChapters;
    }

    public void ShowMessage(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setCancelable(true);
        builder.setTitle("Alert!");
        builder.setMessage(s);
        builder.show();
    }

}
