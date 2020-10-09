package com.example.loginactivity.modul.profile;

import com.example.loginactivity.base.BasePresenter;
import com.example.loginactivity.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void goBackToLogin();

        void updateProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void getProfile();
    }
}
