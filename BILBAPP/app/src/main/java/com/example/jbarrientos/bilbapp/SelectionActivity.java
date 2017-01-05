package com.example.jbarrientos.bilbapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class SelectionActivity extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        data = getIntent().getStringExtra("extra_text");

        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
    }

    public void selectInfo(View v){

        Toast.makeText(getApplicationContext(), "Info!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(SelectionActivity.this, InfoActivity.class);
        startActivity(i);

    }

    public void selectMap(View v){

        Toast.makeText(getApplicationContext(), "Map!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(SelectionActivity.this, MapActivity.class);
        i.putExtra("extra_text", data);
        startActivity(i);

    }

    public void selectTrans(View v){

        Toast.makeText(getApplicationContext(), "Translation!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(SelectionActivity.this, TranslationActivity.class);
        i.putExtra("extra_text", data);
        startActivity(i);

    }

    public void selectExpr(View v){

        Toast.makeText(getApplicationContext(), "Expressions!", Toast.LENGTH_SHORT).show();

    }

    public void selectStars(View v){

        Toast.makeText(getApplicationContext(), "Stars!", Toast.LENGTH_SHORT).show();

    }
}
