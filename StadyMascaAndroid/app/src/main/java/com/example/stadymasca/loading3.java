package com.example.stadymasca;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class loading3 extends AppCompatActivity {

    private static  int SPLASH_SCREEN= 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading3);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(loading3.this,teacher.class);
                startActivity(intent);
                finish();


            }
        },SPLASH_SCREEN);

    }
}