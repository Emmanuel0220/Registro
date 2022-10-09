package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler( ).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( Login.this , Registro.class );
                startActivity( intent );
                finish();
            }
        } , 5000 );
    }
}