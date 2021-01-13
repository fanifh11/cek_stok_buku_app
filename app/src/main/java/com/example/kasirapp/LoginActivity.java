package com.example.kasirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText user,passwordUser;
    Button btnMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initialize();
    }

    private void initialize() {
       user = findViewById(R.id.user);
       passwordUser = findViewById(R.id.passwordUser);
       btnMasuk = findViewById(R.id.btnMasuk);
    }


    public void masuk(View view) {
        try {
            if (user.getText().toString().equals("admin") && passwordUser.getText().toString().equals("tokobuku123")){
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            } else {
                Toast.makeText(this, "Silahkan dicek kembali", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            if (user.getText().toString().isEmpty()){
                Toast.makeText(this, "Username anda masih kosong", Toast.LENGTH_SHORT).show();
            } else if (passwordUser.getText().toString().isEmpty()){
                Toast.makeText(this, "Password anda masih kosong", Toast.LENGTH_SHORT).show();
            }

        }


    }
}