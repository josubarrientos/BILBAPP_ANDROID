package com.example.jbarrientos.bilbapp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.*;
import android.content.Intent;

import com.example.jbarrientos.bilbapp.R;

public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 4000; //Time to launch the another activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, LanguageSelectionActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}
