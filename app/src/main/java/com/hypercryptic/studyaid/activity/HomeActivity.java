package com.hypercryptic.studyaid.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hypercryptic.studyaid.R;

/**
 * Created by sharukhhasan on 7/18/16.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }
}
