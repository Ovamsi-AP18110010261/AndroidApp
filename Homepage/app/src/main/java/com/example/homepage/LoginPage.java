package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login_page);
            String s =getIntent().getStringExtra("mydata");
            TextView tv = findViewById(R.id.welcome);
            tv.setText("Welcome "+s+"!");

        }
    }