package com.subi.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class PlashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plash_screen);
        //Set full màn hình
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Animation cho text chạy trái vào
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent   intent = new Intent(PlashScreen.this, MainActivity.class);
                startActivity(intent);
            }
        }, 1000);// thoi gian chạy 3s
    }
}