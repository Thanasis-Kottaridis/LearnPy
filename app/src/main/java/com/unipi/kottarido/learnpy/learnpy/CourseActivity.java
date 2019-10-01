package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseActivity extends AppCompatActivity {

    // bundle keys
    public static final String COURSE_TITLE_KEY = "course title";
    public static final String USER_SCORE_KEY = "user score";
    public static final String FULL_COURSE = "full course";

    private Intent intent;

    // instance tou user pou einai sindedemenos
    private User currentUser;

    private Courses course;
    private List<Chapter> chapters;

    // gia to help
    private Toolbar toolbar;

    // Image view kai text View tou course
    private ImageView courseThumbnail;
    private TextView courseTitle;

    // vriskei ton view pager pou tha provalei ta fragments
    private NonSwipeableViewPager mViewPager;

    // o adapter tou view pager
    private ChaptersSliderAdapter chaptersSliderAdapter;

    // adapter gia provoli tou success i failed fragment
    // xrisimopoio ton idio adapter pou xrisimopoiisa gia sign in sign up
    private SelectorStatePagerAdapter adapter;

    // metavliti pou krataei to score tou user sto quiz
    private int userScore;

    // HashMap  who stores user answers <courseID, answer> (answer: 1 = wrong 0 = right)
    private HashMap<String, Object> userAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        //ftiaxnei to help stin toollbar
        toolbar = findViewById(R.id.activity_course_toolBar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        // fortonei to intent apo to opoio klithike auto to course
        intent = getIntent();

        // elenxoume an to intent exei extras (sigkekrimena an exei EXTRA_COURSES_COURSE)
        if(intent.hasExtra(MainActivity.EXTRA_COURSES_COURSE)){
            // diavazei to course apo to intent
            course = getCourse(intent);

            // arxikopoiei to score me 0
            userScore = 0;

            // initialise user ansewrs
            userAnswers = new HashMap<>();
        }

        // fortonei ton user pou einai sindedemenos apo ta shared prefs me tin voithia tou data helper
        currentUser = DataHelper.loadUserProfileFromSP(this);

        // vriskei ta Views tou activity
        courseThumbnail = findViewById(R.id.course_thumbnail_CourseActivity);
        courseTitle = findViewById(R.id.course_title_CourseActivity);
        mViewPager = findViewById(R.id.chapters_viewPager);

        // emfanzisei ton titlo tis course
        courseTitle.setText(course.getTitle());

        // fortonei ta chapters tis enotitas
        chapters = course.getChapters();

        // kanw initialise ton adapter kai tou pernaw to context kai tin list me ta chapters
        chaptersSliderAdapter = new ChaptersSliderAdapter(this, chapters);

        // kanw set ton adapter
        mViewPager.setAdapter(chaptersSliderAdapter);

        ((ChaptersSliderAdapter) chaptersSliderAdapter).setOnNextClickListener(new ChaptersSliderAdapter.OnNextClickListener() {
            @Override
            public void onNextClick(boolean isCorrect, int position, String correctAns, Chapter chapter) {
                // finds out chapters id
                int chapterID = chapter.getChapterID();

                //an i apantisi einai sosti au3anei to score kata 10
                if (isCorrect){
                    userScore = userScore + 10;
                    Toast.makeText(getApplicationContext()," the answer is correct!",Toast.LENGTH_LONG).show();
                    userAnswers.put(String.valueOf(chapterID),0);
                }
                else if (!isCorrect){
                    ShowMessage("Your answer is wrong! The correct answer is: \n "+correctAns);
                    userAnswers.put(String.valueOf(chapterID),1);
                }

                if(chapters.size() > position + 1){
                    mViewPager.setCurrentItem(position + 1);
                }
                // ama einai sto telefteo quiz ( diladi teliose to course)
                else {
                    // elengxei an o user perase to course me epitixia
                    // diladi an sigkentrose score > (chapters.size() * 10)/2
                    int lowPass = (chapters.size() * 10) / 2;
                    if (userScore >= lowPass){
                        currentUser.completeCourse(course, userScore);

                        // checks if with the completion of this course increases user level on this course category
                        // and if yes increase his category level by one
                        for(Tuple userlevel : currentUser.getUserLevels()){
                            if(userlevel.getX().equals(course.getCourseCategory())){
                                if (userlevel.getY() < 5 && userlevel.getY() == course.getLevel())
                                    userlevel.setY(userlevel.getY()+1);
                            }
                        }

                        // uploads user answers to Firebase
                        uploadUserAnswers();

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
                        currentUser.startCources(course);

                        // uploads user answers to Firebase
                        uploadUserAnswers();

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

                }
            }
        });


    }

    //methodos gia na diavazei to course apo to intent
    private Courses getCourse(Intent intent){
        //fortwnw apo to to intent to userProfile
        Gson gson = new Gson();
        //diavazei tin sting timi pou einai apotikeumenei sto intent
        String json = intent.getStringExtra(MainActivity.EXTRA_COURSES_COURSE);
        //dilwnw ton tipo pou tha ginei metatropei to string pou diavasa
        Type type = new TypeToken<Courses>(){}.getType();
        //ftiaxnw to gason metatrepontas to string sto type pou orisa
        return gson.fromJson(json,type);
    }

    // method gia na kanei setup ton viewPager
    // i sira pou tha dilosw ta fragments mesa stin setUpPager
    // einai simantiki gti to proto einai auto pou tha emfanizete san default
    private void setUpViewPager(ViewPager viewPager){
        Bundle bundle = new Bundle();
        bundle.putString(COURSE_TITLE_KEY,course.getTitle());
        bundle.putInt(USER_SCORE_KEY, userScore);

        // vazei olokliro to course sto bundle gia tin periptosi
        // pou o xristis kanei fail to course kai thelei na to 3anakanei epitopou
        bundle.putString(FULL_COURSE,intent.getStringExtra(MainActivity.EXTRA_COURSES_COURSE));

        // to fragment pou tha provalei se periptosi pou exoume epitiximeni epilisi tou course
        CompleteSuccessfullyFragment completeSuccessfully = new CompleteSuccessfullyFragment();
        completeSuccessfully.setArguments(bundle);

        // to fragment pou tha provalei se periptosi pou o user den kataferei na perasei to course
        CompleteUnsuccessfullyFragment completeUnsuccessfully = new CompleteUnsuccessfullyFragment();
        completeUnsuccessfully.setArguments(bundle);

        adapter.addFragment(completeSuccessfully, "CompleteSuccessfullyFragment");
        adapter.addFragment(completeUnsuccessfully, "CompleteUnsuccessfullyFragment");
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

    // method which uploades user answers to firebase
    private void uploadUserAnswers(){
        // gets the instance of the firebase answers
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        //gets the firebase root reference and creates a child named answers
        // then it creates a path like (courseCategory/course/user/answers)
        DatabaseReference databaseRef = database.getReference();
        DatabaseReference Ref = databaseRef.child("Answers")
                .child(course.getCourseCategory())
                .child(String.valueOf(course.getLevel()))
                .child(removeSpacialCaracters(currentUser.getEmail()));

        // upload/update hashMap data to firebase
        Ref.updateChildren(userAnswers);
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
