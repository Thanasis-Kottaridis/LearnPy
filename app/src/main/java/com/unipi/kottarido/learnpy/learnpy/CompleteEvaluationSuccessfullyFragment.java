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

public class CompleteEvaluationSuccessfullyFragment extends Fragment {

    private Button mainMenuButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.complete_evaluation_successfully_layout, container, false);

        mainMenuButton = view.findViewById(R.id.go_to_main_menu_button);

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
