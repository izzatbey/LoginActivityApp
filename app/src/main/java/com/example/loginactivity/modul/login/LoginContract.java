package com.example.loginactivity.modul.login;

import com.example.loginactivity.base.BasePresenter;
import com.example.loginactivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
