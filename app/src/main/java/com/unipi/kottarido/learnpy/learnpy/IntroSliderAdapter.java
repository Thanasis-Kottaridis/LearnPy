package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class IntroSliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    //Arrays me ta stixia tou kathe slide
    private int slide_images[] = {
            R.drawable.code_icon_transparent,
            R.drawable.study_icon_transparent,
            R.drawable.community_icon_transparent
    };

    private String[] slide_headings = {
            "CODE",
            "LEARN",
            "COMMUNITY"
    };
    private String[] slide_descriptions = {
            "You look for a way to learn python from scratch ot to improve your python skills?",
            "But you find it difficult to study from lectures, books and videos? Learn more efficiently through short conceptional puzzles",
            "LearnPy used and loved by a great community! Learn from a vibrant community of students, researchers and professionals"
    };

    public IntroSliderAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    //xrisimopoieite gia na prosthesoume (na kanoume inflate) ta items pou tha mpoun se kathe slide

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.intro_slide_layout,container,false);

        // kanw instansiate ta views pou iparxoun sto slide
        ImageView introSlideImageView = view.findViewById(R.id.introSlide_imageView);
        TextView introSlideHeadingTextView = view.findViewById(R.id.introSlideHeading_textView);
        TextView introDescriptionTextView = view.findViewById(R.id.introDescription_textView);

        //pernei tin eikona pou vriskete stin thesi position
        introSlideImageView.setImageResource(slide_images[position]);
        //pernei to heading pou vriskete stin thesi position
        introSlideHeadingTextView.setText(slide_headings[position]);
        //pernei to description pou vriskete stin thesi position
        introDescriptionTextView.setText(slide_descriptions[position]);

        //prosthetoume ston container to view pou ftia3ame
        container.addView(view);

        return view;
    }

    //auti i methodos den mas epitrepei na sinexisoume na scrolaroume slides
    // otan ftasoume sto teleftew!
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout) object);

    }
}
