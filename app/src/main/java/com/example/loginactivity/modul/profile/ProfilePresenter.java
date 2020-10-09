package com.example.loginactivity.modul.profile;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.loginactivity.R;

import static com.example.loginactivity.modul.Constants.EMAIL_KEY;
import static com.example.loginactivity.modul.Constants.PASSWORD_KEY;
import static com.example.loginactivity.modul.Constants.PREFERENCE_KEY;

public class ProfilePresenter implements ProfileContract.Presenter {

    private final ProfileContract.View view;
    private final SharedPreferences sharedPreferences;
    private final Context context;

    public ProfilePresenter(ProfileContract.View view, Context context) {
        this.view = view;
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(PREFERENCE_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public void start() {
        getProfile();
    }


    @Override
    public void getProfile() {
        String email = this.sharedPreferences.getString(EMAIL_KEY, context.getResources().getString(R.string.value_default));
        String password = this.sharedPreferences.getString(PASSWORD_KEY, context.getResources().getString(R.string.value_default));

        view.updateProfile(email, password);
    }
}
