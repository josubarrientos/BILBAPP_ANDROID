package com.example.jbarrientos.bilbapp.Presenter.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jbarrientos.bilbapp.R;

public class SelectionActivity extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        data = getIntent().getStringExtra("extra_text");

    }

    public void selectInfo(View v){

        Intent i = new Intent(SelectionActivity.this, InfoActivity.class);
        i.putExtra("extra_text", data);
        startActivity(i);

    }

    public void selectMap(View v){

        Intent i = new Intent(SelectionActivity.this, MapActivity.class);
        i.putExtra("extra_text", data);
        startActivity(i);

    }

    public void selectTrans(View v){

        Intent i = new Intent(SelectionActivity.this, TranslationActivity.class);
        i.putExtra("extra_text", data);
        startActivity(i);

    }

    public void selectExpr(View v){

        Intent i = new Intent(SelectionActivity.this, ExperienceActivity.class);
        i.putExtra("extra_text", data);
        startActivity(i);

    }

    public void selectStars(View v){

        Intent i = new Intent(SelectionActivity.this, QualificationActivity.class);
        i.putExtra("extra_text", data);
        startActivity(i);

    }
}
