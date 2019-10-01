package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HelpActivity extends AppCompatActivity {

    private WebView helpView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Intent intent = getIntent();

        if(intent.hasExtra(MainActivity.EXTRA_WEB_PAGE_TO_DISPLAY)){
            String url = intent.getStringExtra(MainActivity.EXTRA_WEB_PAGE_TO_DISPLAY);
            helpView = findViewById(R.id.displayHelp_WebView);
            helpView.loadUrl(url);
        }
        else {
            helpView = findViewById(R.id.displayHelp_WebView);
            helpView.loadUrl("https://firebasestorage.googleapis.com/v0/b/learnpy-dfb21.appspot.com/o/OnlineHelp%2Fuser_manual.htm?alt=media&token=27c26acc-0e0c-41ee-a6d4-7290bacf61cf");
        }
    }
}
