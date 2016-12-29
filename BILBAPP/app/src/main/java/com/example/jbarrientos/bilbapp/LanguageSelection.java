package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.graphics.Color;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.net.Uri;
import android.content.Intent;
import android.widget.VideoView;
import android.widget.MediaController;
import android.view.KeyEvent;
import android.view.ViewGroup;

public class LanguageSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void selectEuskadi(View v){

        Toast.makeText(getApplicationContext(), "Euskadi!", Toast.LENGTH_SHORT).show();

    }

    public void selectCatalunia(View v){

        Toast.makeText(getApplicationContext(), "Catalunia!", Toast.LENGTH_SHORT).show();

    }

    public void selectGalicia(View v){

        Toast.makeText(getApplicationContext(), "Galicia!", Toast.LENGTH_SHORT).show();

    }

    public void selectSpain(View v){

        Toast.makeText(getApplicationContext(), "Spain!", Toast.LENGTH_SHORT).show();

    }

    public void selectEngland(View v){

        Toast.makeText(getApplicationContext(), "England!", Toast.LENGTH_SHORT).show();

    }

    public void selectFrance(View v){

        Toast.makeText(getApplicationContext(), "France!", Toast.LENGTH_SHORT).show();

    }
}
