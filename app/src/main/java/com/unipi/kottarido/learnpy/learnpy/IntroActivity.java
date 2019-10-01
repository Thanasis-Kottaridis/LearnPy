package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity{

    private ViewPager mSlideViewPager;
    private LinearLayout dotsContainerLayoout;

    private IntroSliderAdapter introSliderAdapter;

    //ftiaxnw ena array apo textView pou tha krataei mesa tis DOTS
    private TextView[] mDots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //vriskei ta views apo to layout tis intro activity
        mSlideViewPager = findViewById(R.id.slides_viewPager);
        dotsContainerLayoout = findViewById(R.id.dotsContainer);

        //kanw initialise ton IntroSliderAdapter kai tou pernaw to context
        introSliderAdapter = new IntroSliderAdapter(this);

        //kanw set ton adapter sto viewPager
        mSlideViewPager.setAdapter(introSliderAdapter);

        //kaloume ton addDotsIndicator gia na ftia3ei ta dots
        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if(i == introSliderAdapter.getCount()-1){
                    dotsContainerLayoout.removeAllViews();

                    //ftiaxnw dinamika to get started button! me kodika java
                    //ftiaxnw to layout tou koumpiou
                    Button getStartedButton = new Button(getApplicationContext());
                    getStartedButton.setText("Get Started");
                    getStartedButton.setTextColor(getResources().getColor(R.color.learnPyLightBlue));
                    getStartedButton.setAllCaps(false);
                    getStartedButton.setBackground(getDrawable(R.drawable.buttonstyle));

                    //ftiaxnw onclick event tou koumpiou
                    getStartedButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //anigei to sign in activity
                            startActivity(new Intent(getApplicationContext(),AuthenticationActivity.class));
                            // kai termatizei auto
                            finish();
                        }
                    });

                    //vazw na apexei apo to telos 20 dp vazontas padding ston container
                    dotsContainerLayoout.setPadding(0,0,0,20);

                    //prostheti to button mazi me to layout tou sto dotsContainerLayout
                    dotsContainerLayoout.addView(getStartedButton);
                }
                else
                    addDotsIndicator(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    // ftiaxnoume tin method pou tha ftiaxnei tis telites sto kato meros tou slide
    // pou tha dixnoun se poio slide imaste kai posa einai sinolika ta slides
    // dexete kai san orisma se pio slide vriskomaste gia na xromatizei tin antistixi telia pio skoura
    public  void addDotsIndicator(int position){
        // kanei instantiate to array
        mDots = new TextView[introSliderAdapter.getCount()];
        dotsContainerLayoout.removeAllViews();

        //gia kathe stixio tou array (pou einai osa ta dots)
        for (int i = 0; i < mDots.length; i++){
            //dimiourgei ena textview
            mDots[i] = new TextView(this);
            //tou vazei gia text kodika html pou anaparista tin telista
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            if(i == position)
                mDots[i].setTextColor(getResources().getColor(R.color.tab_indicator_gray));
            else
                mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            dotsContainerLayoout.addView(mDots[i]);
        }

    }
}
