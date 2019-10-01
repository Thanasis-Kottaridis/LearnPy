package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainAdminFragment extends Fragment {

    // gia to help
    private Toolbar toolbar;

    // vriskei ta views tou menu tou admin
    private Button showStatistics;
    private Button addAdmin;
    private Button goToFirebase;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_admin_fragment_layout, container , false);

        //ftiaxnei to help stin toollbar
        toolbar = view.findViewById(R.id.main_admin_toolBar);
        toolbar.inflateMenu(R.menu.help_menu);

        // vriskei ta views
        showStatistics = view.findViewById(R.id.show_statistics_button);
        addAdmin = view.findViewById(R.id.add_admin_button);
        goToFirebase = view.findViewById(R.id.go_to_firebase_button);

        showStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(getActivity(),ShowStatisticsActivity.class));
            }
        });


        addAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pigenei sto add admin activity
                startActivity(new Intent(getActivity(),AddAdminActivity.class));
            }
        });

        goToFirebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpActivity.class);
                intent.putExtra(MainActivity.EXTRA_WEB_PAGE_TO_DISPLAY,"https://console.firebase.google.com/u/0/project/learnpy-dfb21/analytics/app/android:com.unipi.kottarido.learnpy.learnpy/overview%3Ft=1&cs=app.m.dashboard.overview&g=1");
                startActivity(intent);
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent(getActivity(), HelpActivity.class);
                intent.putExtra(MainActivity.EXTRA_WEB_PAGE_TO_DISPLAY,"https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/OnlineHelp%2Fadmin_manual.htm?alt=media&token=6a2df902-3b55-4a9a-9afa-f5df16f558f3");
                startActivity(intent);
                return false;
            }
        });
        return  view;
    }
}
