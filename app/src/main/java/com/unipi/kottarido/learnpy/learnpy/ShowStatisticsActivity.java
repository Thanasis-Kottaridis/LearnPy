package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.HttpsCallableResult;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowStatisticsActivity extends AppCompatActivity {

    // lists
    private List<User> users;
    private List<Courses> courses;
    private List<PractiseTests> tests;

    // gia to help
    private Toolbar toolbar;

    // orizw firbasedatabe gia ta practice tests
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    // firebase cloud functions instance
    private FirebaseFunctions firebaseFunctions;

    // views gia tous top users
    private TextView top1User;
    private TextView top2User;
    private TextView top3User;

    // views for most wanted categories
    private TextView mostWantedCategory1;
    private TextView mostWantedCategory2;
    private TextView mostWantedCategory3;

    // views gia ta most difficult tests
    private TextView mostDifficultCategories1;
    private TextView mostDifficultCategories2;
    private TextView mostDifficultCategories3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_statistics);

        // vriskw ta views
        // gia top users
        top1User = findViewById(R.id.top1_user_email);
        top2User = findViewById(R.id.top2_user_email);
        top3User = findViewById(R.id.top3_user_email);

        // gia most difficult courses
        mostWantedCategory1 = findViewById(R.id.most_wanted_categories_1);
        mostWantedCategory2 = findViewById(R.id.most_wanted_categories_2);
        mostWantedCategory3 = findViewById(R.id.most_wanted_categories_3);

        // gia ta most difficult tests
        mostDifficultCategories1 = findViewById(R.id.most_difficult_categories_1);
        mostDifficultCategories2 = findViewById(R.id.most_difficult_categories_2);
        mostDifficultCategories3 = findViewById(R.id.most_difficult_categories_3);


        //ftiaxnei to help stin toollbar
        toolbar = findViewById(R.id.show_statistics_toolBar);
        setSupportActionBar(toolbar);

        //initialize to instance tis FirebaseDatabase
        // pernei kai to reference stin database apo to opoio tha kanoume read kai write
        //meso tou instance pou dimiourgisame
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        firebaseFunctions = FirebaseFunctions.getInstance();

        users = new ArrayList<>();
        courses = new ArrayList<>();
        tests = new ArrayList<>();

        // fortonei tous uses apo tin vasi
        // pigeni stin firebase sto ref pou einai oi users
        DatabaseReference Ref = databaseReference.child("Users");

        getTopUsers();

        getMostWantedCategories();

        getMostDifficultCategories();

        // diavazei ta courses pou einai apothikeumena stin FB
        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
        // i kathe fora pou kanei launce i euarmogi
