package com.example.loginactivity.modul.profile;

import android.view.View;

import com.example.loginactivity.base.BaseFragmentHolderActivity;

public class ProfileActivity extends BaseFragmentHolderActivity {
    private ProfileFragment profileFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.VISIBLE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment();
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileFragment.goBackToLogin();
            }
        });
        setCurrentFragment(profileFragment, true);
    }
}
