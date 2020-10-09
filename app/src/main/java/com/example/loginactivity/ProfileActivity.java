package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView tvUsernameList;
    TextView tvPasswordList;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvUsernameList = findViewById(R.id.tv_username_list);
        tvPasswordList = findViewById(R.id.tv_password_list);
        btnLogout = findViewById(R.id.btn_logout);


    }
}