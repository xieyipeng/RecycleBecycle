package com.example.englishplay.bookrecycle.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.englishplay.bookrecycle.MainActivity;
import com.example.englishplay.bookrecycle.R;
import com.example.englishplay.bookrecycle.signIn.SignInActivity;

public class logInActivity extends AppCompatActivity {

    Button loginButton;
    Button signButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logn_in);
        initViews();
        initClick();
    }

    private void initClick() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLogin = new Intent(logInActivity.this, MainActivity.class);
                startActivity(toLogin);
                finish();
            }
        });
        signButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSign=new Intent(logInActivity.this, SignInActivity.class);
                startActivity(toSign);
            }
        });
    }

    private void initViews() {
        loginButton = findViewById(R.id.login_button);
        signButton = findViewById(R.id.sign_button);
    }
}
