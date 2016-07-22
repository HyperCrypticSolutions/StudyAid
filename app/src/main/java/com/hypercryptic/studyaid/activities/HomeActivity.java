package com.hypercryptic.studyaid.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hypercryptic.studyaid.R;

/**
 * Created by Sharukh Hasan on 7/17/16.
 * Copyright © 2016 HyperCryptic Solutions, LLC. All rights reserved.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }
}
