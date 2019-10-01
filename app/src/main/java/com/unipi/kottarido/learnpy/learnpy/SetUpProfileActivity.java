package com.unipi.kottarido.learnpy.learnpy;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetUpProfileActivity extends AppCompatActivity {

    public static final String EXTRA_EVALUATION_TEST = "com.unipi.kottarido.learnpy.learnpy.EXTRA_EVALUATION_TEST";

    //antikimeno sindedemenou xristi
    private User user;

    // metavlites gia diaxirisi ton fragment se auto to activity
    private SelectorStatePagerAdapter adapter;
    private ViewPager mViewPager;

    // set up title
    private TextView title;

    // continue button
    private Button continueButton;

    // orizw firbasedatabe gia ta practice tests
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    // to evaluation test pou tha apantisei o xristis kata tin diarkia tou setup profile
    private PractiseTests evaluationTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up_profile);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        //fortonei apo SP ton user pou einai sindedemenos
        user = DataHelper.loadUserProfileFromSP(this);

        // vazei to evaluation test stin firebase
//
//        List<Chapter> chapters = new ArrayList<>();
//        Chapter chapter1 = new Chapter(1,new Tuple("Introduction To Python",1),"(Introduction to python - lvl 1) 'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter2 = new Chapter(2,new Tuple("Data Analysis - Big Data",1),"(Data Analysis - Big Data - LVL 1) Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter3 = new Chapter(3,new Tuple("Machine Learning",1)," (Machine Learning - LVL 1) You can also use python as calculator! To add two numbers, just use '+'.",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter4 = new Chapter(4,new Tuple("Web Development - Django",1)," (Web Development - Django - LVL 1) You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter5 = new Chapter(5,new Tuple("Desktop And GUI Applications ",1)," (Desktop And GUI Applications - lvl 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        Chapter chapter6 = new Chapter(6,new Tuple("Scientific And Numeric Applications",1),"(Scientific And Numeric Applications - lvl 1) 'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter7 = new Chapter(7,new Tuple("Software Development",1)," (Software Development - LVL 1) Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter8 = new Chapter(8,new Tuple("Security And Cryptography",1),"(Security And Cryptography - LVL 1) You can also use python as calculator! To add two numbers, just use '+'.",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter9 = new Chapter(9,new Tuple("Games And 3D Graphics",1)," (Games And 3D Graphics lvl 1) You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter10 = new Chapter(10,new Tuple("Scripting And Web Scripting",1)," (Scripting And Web Scripting - LVL 1) To divide (and conquer) you can use '/'. ",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        Chapter chapter11 = new Chapter(11,new Tuple("Introduction To Python",2),"(Introduction to python - lvl 2) 'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter12 = new Chapter(12,new Tuple("Data Analysis - Big Data",2),"(Data Analysis - Big Data - LVL 2) Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter13 = new Chapter(13,new Tuple("Machine Learning",2)," (Machine Learning - LVL 2) You can also use python as calculator! To add two numbers, just use '+'.",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter14 = new Chapter(14,new Tuple("Web Development - Django",2)," (Web Development - Django - LVL 2) You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter15 = new Chapter(15,new Tuple("Desktop And GUI Applications ",2)," (Desktop And GUI Applications - lvl 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        Chapter chapter16 = new Chapter(16,new Tuple("Scientific And Numeric Applications",2),"(Scientific And Numeric Applications - lvl 2) 'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter17 = new Chapter(17,new Tuple("Software Development",2)," (Software Development - LVL 2) Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter18 = new Chapter(18,new Tuple("Security And Cryptography",2),"(Security And Cryptography - LVL 2) You can also use python as calculator! To add two numbers, just use '+'.",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter19 = new Chapter(19,new Tuple("Games And 3D Graphics",2)," (Games And 3D Graphics lvl 2) You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter20 = new Chapter(20,new Tuple("Scripting And Web Scripting",2)," (Scripting And Web Scripting - LVL 2) To divide (and conquer) you can use '/'. ",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        Chapter chapter21 = new Chapter(21,new Tuple("Introduction To Python",3),"(Introduction to python - lvl 3) 'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter22 = new Chapter(22,new Tuple("Data Analysis - Big Data",3),"(Data Analysis - Big Data - LVL 3) Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter23 = new Chapter(23,new Tuple("Machine Learning",3)," (Machine Learning - LVL 3) You can also use python as calculator! To add two numbers, just use '+'.",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter24 = new Chapter(24,new Tuple("Web Development - Django",3)," (Web Development - Django - LVL 3) You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter25 = new Chapter(25,new Tuple("Desktop And GUI Applications ",3)," (Desktop And GUI Applications - lvl 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
//                Arrays.asList(new String[] {"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans1.html?alt=media&token=6bbfc02d-2a3b-4181-8ea2-9b865d23be4b",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f",
//                        "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans3.html?alt=media&token=457cdfe4-df99-49f8-bb12-e3face6f1431"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter5%2Fans2.html?alt=media&token=a970fca2-7434-4437-a1ce-23047fcb039f","print(2 / 4)");
//
//        Chapter chapter26 = new Chapter(26,new Tuple("Scientific And Numeric Applications",3),"(Scientific And Numeric Applications - lvl 3) 'print()' outputs to the screen. Whatever you put between the parentheses will be output! E.g. 'print(5)' will output 5",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter1%2Fchapter1_code.html?alt=media&token=cb9e813a-9b80-44ba-ae46-221dd3ea27fc",
//                true, Arrays.asList(new String[]{"2","4","42"}), "42");
//
//        Chapter chapter27 = new Chapter(27,new Tuple("Software Development",3)," (Software Development - LVL 3) Be cearful! Every 'print()' statement also adds a new line to whatever the output is."
//                ,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter2%2Fchapter2_code.html?alt=media&token=205aa38e-43f4-4d21-a426-92d49e68277a",
//                true,Arrays.asList(new String[]{"10 \n20","10 \n \n20","1020"}),"10 \n20");
//
//        Chapter chapter28 = new Chapter(28,new Tuple("Security And Cryptography",3),"(Security And Cryptography - LVL 3) You can also use python as calculator! To add two numbers, just use '+'.",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter3%2Fchapter3_code.html?alt=media&token=9839a7b5-59a5-44ef-a3aa-d8ab1cb9cfe4",
//                true, Arrays.asList(new String[]{"10","107","17"}),"17");
//
//        Chapter chapter29 = new Chapter(29,new Tuple("Games And 3D Graphics",3)," (Games And 3D Graphics lvl 3) You can use '-' to subtract numbers,just like a calculator.",false,"3",Arrays.asList(new String[]{"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans1.html?alt=media&token=4ecc1448-d3d8-4e58-a1a5-89cb4bbb2393",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b",
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans3.html?alt=media&token=687f4309-197d-40e7-92ce-8f52d745c1d8"}),
//                "https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/Courses%2FIntroduction%20to%20Python%2FChapter4%2Fans2.html?alt=media&token=4cd0ef7b-4310-4a72-b6b7-32f5ad7e3e5b","print(8 - 5)");
//
//        Chapter chapter30 = new Chapter(30,new Tuple("Scripting And Web Scripting",3)," (Scripting And Web Scripting - LVL 3) To divide (and conquer) you can use '/'. ",false , "0.5" ,
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
//        chapters.add(chapter6);
//        chapters.add(chapter7);
//        chapters.add(chapter8);
//        chapters.add(chapter9);
//        chapters.add(chapter10);
//        chapters.add(chapter11);
//        chapters.add(chapter12);
//        chapters.add(chapter13);
//        chapters.add(chapter14);
//        chapters.add(chapter15);
//        chapters.add(chapter16);
//        chapters.add(chapter17);
//        chapters.add(chapter18);
//        chapters.add(chapter18);
//        chapters.add(chapter20);
//        chapters.add(chapter21);
//        chapters.add(chapter22);
//        chapters.add(chapter23);
//        chapters.add(chapter24);
//        chapters.add(chapter25);
//        chapters.add(chapter26);
//        chapters.add(chapter27);
//        chapters.add(chapter28);
//        chapters.add(chapter29);
//        chapters.add(chapter30);
//
//
//        // ftiaxnw to TC
//        evaluationTest = new PractiseTests("Evaluation Test", chapters);
//
//        // paw stin firebase kai apothikeuw to todays challenge
//        uploadEvaluationTest(evaluationTest);

        evaluationTest = null;

        // pigeni stin firebase sto ref pou einai to evaluation test
        DatabaseReference ref = databaseReference.child("Evaluation test");

        // fortonei to evaluation challenge apo tin FB

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                evaluationTest = dataSnapshot.getValue(PractiseTests.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //kanei initialise ton adapter
        adapter = new SelectorStatePagerAdapter(getSupportFragmentManager());

        //vriskei to view pager
        mViewPager = findViewById(R.id.fragmentContainer);
        //vriskei to set up title
        title = findViewById(R.id.set_up_title);
        // vriskei to continue button
        continueButton = findViewById(R.id.continue_button);

        //ti tha ginete kathe fora pou o user pataei continue button
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // enimeronei to antikimeno tou user
                DataHelper.saveUserProfileToFB(getApplicationContext(), user);
                DataHelper.saveUserProfileToSP(getApplicationContext(), user);

                switch (mViewPager.getCurrentItem()){
                    case 0:
                        setViewPager(1);
                        //alazei to title tou kathe
                        title.setText(adapter.getTitle(mViewPager.getCurrentItem()));
                        break;
                    case 1:
                        //elenxei an o user thelei na kanei to evaluation test
                        ShowMessage("Do you want to do the evaluation test in order to help us" +
                                " understand the level of your python skills on each category and " +
                                "place you at the right level in order to avoid taking coerces that" +
                                " you are already know?",user);


                        break;
//                    case R.id.nav_profile:
//                        setViewPager(2);
//                        break;
                }

            }
        });

        // kanei setup ton viewPager
        setUpViewPager(mViewPager);
        title.setText(adapter.getTitle(mViewPager.getCurrentItem()));
    }

    // kalite apo to serUpUserCategoryFragment gia na enimerosei to category tou user
    public void setUserCategory(UserCategories category){
        user.setUserType(category);
    }

    // kalite apo to setUpUserPreferencesFragment gia na kanei setup ta preferences tou user
    // kai na arxikopoiisei ta level tou user se kathe kategori (ola level 1 gia arxi)
    public void setUserPreferences(List<Tuple> usersLevel, List<CourseCategory> preferences){
        user.setUserLevels(usersLevel);
        user.setUserPreferences(preferences);
    }

    // method gia na kanei setup ton viewPager
    //i sira pou dilwnw ta fragment einai poli simantiki
    //gt to proto fragment pou dilwnw tha einai to default
    private void setUpViewPager(ViewPager viewPager){
        adapter.addFragment(new SetUpUserCategoryFragment() , "Which one is most like you?");
        adapter.addFragment(new SetUpUserPreferencesFragment(), "Which python topics are interested you most?");
        //adapter.addFragment(new MainProfileFragment(), "Evaluating your python skills!");
        viewPager.setAdapter(adapter);
    }

    //methodos gia na kanei set poio fragment trexei ston viewPager
    //einai pablic gia na mporoun na tin kalesoun ola ta fragment
    //prokimenou na mporw na paw apo to ena fragment sto alo
    public void setViewPager(int fragmentIndex){
        //tou lew poio apo ta fragment pou exw fortosei ston viewpager thelw
        // na metaferw (diladi thelw na emfanisw)
        mViewPager.setCurrentItem(fragmentIndex);
    }

    // To dialog pou rotaei ton xristi an thelei na kanei to evaluation test
    public void ShowMessage(String s, final User user){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Evaluation Test!");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                //metatrepw to Today's Challenge se jason gia na to stilw sto intent
                Gson gson = new Gson();
                String json = gson.toJson(evaluationTest);

                // ftiaxnw to intent
                Intent intent = new Intent(getApplicationContext(), PracticeActivity.class);
                intent.putExtra(SetUpProfileActivity.EXTRA_EVALUATION_TEST, json);
                startActivity(intent);

                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //fortonei ton current user
                User currentUser = DataHelper.loadUserProfileFromSP(getApplicationContext());
                // elengxei an einai admin i aplos user
                if (currentUser.getUserType().getTitle().equals("Admin")) {
                    startActivity(new Intent(getApplicationContext(), AdminActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });
        builder.setMessage(s);
        builder.show();
    }

    // kanei upload stin fb to evaluation test
    public void uploadEvaluationTest(PractiseTests test){
        //paw stin dieuthinsei tis firebase pou exw fiaksi
        //kai dimiourgw ena child node to opoio tha apothikeuei ta tests
        DatabaseReference Ref = databaseReference.child("Evaluation test");

        //pame mesa sto practice test tis firebase kai vazoume to kenourio course
        // DatabaseReference newMessageRef = messageRef.push();
        Ref.setValue(test);
    }
}