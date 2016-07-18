package com.hypercryptic.studyaid.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.hypercryptic.studyaid.R;

/**
 * Created by sharukhhasan on 7/18/16.
 */
public class RegisterActivity extends AppCompatActivity {
    private final String TAG = "RegisterActivity";
    private EditText user_name;
    private EditText user_email;
    private EditText user_pass;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mAuth = FirebaseAuth.getInstance();

        user_name = (EditText) findViewById(R.id.name_space);
        user_email = (EditText) findViewById(R.id.email_space);
        user_pass = (EditText) findViewById(R.id.password_space);

        Button signUpBtn = (Button) findViewById(R.id.signupButton);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                registerUser();
            }
        });


        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth)
            {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null)
                {
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                }
                else
                {
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }

            }
        };
    }

    private void registerUser(){
        
    }

    @Override
    public void onStart()
    {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop()
    {
        super.onStop();

        if(mAuthListener != null)
        {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }
}
