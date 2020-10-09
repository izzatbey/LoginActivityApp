package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE_USERNAME = "USERNAME_MESSAGE";
    public static final String MESSAGE_PASSWORD = "PASSWORD_MESSAGE";
    Button btnLogin;
    TextView tvUsername;
    TextView tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsername = findViewById(R.id.tv_username_list);
        tvPassword = findViewById(R.id.tv_password_list);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveActivity();
            }
        });
    }

    public void moveActivity() {
        Intent myIntent = new Intent(this, ProfileActivity.class);
        myIntent.putExtra(MESSAGE_USERNAME, tvUsername.getText().toString());
        myIntent.putExtra(MESSAGE_PASSWORD, tvPassword.getText().toString());
        startActivity(myIntent);
    }
}