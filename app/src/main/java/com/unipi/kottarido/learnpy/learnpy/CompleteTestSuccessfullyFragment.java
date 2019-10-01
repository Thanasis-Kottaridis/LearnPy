package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CompleteTestSuccessfullyFragment extends Fragment {

    //Log TAGS
    public static final String TAG = "CompleteSuccessfully";

    // ta stixia tou test
    private String testTitle;
    private int userScore;

    // initialise ta views tou fragment
    private TextView descriptionTextView;
    private TextView scoreTextView;
    private Button mainMenuButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.complete_successfully_layout, container, false);
        Log.d(TAG, "onCreateView: started");

        // vriskei ta view
        descriptionTextView = view.findViewById(R.id.description_textView);
        scoreTextView = view.findViewById(R.id.score_textView);
        mainMenuButton = view.findViewById(R.id.go_to_main_menu_button);

        // fortonei ta stixia sxetika me to course apo to bundle (an iparxoun)
        if (getArguments() != null) {
            testTitle = getArguments().getString(PracticeActivity.TEST_TITLE_KEY);
            userScore = getArguments().getInt(PracticeActivity.USER_SCORE_KEY);

        }

        // provalei ta apotelesmata sta views
        descriptionTextView.setText("You have completed the practice test: " + testTitle + " successfully!");
        scoreTextView.setText("YOUR SCORE: " + String.valueOf(userScore));


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
