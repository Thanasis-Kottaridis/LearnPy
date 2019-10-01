package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CompleteTestUnsuccessfullyFragment extends Fragment {

    // ta stixia tou test
    private String testTitle;
    private String testStringExtra;

    // initialise ta views tou fragment
    private TextView descriptionTextView;
    private Button redoTest;
    private Button mainMenuButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.complete_unsuccessfully_layout,container,false);

        // vriskei ta view
        descriptionTextView = view.findViewById(R.id.description_textView);
        redoTest = view.findViewById(R.id.redo_course_button);
        mainMenuButton = view.findViewById(R.id.cancel_button);

        // fortonei ta stixia sxetika me to course apo to bundle (an iparxoun)
        if(getArguments() != null){
            testTitle = getArguments().getString(PracticeActivity.TEST_TITLE_KEY);
            testStringExtra = getArguments().getString(PracticeActivity.FULL_TEST);

        }

        // provalei ta apotelesmata sta views
        descriptionTextView.setText("You have failed to complete the practice test "+testTitle+" successfully! But don't worry you can try again! ");


        // sto onClick to redo course paei kai trexei apo tin arxi to CourseActivity gia to idio course
        redoTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PracticeActivity.class);
                intent.putExtra(MainActivity.EXTRA_PRACTICE_TEST, testStringExtra);
                startActivity(intent);
                getActivity().finish();

            }
        });

        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fortonei ton current user
                User currentUser = DataHelper.loadUserProfileFromSP(getActivity());
                // elengxei an einai admin i aplos user
                if (currentUser.getUserType().getTitle().equals("Admin")) {
                    startActivity(new Intent(getActivity(), AdminActivity.class));
                    getActivity().finish();
                } else {
                    startActivity(new Intent(getActivity(), MainActivity.class));
                    getActivity().finish();
                }
            }
        });

        return view;


    }
}
