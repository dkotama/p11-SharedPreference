package com.instiki.dkotama.pertemuansepuluhsharedpref;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // TODO: Letakkan Logika Membaca Shared Preference NAMA Mahasiswa disini
        // TODO: Lalu set nama selamat datang menjadi mahasiswa yang login

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Home");
        actionBar.show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_logout) {
            // TODO : Lakukan proses clear atau hapus cache disini
            // TODO : Lalu arahkan ke halaman splash
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Mengatur tombol logout pada action bar
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        // mengatur tombol back agar tidak ke halaman sebelumnya
        super.onBackPressed();
        this.finishAffinity();
    }

}