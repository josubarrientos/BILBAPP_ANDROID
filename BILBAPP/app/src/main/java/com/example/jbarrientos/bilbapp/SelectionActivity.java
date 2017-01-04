package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        String text_toast = getIntent().getStringExtra("extra_text");

        Toast.makeText(getApplicationContext(), text_toast, Toast.LENGTH_SHORT).show();
    }
}
