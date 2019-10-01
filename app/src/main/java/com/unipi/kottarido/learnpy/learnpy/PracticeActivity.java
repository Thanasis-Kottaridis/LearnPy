package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PracticeActivity extends AppCompatActivity {

    // bundle keys
    public static final String TEST_TITLE_KEY = "test title";
    public static final String USER_SCORE_KEY = "user score";
    public static final String FULL_TEST = "full course";

    private Intent intent;

    // instance tou user pou einai sindedemenos
    private User currentUser;

    private PractiseTests test;
    private List<Chapter> chapters;

    //boolean metavliti gia to an einai to test a3iologisis i oxi
    private boolean isEvaluationTest;

    // gia to help
    private Toolbar toolbar;

    //  text View tou test
    private TextView testTitle;

    // vriskei ton view pager pou tha provalei ta fragments
    private NonSwipeableViewPager mViewPager;

    // o adapter tou view pager
    private ChaptersSliderAdapter chaptersSliderAdapter;

    // adapter gia provoli tou success i failed fragment
    // xrisimopoio ton idio adapter pou xrisimopoiisa gia sign in sign up
    private SelectorStatePagerAdapter adapter;

    // metavliti pou krataei to score tou user sto quiz
    private int userScore;

    //list which holds a HasMap of user Answers (int chapter position, int answer correct = 0 ,false = 1)
    private List<HashMap<String,Integer>> userAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        //ftiaxnei to help stin toollbar
        toolbar = findViewById(R.id.activity_practice_toolBar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        // initialise userAnswers
        userAnswers = new ArrayList<>();


        // fortonei to intent apo to opoio klithike auto to test
        intent = getIntent();

        // elenxoume an to intent exei extras (sigkekrimena an exei EXTRA_COURSES_COURSE)
        if(intent.hasExtra(MainActivity.EXTRA_PRACTICE_TEST)){
            // diavazei to course apo to intent
            test = getTest(intent, MainActivity.EXTRA_PRACTICE_TEST);

            // arxikopoiei to score me 0
            userScore = 0;

            // kanei false to oti einai to evaluation test
            isEvaluationTest = false;

            // fortonei ta chapters apo to test
            chapters = test.getChapters();

            // anakateuei ta chapters
            Collections.shuffle(chapters);
        }
        else if(intent.hasExtra(SetUpProfileActivity.EXTRA_EVALUATION_TEST)){
            // diavazei to course apo to intent
            test = getTest(intent, SetUpProfileActivity.EXTRA_EVALUATION_TEST);

            // arxikopoiei to score me 0
            userScore = 0;

            // kanei true oti einai to evaluation test
            isEvaluationTest = true;

            // fortonei ta chapters apo to test
            chapters = test.getChapters();
        }

        // fortonei ton user pou einai sindedemenos apo ta shared prefs me tin voithia tou data helper
        currentUser = DataHelper.loadUserProfileFromSP(this);

        // vriskei ta views tou activity
        testTitle = findViewById(R.id.test_title_PracticeActivity);
        mViewPager = findViewById(R.id.chapters_viewPager);

        // emfanizei ton titlo tou test
        testTitle.setText(test.getTitle());

        // kanw initialise ton adapter kai tou pernaw ta chapters san orisma

        chaptersSliderAdapter = new ChaptersSliderAdapter(this, chapters);

        //kanw set ton adapter
        mViewPager.setAdapter(chaptersSliderAdapter);

        chaptersSliderAdapter.setOnNextClickListener(new ChaptersSliderAdapter.OnNextClickListener() {
            @Override
            public void onNextClick(boolean isCorrect, int position, String correctAns, Chapter chapter) {
                //an i apantisi einai sosti au3anei to score kata 10
                if (isCorrect){
                    // elenxei an einai aplo test i evaluatin test
                    if(isEvaluationTest){
                        for(Tuple categoryLevel : currentUser.getUserLevels()){
                            if(categoryLevel.x.equals(chapters.get(position).getChapterInfo().x))
                                categoryLevel.setY(categoryLevel.y+1);
                        }
                        Toast.makeText(getApplicationContext()," the answer is correct!",Toast.LENGTH_LONG).show();
                    }
                    else {
                        //creates a new hash map for this answer
                        HashMap<String,Integer> ans = new HashMap<>();
                        ans.put("position",position);
                        ans.put("answer",0);

                        // addds the ans at the answer list
                        userAnswers.add(ans);

                        //update the score in this test
                        userScore = userScore + 10;
                        Toast.makeText(getApplicationContext()," the answer is correct!",Toast.LENGTH_LONG).show();
                    }

                }
                else if (!isCorrect){
                    //creates a new hash map for this answer
                    HashMap<String,Integer> ans = new HashMap<>();
                    ans.put("position",position);
                    ans.put("answer",1);

                    // addds the ans at the answer list
                    userAnswers.add(ans);

                    ShowMessage("Your answer is wrong! The correct answer is: \n "+correctAns);
                }

                if(chapters.size() > position + 1){
                    mViewPager.setCurrentItem(position + 1);
                }
                // ti tha kanei an einai to evaluation test
                else if (isEvaluationTest){
                    // enimeronei ton user stin FB kai sta SP
                    DataHelper.saveUserProfileToFB(getApplicationContext(), currentUser);
                    DataHelper.saveUserProfileToSP(getApplicationContext(), currentUser);

                    //kanei initialise ton adapter
                    adapter = new SelectorStatePagerAdapter(getSupportFragmentManager());
                    // kanei pali setup ton viewpager gia na provalei ta fragments
                    setUpViewPager(mViewPager);
                    //provalei to fragment epitixous oloklirosis tou evaluation test
                    mViewPager.setCurrentItem(3);
                }
                // ama einai sto telefteo quiz ( diladi teliose to course)
                else {
                    // elengxei an o user perase to course me epitixia
                    // diladi an sigkentrose score > (chapters.size() * 10)/2
                    int lowPass = (chapters.size() * 10) / 2;
                    if (userScore >= lowPass){
                        currentUser.completePracticeTest(test,userScore);

                        // enimeronei to profile tou user kai stin FB kai sta SP
                        DataHelper.saveUserProfileToFB(getApplicationContext(), currentUser);
                        DataHelper.saveUserProfileToSP(getApplicationContext(), currentUser);


                        //kanei initialise ton adapter
                        adapter = new SelectorStatePagerAdapter(getSupportFragmentManager());
                        // kanei pali setup ton viewpager gia na provalei ta fragments
                        setUpViewPager(mViewPager);
                        //provalei to fragment epitixous oloklirosis
                        mViewPager.setCurrentItem(0);
                    }
                    else {
                        //enimeronei oti o user 3ekinise neo course
                        currentUser.startPracticeTest(test);
                        // enimeronei to profile tou user kai stin FB kai sta SP
                        DataHelper.saveUserProfileToFB(getApplicationContext(), currentUser);
                        DataHelper.saveUserProfileToSP(getApplicationContext(), currentUser);

                        //kanei initialise ton adapter
                        adapter = new SelectorStatePagerAdapter(getSupportFragmentManager());
                        // kanei pali setup ton viewpager gia na provalei ta fragments
                        setUpViewPager(mViewPager);
                        //provalei to fragment mi epitixous oloklirosis
                        mViewPager.setCurrentItem(1);
                    }

                    // updates user answers at FB
                    updateUserAnswer();
                }
            }
        });
    }


    //methodos gia na diavazei to test apo to intent
    private PractiseTests getTest(Intent intent, String extra){
        //fortwnw apo to to intent to test
        Gson gson = new Gson();
        //diavazei tin sting timi pou einai apotikeumenei sto intent
        String json = intent.getStringExtra(extra);
        //dilwnw ton tipo pou tha ginei metatropei to string pou diavasa
        Type type = new TypeToken<PractiseTests>(){}.getType();
        //ftiaxnw to gason metatrepontas to string sto type pou orisa
        return gson.fromJson(json,type);
    }

    // method gia na kanei setup ton viewPager
    // i sira pou tha dilosw ta fragments mesa stin setUpPager
    // einai simantiki gti to proto einai auto pou tha emfanizete san default
    private void setUpViewPager(ViewPager viewPager){
        Bundle bundle = new Bundle();
        bundle.putString(TEST_TITLE_KEY,test.getTitle());
        bundle.putInt(USER_SCORE_KEY, userScore);

        // vazei olokliro to course sto bundle gia tin periptosi
        // pou o xristis kanei fail to course kai thelei na to 3anakanei epitopou
        bundle.putString(FULL_TEST,intent.getStringExtra(MainActivity.EXTRA_PRACTICE_TEST));

        // to fragment pou tha provalei se periptosi pou exoume epitiximeni epilisi tou course
        CompleteTestSuccessfullyFragment completeSuccessfully = new CompleteTestSuccessfullyFragment();
        completeSuccessfully.setArguments(bundle);

        // to fragment pou tha provalei se periptosi pou o user den kataferei na perasei to course
        CompleteTestUnsuccessfullyFragment completeUnsuccessfully = new CompleteTestUnsuccessfullyFragment();
        completeUnsuccessfully.setArguments(bundle);

        // to fragmet pou tha provalei se periptosi pou o user oloklirosei to evaluation test
        CompleteEvaluationSuccessfullyFragment completeEvaluationSuccessfully = new CompleteEvaluationSuccessfullyFragment();


        adapter.addFragment(completeSuccessfully, "CompleteTestSuccessfullyFragment");
        adapter.addFragment(completeUnsuccessfully, "CompleteUnsuccessfullyFragment");
        adapter.addFragment(completeEvaluationSuccessfully,"CompleteEvaluationSuccessfullyFragment");
        viewPager.setAdapter(adapter);
    }

    public void ShowMessage(String s){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Wrong Answer!");
        builder.setMessage(s);
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.help_menu_blue, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_help_blue:
                startActivity(new Intent(getApplicationContext(), HelpActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void updateUserAnswer(){

        for (HashMap<String,Integer>userAns : userAnswers){
            //finds which chapter user just answer
            Chapter chapter = chapters.get(userAns.get("position"));


            // gets the instance of the firebase answers
            FirebaseDatabase database = FirebaseDatabase.getInstance();

            //gets the firebase root reference and creates a child named answers
            // then it creates a path like (courseCategory/course/user/answers)
            DatabaseReference databaseRef = database.getReference();

            try {
                DatabaseReference Ref = databaseRef.child("Answers")
                        .child(chapter.getChapterInfo().getX())
                        .child(String.valueOf(chapter.getChapterInfo().getY()))
                        .child(removeSpacialCaracters(currentUser.getEmail()))
                        .child(String.valueOf(chapter.getChapterID()));
                Ref.setValue(userAns.get("answer"));
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }

    }


    private String removeSpacialCaracters(String userEmail){
        //remove special characters from email
        String userID = "";
        for(int i = 0 ; i<userEmail.length(); i++) {
            if (!(userEmail.charAt(i) == '@' || userEmail.charAt(i) == '.' || userEmail.charAt(i) == '_' || userEmail.charAt(i) == '-')) {
                userID = userID + userEmail.charAt(i);
            }
        }
        return userID;
    }
}