//        Ref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                // adiazei tin courses
//                users = new ArrayList<>();
//
//                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton messages
//                //kai ma sto epistrefei opou kathe children autou tou snapshot einai enas user
//
//                for (DataSnapshot ds : dataSnapshot.getChildren()) {
//                    User m = ds.getValue(User.class);
//                    users.add(m);
//                }
//                findTopUsers();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//        // fortonei tous uses apo tin vasi
//        // pigeni stin firebase sto ref pou einai oi users
//        DatabaseReference courseRef = databaseReference.child("courses");
//
//        // diavazei ta courses pou einai apothikeumena stin FB
//        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
//        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
//        // i kathe fora pou kanei launce i euarmogi
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
//                findMostDifficultCourses();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//        // fortonei tous uses apo tin vasi
//        // pigeni stin firebase sto ref pou einai oi users
//        DatabaseReference testRef = databaseReference.child("practice test");
//
//        // diavazei ta courses pou einai apothikeumena stin FB
//        // ftiaxnoume enan listener gia na diavazei ta messages apo tin FB
//        // kathe fora pou ginete alagi sta data(prosthiki/ tropopioisi)
//        // i kathe fora pou kanei launce i euarmogi
//        testRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                // adiazei tin courses
//                tests = new ArrayList<>();
//
//                //kathe fora pou alazei kati sta dedomena  travaei ena snapshot ton messages
//                //kai ma sto epistrefei opou kathe children autou tou snapshot einai enas user
//
//                for (DataSnapshot ds : dataSnapshot.getChildren()) {
//                    PractiseTests m = ds.getValue(PractiseTests.class);
//                    tests.add(m);
//                }
//                findMostDifficultTests();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });


    }


    // method who calls getTopUsers cloud function
    private Task<String> getTopUsers() {
        // create the arguments to the callable function


        // map works as a lists were each element is a tuple (key,value)
        Map<String, Object> data = new HashMap<>();
        data.put("push", true); // pass any data in map

        return firebaseFunctions
                .getHttpsCallable("getTopUsers")
                .call(data)
                .continueWith(new Continuation<HttpsCallableResult, String>() {
                    @Override
                    public String then(@NonNull Task<HttpsCallableResult> task) {
                        // This continuation runs on either success or failure, but if the task
                        // has failed then getResult() will throw an Exception which will be
                        // propagated down.
                        String topUsersJson = (String) task.getResult().getData();

                        //converts the string to a list of practice recommendation objects
                        List<User> topUsers = getTopUsersFromJson(topUsersJson);

                        top1User.setText("1st: " + topUsers.get(0).getEmail());
                        top2User.setText("2nd: " + topUsers.get(1).getEmail());
                        top3User.setText("3rd: " + topUsers.get(2).getEmail());


                        //Toast.makeText(getApplicationContext(), "OK!!!!", Toast.LENGTH_LONG).show();
                        return topUsersJson;
                    }
                });
    }

    // this method gets the top users json and convert it into a user List
    private List<User> getTopUsersFromJson(String json) {
        //fortwnw apo to to intent to test
        Gson gson = new Gson();
        //dilwnw ton tipo pou tha ginei metatropei to string pou diavasa
        Type type = new TypeToken<List<User>>() {
        }.getType();
        //ftiaxnw to gason metatrepontas to string sto type pou orisa
        return gson.fromJson(json, type);
    }

    // method who calls getMostWantedCategories cloud function
    private Task<String> getMostWantedCategories() {
        // create the arguments to the callable function


        // map works as a lists were each element is a tuple (key,value)
        Map<String, Object> data = new HashMap<>();
        data.put("push", true); // pass any data in map

        return firebaseFunctions
                .getHttpsCallable("getMostWantedCategories")
                .call(data)
                .continueWith(new Continuation<HttpsCallableResult, String>() {
                    @Override
                    public String then(@NonNull Task<HttpsCallableResult> task) {
                        // This continuation runs on either success or failure, but if the task
                        // has failed then getResult() will throw an Exception which will be
                        // propagated down.
                        String mostWantedCategoriesJson = (String) task.getResult().getData();

                        //converts the string to a list of MostWanted categories
                        List<MostWantedCategories> mostWantedCategories = getMostWantedCategoriesJson(mostWantedCategoriesJson);

                        mostWantedCategory1.setText("1st: " + mostWantedCategories.get(0).getCategory());
                        mostWantedCategory2.setText("2nd: " + mostWantedCategories.get(1).getCategory());
                        mostWantedCategory3.setText("3rd: " + mostWantedCategories.get(2).getCategory());


//                        Toast.makeText(getApplicationContext(), "OK!!!!", Toast.LENGTH_LONG).show();
                        return mostWantedCategoriesJson;
                    }
                });
    }

    // this method gets the most wanted categories json and convert it into a List
    private List<MostWantedCategories> getMostWantedCategoriesJson (String json) {
        //fortwnw apo to to intent to test
        Gson gson = new Gson();
        //dilwnw ton tipo pou tha ginei metatropei to string pou diavasa
        Type type = new TypeToken<List<MostWantedCategories>>() {
        }.getType();
        //ftiaxnw to gason metatrepontas to string sto type pou orisa
        return gson.fromJson(json, type);
    }

    // method who calls getMostWantedCategories cloud function
    private Task<String> getMostDifficultCategories() {
        // create the arguments to the callable function


        // map works as a lists were each element is a tuple (key,value)
        Map<String, Object> data = new HashMap<>();
        data.put("push", true); // pass any data in map

        return firebaseFunctions
                .getHttpsCallable("getMostDifficultCategories")
                .call(data)
                .continueWith(new Continuation<HttpsCallableResult, String>() {
                    @Override
                    public String then(@NonNull Task<HttpsCallableResult> task) {
                        // This continuation runs on either success or failure, but if the task
                        // has failed then getResult() will throw an Exception which will be
                        // propagated down.
                        String mostWantedCategoriesJson = (String) task.getResult().getData();

                        //converts the string to a list of MostWanted categories
                        List<MostDifficultCategories> mostDifficultCategories = getMostDifficultCategories(mostWantedCategoriesJson);

                        mostDifficultCategories1.setText("1st: " + mostDifficultCategories.get(0).getCategory());
                        mostDifficultCategories2.setText("2nd: " + mostDifficultCategories.get(1).getCategory());
                        mostDifficultCategories3.setText("3rd: " + mostDifficultCategories.get(2).getCategory());


                        Toast.makeText(getApplicationContext(), "OK!!!!", Toast.LENGTH_LONG).show();

                        return mostWantedCategoriesJson;
                    }
                });
    }

    // this method gets the most Diffcult categories json and convert it into a List
    private List<MostDifficultCategories> getMostDifficultCategories (String json) {
        //fortwnw apo to to intent to test
        Gson gson = new Gson();
        //dilwnw ton tipo pou tha ginei metatropei to string pou diavasa
        Type type = new TypeToken<List<MostDifficultCategories>>() {
        }.getType();
        //ftiaxnw to gason metatrepontas to string sto type pou orisa
        return gson.fromJson(json, type);
    }

    // events gia to help sto toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.help_menu, menu);
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
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }


    // this class helps us to convert mostWantedCategories jason to objects and to display them
    public class MostWantedCategories{
        private String category;
        private String occurences;

        public MostWantedCategories(String category, String occurences) {
            this.category = category;
            this.occurences = occurences;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }

    public class MostDifficultCategories{
        private String category;
        private String percentage;

        public MostDifficultCategories(String category, String percentage) {
            this.category = category;
            this.percentage = percentage;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }
}
