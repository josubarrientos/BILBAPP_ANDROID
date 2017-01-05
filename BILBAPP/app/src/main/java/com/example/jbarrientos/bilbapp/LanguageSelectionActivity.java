package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.content.res.Configuration;
import java.util.Locale;


public class LanguageSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void selectEuskadi(View v){

        Toast.makeText(getApplicationContext(), "Euskadi!", Toast.LENGTH_SHORT).show();

        Locale locale = new Locale("eu");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getApplicationContext().getResources().updateConfiguration(config, null);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectCatalunia(View v){

        Locale locale = new Locale("ca");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getApplicationContext().getResources().updateConfiguration(config, null);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectGalicia(View v){

        Locale locale = new Locale("gl");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getApplicationContext().getResources().updateConfiguration(config, null);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectSpain(View v){

        Locale locale = new Locale("es");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getApplicationContext().getResources().updateConfiguration(config, null);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectEngland(View v){

        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getApplicationContext().getResources().updateConfiguration(config, null);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }

    public void selectFrance(View v){

        Locale locale = new Locale("fr");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getApplicationContext().getResources().updateConfiguration(config, null);

        Intent i = new Intent(LanguageSelectionActivity.this, HomeActivity.class);
        startActivity(i);

    }
}
