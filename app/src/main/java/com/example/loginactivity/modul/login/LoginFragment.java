package com.example.loginactivity.modul.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;
import com.example.loginactivity.modul.profile.ProfileActivity;
import com.example.loginactivity.R;
import com.example.loginactivity.base.BaseFragment;




public class LoginFragment extends BaseFragment<LoginActivity, LoginContract.Presenter> implements LoginContract.View {

    private TextInputEditText etEmail;
    private TextInputEditText etPassword;
    Button btnLogin;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_login, container, false);
        mPresenter = new LoginPresenter(this, requireContext());
        mPresenter.start();

        etEmail = fragmentView.findViewById(R.id.et_email);
        etPassword = fragmentView.findViewById(R.id.et_password);
        btnLogin = fragmentView.findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this::setBtLoginClick);

        setTitle("Login Site");

        return fragmentView;
    }

    private void setBtLoginClick(View view){
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        mPresenter.performLogin(email,password);
    }

    @Override
    public void redirectToProfile() {
            Intent intent = new Intent(activity, ProfileActivity.class);
            startActivity(intent);
            activity.finish();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.mPresenter = presenter;
    }


}
