package com.example.loginactivity.modul.login;

import android.content.Context;
import android.content.SharedPreferences;

import static com.example.loginactivity.modul.Constants.EMAIL_KEY;
import static com.example.loginactivity.modul.Constants.PASSWORD_KEY;
import static com.example.loginactivity.modul.Constants.PREFERENCE_KEY;

public class LoginPresenter implements LoginContract.Presenter{

    private final LoginContract.View view;
    private final SharedPreferences sharedPreferences;

    public LoginPresenter(LoginContract.View view, Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFERENCE_KEY, Context.MODE_PRIVATE);
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String email, final String password){
        //proses login
        //if login success call redirect to profile
        view.redirectToProfile();
    }

}
