package com.instiki.dkotama.pertemuansepuluhsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class SplashActivity extends AppCompatActivity {
    final Handler handler = new Handler(Looper.getMainLooper());
    Intent nextIntent;
        
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

      
         // TODO: Letakkan Logika check shared Preference disini 
        String username = "";
        
        // Logika check shared preference exist
        if (!username.equals("")) {
            nextIntent = new Intent(SplashActivity.this, HomeActivity.class);
        } else {
            nextIntent = new Intent(SplashActivity.this, LoginActivity.class);
        }
        
        // Memberikan delay 2 detik (2000 ms) pada splash screen
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(nextIntent);
            }
        }, 2000);

        
    }
}
