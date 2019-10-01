package com.unipi.kottarido.learnpy.learnpy;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class AdminActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_admin);

        //instantiate FirebaseAuth gia authentication
        mAuth=FirebaseAuth.getInstance();

        //kanei initialise ton adapter
        adapter = new SelectorPagerAdapter(getSupportFragmentManager());

        //vriskei to view pager
        mViewPager = findViewById(R.id.fragmentContainer_adminActivity);

        //vriskei to bottomNavigationView
        bottomNavigationView = findViewById(R.id.bottom_navigation_adminActivity);

        //ti tha ginete kathe fora pou enas user epilegi ena item tou BNV
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // kanoume ena switch case gia na vroume poio item patithike
                switch (item.getItemId()){
                    case R.id.admin_nav_practice:
                        setViewPager(0);
                        break;
                    case R.id.admin_nav_courses:
                        setViewPager(1);
                        break;
                    case R.id.admin_nav_profile:
                        setViewPager(2);
                        break;
                    case R.id.admin_nav_admin:
                        setViewPager(3);
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
        adapter.addFragment(new MainPractiseFragment() , "Today");
        adapter.addFragment(new MainCoursesCategoriesFragment(), "Courses");
        adapter.addFragment(new MainProfileFragment(), "Profile");
        adapter.addFragment(new MainAdminFragment(), "Admin");
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
}
