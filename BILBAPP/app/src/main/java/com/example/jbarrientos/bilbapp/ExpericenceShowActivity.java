package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ExpericenceShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expericence_show);

        String nombre = getIntent().getStringExtra("extra_text");

        Toast toast1 =
                Toast.makeText(getApplicationContext(),nombre, Toast.LENGTH_SHORT);

        toast1.show();

    }
}
