package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    //BUMDLE KEYS
    public static final String COURSE_CATEGORY_KEY = "course category";

    //EXTRAS FOR INTENT
    public static final String EXTRA_COURSES_COURSE = "com.unipi.kottarido.learnpy.learnpy.EXTRA_COURSE";
    public static final String EXTRA_PRACTICE_TEST = "com.unipi.kottarido.learnpy.learnpy.EXTRA_TODAYS_TEST";
    public static final String EXTRA_WEB_PAGE_TO_DISPLAY = "com.unipi.kottarido.learnpy.learnpy.EXTRA_WEB_PAGE_TO_DISPLAY";

    //Firebase vars
    private FirebaseAuth mAuth;

    // metavlites gia diaxirisi ton fragment se auto to activity
    private SelectorPagerAdapter adapter;
    private ViewPager mViewPager;

    // bottomNavigationView
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate FirebaseAuth gia authentication
        mAuth=FirebaseAuth.getInstance();

        //kanei initialise ton adapter
        adapter = new SelectorPagerAdapter(getSupportFragmentManager());

        //vriskei to view pager
        mViewPager = findViewById(R.id.fragmentContainer);

        //vriskei to bottomNavigationView
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        //ti tha ginete kathe fora pou enas user epilegi ena item tou BNV
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // kanoume ena switch case gia na vroume poio item patithike
                switch (item.getItemId()){
                    case R.id.nav_practice:
                        setViewPager(0);
                        break;
                    case R.id.nav_courses:
                        setViewPager(1);
                        break;
                    case R.id.nav_profile:
                        setViewPager(2);
                        break;
                }

                //true simenei oti theloume na epistrepsoume to clicked item
                return true;
            }
        });

        // kanei setup ton viewPager
        setUpViewPager(mViewPager);
    }

    // method gia na kanei setup ton viewPager
    //i sira pou dilwnw ta fragment einai poli simantiki
    //gt to proto fragment pou dilwnw tha einai to default
    private void setUpViewPager(ViewPager viewPager){
        adapter.addFragment(new MainPractiseFragment(), "Today");
        adapter.addFragment(new MainCoursesCategoriesFragment(), "CourseCategories");
        adapter.addFragment(new MainProfileFragment(), "Profile");
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

    public void goToCategoryCourses(CourseCategory category){
        // metatrepei to category se json

        Gson gson = new Gson();
        String json = gson.toJson(category);

        // vazei sto bundle to category pou epilextike apo ton xristi
//        Bundle bundle = new Bundle();
//        bundle.putString(COURSE_CATEGORY_KEY,json);

        // ftiaxnei to instance tou course fragment
        MainCourseFragment courseFragment = new MainCourseFragment();

        addCourseCategoryToSp(category);

        // kanei add to fragment ston adapter
        adapter.addFragment(courseFragment, "Courses");

        // kanei set ton adapter
        mViewPager.setAdapter(adapter);

        // kanei set up ton view pager
        setViewPager(3);
    }

    //add's course category to SP
    private void addCourseCategoryToSp(CourseCategory category){
        Gson gson = new Gson();
        String json = gson.toJson(category);

        // apothikeuei ton signed in user sta preferences me morfi json
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(DataHelper.PREF_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(COURSE_CATEGORY_KEY,json);
        editor.commit();
    }
}
