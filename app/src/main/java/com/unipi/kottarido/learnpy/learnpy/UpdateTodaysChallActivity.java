package com.unipi.kottarido.learnpy.learnpy;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UpdateTodaysChallActivity extends AppCompatActivity {

    // ta courses kai ta test tou sistimatos
    private List<Courses> courses;
    private List<PractiseTests>tests;

    // ta courses pou tha simperilifthoun sto today's chall
    private List<Courses> TCCourses;

    // gia to help
    private Toolbar toolbar;

    // orizw firbasedatabese gia ta cources
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    //gia to RecycleView
    private RecyclerView mView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_todays_chall);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        //ftiaxnei to help stin toollbar
        toolbar = findViewById(R.id.update_todays_chall_toolBar);
        setSupportActionBar(toolbar);

        courses = new ArrayList<>();
        tests = new ArrayList<>();
        TCCourses = new ArrayList<>();

        // pigeni stin firebase sto ref pou einai ta courses
        DatabaseReference coursesRef = databaseReference.child("courses");

        // diavazei ta courses pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi
        coursesRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // adiazei tin courses
                courses = new ArrayList<>();

                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton messages
                //kai ma sto epistrefei opou kathe children autou tou snapshot einai ena course

                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    Courses m = ds.getValue(Courses.class);
                    courses.add(m);

                    //enimeronei ta messages ston adapter gia na ta kanei desplay sto Recycle view
                    ((UpdateTodaysChallRVAdapter) mAdapter).setCources(courses);
                    mView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // pigeni stin firebase sto ref pou einai ta courses
        DatabaseReference practiceTestRef = databaseReference.child("practice test");

        // diavazei ta practice pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi
        practiceTestRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //adiazei ta tests
                tests = new ArrayList<>();

                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton practice tests
                //kai ma sto epistrefei opou kathe children autou tou snapshot einai ena course

                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    PractiseTests m = ds.getValue(PractiseTests.class);
                    tests.add(m);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // kanei setup to recycler view
        // vriskoume to recycler view
        mView = findViewById(R.id.update_todays_chall_recycler_view);

        // ftiaxnoume ton layout manager
        // diladi pos tha diaxirizete to layout you recycler view
        // o GrigdLayoutManager leei oti se kathe grami tou recycler view tha eixei 2 items
        mlayoutManager = new LinearLayoutManager(this);
        mView.setLayoutManager(mlayoutManager);

        //kanoume instantiate ton adapter pou dimiourgisame
        //kai pername ton adapter sto recycler view
        //me auton ton tropo leme pos na xiristei ta items

        mAdapter = new UpdateTodaysChallRVAdapter(courses);
        mView.setAdapter(mAdapter);

        // sto patima tou view
        // ftiaxnw to event sto onClick tou kathe item tou recycler view
        // to opoio einai to interface pou ftia3ame sto CoursesRecyclerView
        ((UpdateTodaysChallRVAdapter) mAdapter).setOnItemClickListener(new UpdateTodaysChallRVAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Courses course) {
               ShowMessage("Are you sure you want to add the course: "+course.getTitle()+" to Today's Challenge?", course);
            }
        });

    }

    // events gia to help sto toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.update_todays_chall_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_help:
                Intent intent = new Intent(getApplicationContext(), HelpActivity.class);
                intent.putExtra(MainActivity.EXTRA_WEB_PAGE_TO_DISPLAY,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/OnlineHelp%2Fadmin_manual.htm?alt=media&token=6a2df902-3b55-4a9a-9afa-f5df16f558f3");
                startActivity(intent);
                return true;
            case R.id.menu_update_chall:
                // ftiaxnei tin lista me ta chapters tou TC
                List<Chapter> TCCapters = new ArrayList<>();

                // pernei ola ta chapters
                for(Courses course : TCCourses){
                    for (PractiseTests test : tests)
                    {
                        if (course.getTitle().equals(test.getCourse())){
                            TCCapters.addAll(test.getChapters());
                        }
                    }
                }

                // anakateuei ta chapters
                Collections.shuffle(TCCapters);

                // elengxos an o admin exei epile3ei toulaxiston 2 kefalea
                if(TCCapters.size() > 9){
                    // apothikeuei to todays chall stin FB
                    uploadTC(new PractiseTests("Today's Challenge", TCCapters.subList(0,9)));
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setCancelable(true);
                    builder.setTitle("Update Completed!");
                    builder.setMessage("Today's challenge updated successfully!");
                    builder.show();

                    finish();
                }
                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setCancelable(true);
                    builder.setTitle("Error!");
                    builder.setMessage("You need to select at least 2 courses in order to update today's challenge");
                    builder.show();
                }

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void ShowMessage(String s, final Courses course){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Add Admin!");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TCCourses.add(course);
                courses.remove(course);

                //enimeronei ta messages ston adapter gia na ta kanei desplay sto Recycle view
                ((UpdateTodaysChallRVAdapter) mAdapter).setCources(courses);
                mView.setAdapter(mAdapter);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setMessage(s);
        builder.show();
    }

    public void uploadTC(PractiseTests test){
        //paw stin dieuthinsei tis firebase pou exw fiaksi
        //kai dimiourgw ena child node to opoio tha apothikeuei ta courses
        DatabaseReference Ref = databaseReference.child("today's challenge");

        //pame mesa sto Courses tis firebase kai vazoume to kenourio course
        // DatabaseReference newMessageRef = messageRef.push();
        Ref.setValue(test);
    }

}
