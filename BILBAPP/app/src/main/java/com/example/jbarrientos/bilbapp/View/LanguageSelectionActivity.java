package com.example.jbarrientos.bilbapp.View;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.content.res.Configuration;

import com.example.jbarrientos.bilbapp.R;

import java.util.Locale;


public class LanguageSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void selectEuskadi(View v){

        Locale locale = new Locale("eu");
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = locale;
        res.updateConfiguration(conf,dm);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectCatalunia(View v){

        Locale locale = new Locale("ca");
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = locale;
        res.updateConfiguration(conf,dm);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectGalicia(View v){

        Locale locale = new Locale("gl");
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = locale;
        res.updateConfiguration(conf,dm);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectSpain(View v){

        Locale locale = new Locale("es");
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = locale;
        res.updateConfiguration(conf,dm);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectEngland(View v){

        Locale locale = new Locale("en");
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = locale;
        res.updateConfiguration(conf,dm);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectFrance(View v){

        Locale locale = new Locale("fr");
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = locale;
        res.updateConfiguration(conf,dm);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }
}
