package com.unipi.kottarido.learnpy.learnpy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class ChaptersSliderAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    // list pou periexei ta kefalea tis enotitas
    private List<Chapter> chapters;

    // flag gia na krataei tin apantisi tou user
    private String ans;

    // listener gia to patima tou next button
    private OnNextClickListener listener;


    // constructor tou adapter sto opoion pername to context kai tin lista me ta chapters
    public ChaptersSliderAdapter(Context context, List<Chapter> chapters) {
        this.context = context;
        this.chapters = chapters;
    }

    @Override
    public int getCount() {
        return chapters.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    // method gia na kanoume inflate ta itemes pou tha mpoune se kathe slide
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = null;
        // arxikopoiei to ans
        ans = null;
        if (chapters.get(position).isMultipleChoice()) {
            view = createMultipleChoiceItem(container, position);
        }
        else {
            view = createSelectTheCodeItem(container, position);
        }

        // kanw display to view ston container
        container.addView(view);
        return view;
    }

    //auti i methodos den mas epitrepei na sinexisoume na scrolaroume slides
    // otan ftasoume sto teleftew!
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }

    // methodos gia na dimiourgei multiple choice items
    private View createMultipleChoiceItem(ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.course_chapter_multiple_choice_layout, container, false);

        // vriskei ta view gia na provalei to chapter
        TextView chapterText = view.findViewById(R.id.showExplanation_textView);
        WebView displayCode = view.findViewById(R.id.displayCode_WebView);

        final Button ans1Button = view.findViewById(R.id.answer1_Button);
        final Button ans2Button = view.findViewById(R.id.answer2_Button);
        final Button ans3Button = view.findViewById(R.id.answer3_Button);
        Button checkButton = view.findViewById(R.id.check_Button);


        //kanei display to explanation tou chapter
        chapterText.setText(chapters.get(position).getExplanation());

        // kanei display ton kodika tou chapter sto web view
        displayCode.loadUrl(chapters.get(position).getCodeUrl());


        final multipleChoiceChapter chapter = chapters.get(position).getChapterType1();

        // fortonei ta answers apo to chapter se mia nea lista kai ta anakateuei
        List<String> answerList = chapter.getAnswers();
        Collections.shuffle(answerList);

        //kanei display ta answers sta buttons
        ans1Button.setText(answerList.get(0));
        ans2Button.setText(answerList.get(1));
        ans3Button.setText(answerList.get(2));

        //ftiaxnei ton optionsListener
        View.OnClickListener optionsListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = ((Button)v).getText().toString();

                switch (v.getId()){
                    case R.id.answer1_Button:
                        // to back color to kanw set me auton ton tropo giati eimai se fragment kai oxi se activity
                        ans1Button.setBackgroundColor(ans1Button.getContext().getResources().getColor(R.color.learnPyLightBlue));
                        ans2Button.setBackgroundColor(ans2Button.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        ans3Button.setBackgroundColor(ans3Button.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        break;
                    case R.id.answer2_Button:
                        // to back color to kanw set me auton ton tropo giati eimai se fragment kai oxi se activity
                        ans2Button.setBackgroundColor(ans2Button.getContext().getResources().getColor(R.color.learnPyLightBlue));
                        ans1Button.setBackgroundColor(ans1Button.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        ans3Button.setBackgroundColor(ans3Button.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        break;
                    case R.id.answer3_Button:
                        // to back color to kanw set me auton ton tropo giati eimai se fragment kai oxi se activity
                        ans3Button.setBackgroundColor(ans3Button.getContext().getResources().getColor(R.color.learnPyLightBlue));
                        ans2Button.setBackgroundColor(ans2Button.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        ans1Button.setBackgroundColor(ans1Button.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        break;
                }
            }
        };

        // kanei set ton optionsListener sta button polaplis epilogis
        ans1Button.setOnClickListener(optionsListener);
        ans2Button.setOnClickListener(optionsListener);
        ans3Button.setOnClickListener(optionsListener);

        // event gia to ti tha ginei sto patima tou check-next button
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans.equals(chapter.getCorectAnswer())){
                    listener.onNextClick(true, position, chapter.getCorectAnswer(),chapters.get(position));
                }
                else {
                    listener.onNextClick(false, position,chapter. getCorectAnswer(),chapters.get(position));
                }
            }
        });

        return view;
    }

    //methodos pou dimiourgei select the code items
    private View createSelectTheCodeItem(ViewGroup container, final int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.course_chapter_select_the_code, container, false);

        // vriskei ta view gia na provalei to chapter
        TextView chapterText = view.findViewById(R.id.showExplanation_textView);
        Button outputToBeReturned = view.findViewById(R.id.outputToBeReturned);

        // vriskei ta web view pou tha provlithoun oi apantisis
        final WebView ans1_WebView = view.findViewById(R.id.answer1_WebView);
        WebView ans2_WebView = view.findViewById(R.id.answer2_WebView);
        WebView ans3_WebView = view.findViewById(R.id.answer3_WebView);

        // vriskei kai ta container ton web view
        final LinearLayout ans1_WebView_Container = view.findViewById(R.id.answer1_WebView_Container);
        final LinearLayout ans2_WebView_Container = view.findViewById(R.id.answer2_WebView_Container);
        final LinearLayout ans3_WebView_Container = view.findViewById(R.id.answer3_WebView_Container);

        Button checkButton = view.findViewById(R.id.check_Button);

        //kanei display to explanation tou chapter
        chapterText.setText(chapters.get(position).getExplanation());

        // kanei desplay to apotelesma pou prepei na paraxthei apo ton kodika
        outputToBeReturned.setText(chapters.get(position).getCodeToBeReturned());

        // kanei display ta answers sta web view
        final SelectTheCodeChapter chapter = chapters.get(position).getChapterType2();

        // fortonei ta answers apo to chapter se mia nea lista kai ta anakateuei
        List<String> answerList = chapter.getAnswerURLs();
        Collections.shuffle(answerList);

        ans1_WebView.loadUrl(answerList.get(0));
        ans2_WebView.loadUrl(answerList.get(1));
        ans3_WebView.loadUrl(answerList.get(2));

        //ftiaxnei ton optionsListener
        View.OnTouchListener optionsListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ans = ((WebView)v).getUrl();

                switch (v.getId()){
                    case R.id.answer1_WebView:
                        // to back color to kanw set me auton ton tropo giati eimai se fragment kai oxi se activity
                        ans1_WebView_Container.setBackgroundColor(ans1_WebView_Container.getContext().getResources().getColor(R.color.learnPyLightBlue));
                        ans2_WebView_Container.setBackgroundColor(ans2_WebView_Container.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        ans3_WebView_Container.setBackgroundColor(ans3_WebView_Container.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        break;
                    case R.id.answer2_WebView:
                        // to back color to kanw set me auton ton tropo giati eimai se fragment kai oxi se activity
                        ans2_WebView_Container.setBackgroundColor(ans1_WebView_Container.getContext().getResources().getColor(R.color.learnPyLightBlue));
                        ans1_WebView_Container.setBackgroundColor(ans2_WebView_Container.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        ans3_WebView_Container.setBackgroundColor(ans3_WebView_Container.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        break;
                    case R.id.answer3_WebView:
                        // to back color to kanw set me auton ton tropo giati eimai se fragment kai oxi se activity
                        ans3_WebView_Container.setBackgroundColor(ans3_WebView_Container.getContext().getResources().getColor(R.color.learnPyLightBlue));
                        ans1_WebView_Container.setBackgroundColor(ans1_WebView_Container.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        ans2_WebView_Container.setBackgroundColor(ans2_WebView_Container.getContext().getResources().getColor(R.color.learnPyDarkBlue));
                        break;

                }

                return false;
            }
        };

        ans1_WebView.setOnTouchListener(optionsListener);
        ans2_WebView.setOnTouchListener(optionsListener);
        ans3_WebView.setOnTouchListener(optionsListener);

        // event gia to ti tha ginei sto patima tou check-next button
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans.equals(chapter.getCorrectAnswerURL())){
                    listener.onNextClick(true, position, chapter.getCorrectAnswer(),chapters.get(position));
                }
                else {
                    listener.onNextClick(false, position, chapter.getCorrectAnswer(),chapters.get(position));
                }
            }
        });
        return view;

    }


    // interface gia to onclick event to next button
    // gia na kalite apo tin course activity kai na epistrefei tin apantisi tou xristi

    public interface OnNextClickListener{
        void onNextClick(boolean isCorrect, int position, String correctAns, Chapter chapter);
    }

    // episis dimiourgoume kai tin methodo setOnItemClickListener
    // i opoia dexete ena instance pou kanei implement to onItemClickListener
    // gia na ipoxreosoume opoion to kalei na kanei implement to interface mas

    public void setOnNextClickListener(OnNextClickListener listener){
        this.listener = listener;
    }
}
