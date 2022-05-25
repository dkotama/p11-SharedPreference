package com.instiki.dkotama.pertemuansepuluhsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // menghilangkan actionbar
        getSupportActionBar().hide();

    }

    @Override
    protected void onResume() {
        super.onResume();

        // TODO: Letakkan Logika check shared Preference disini & bawa ke home (jika ada)


        Intent homeIntent = new Intent(SplashActivity.this, HomeActivity.class);
        startActivity(homeIntent);
    }
}