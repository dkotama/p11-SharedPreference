package com.instiki.dkotama.pertemuansepuluhsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.instiki.dkotama.pertemuansepuluhsharedpref.data.LoginDatabase;
import com.instiki.dkotama.pertemuansepuluhsharedpref.data.User;

public class LoginActivity extends AppCompatActivity {
    EditText usernameET, passwordET;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = findViewById(R.id.username_edittext);
        passwordET = findViewById(R.id.password_edittext);
        btnLogin = findViewById(R.id.btn_login);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // searching username & password dari class LoginDatabase

                // Memasukkan tiap isian edit text kedalam variabel string
               String usernameStr = usernameET.getText().toString();
               String passwordStr = passwordET.getText().toString();


               // melakukan perulangan terhadap data yang ada dengan foreach
                for (User user: LoginDatabase.USER_DATABASE) {
                    // mencocokkan username & password
                    if (user.getUsername().equals(usernameStr) &&
                            user.getPassword().equals(passwordStr)) {

                        // TODO: Letakkan Logika Write Shared Preference disini
                        // TODO: Key 1 : username, Key 2 : name

                        // jika benar dibawa ke halaman home
                        Intent  homeIntent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(homeIntent);
                    }
                }

                // jika pada perulangan tidak ditemukan username & password yang cocok, maka tampilkan error
                Toast.makeText(LoginActivity.this, "Username / Password Salah!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        // mengatur tombol back agar tidak ke halaman sebelumnya
        super.onBackPressed();
        this.finishAffinity();
    }
}