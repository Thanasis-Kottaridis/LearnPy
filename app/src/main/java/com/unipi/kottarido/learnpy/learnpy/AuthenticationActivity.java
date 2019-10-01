package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AuthenticationActivity extends AppCompatActivity {

    //Log TAGS
    private static final String TAG = "AuthenticationActivity";


    //preference file
    public static final String PREF_FILE = "hared preferences";
    public static final String FIRST_LUNCH_KEY = "first lunch";

    private SharedPreferences preferences;

    // metavlites gia diaxirisi ton fragment se auto to activity
    private SelectorStatePagerAdapter adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        Log.d(TAG, "onCreate: started");

        //elenxos an einai to proto lunch gia na di3w to intro tis efarmogis
        preferences = this.getSharedPreferences(PREF_FILE, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        //elenxei an einai to proto lunch
        if(preferences.getBoolean(FIRST_LUNCH_KEY,true)){
            //enimeronei ta Sheared Preferences oti egine to proto lunch
            editor.putBoolean(FIRST_LUNCH_KEY, false);
            editor.commit();

            // mas paei sto intro Activity
            startActivity(new Intent(this, IntroActivity.class));
            // termatizei auto to activity
            finish();
        }
        //ean den einai to proto lunch mas metaferei sto SignInFragment
        //opou eki elenxete an o xristis einai sindedemenos(an einai paei automata sto mainActivity)
        else {

            //kanei initialise ton adapter
            adapter = new SelectorStatePagerAdapter(getSupportFragmentManager());

            // vriskei to view to viewPager
            mViewPager = findViewById(R.id.fragmentContainer);
            // kanei setup ton pager
            setUpViewPager(mViewPager);

        }


    }

    // method gia na kanei setup ton viewPager
    // i sira pou tha dilosw ta fragments mesa stin setUpPager
    // einai simantiki gti to proto einai auto pou tha emfanizete san default
    private void setUpViewPager(ViewPager viewPager){
        adapter.addFragment(new SignInFragment(), "SignInFragment");
        adapter.addFragment(new SignUpFragment(), "SignUpFragment");
        viewPager.setAdapter(adapter);
    }

    //auti i methodos kanei set to poio fragment trexei ston viewPager
    //kai einai public gia na mporei na klithei apo ola ta fragments
    // prokimenou na mporw na metaferthw apo to ena fragment sto alo
    public void setViewPager(int fragmentNumber){
        //tou lew poio fragment apo ta fragment pou exw perasei ston viewpager
        //thelw na metaferthw
        mViewPager.setCurrentItem(fragmentNumber);
    }

    // ti tha ginete sto patima tou android back button
    @Override
    public void onBackPressed() {
        //pernei to position tou current fragment
        int currentFragmentPos =  mViewPager.getCurrentItem();

        //elenxei an einai to fragment 0 tote kanei oti kanei to default back button
        if(currentFragmentPos == 0){
            super.onBackPressed();
        }
        // alios an einai se opoiodipote alo fragment
        else {
            //kanei to current item to fragment 0
            mViewPager.setCurrentItem(0);
        }
    }
}
