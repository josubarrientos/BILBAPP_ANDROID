package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TranslationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        setTitle(R.string.help_icon_3);

        ListView lista = (ListView) findViewById(R.id.trans_list);

        ArrayList<Translation> versiones = new ArrayList<Translation>();

        versiones.add(
                new Translation("El Corte Ingles", "fsadfsa","fsafsfa"));
        versiones.add(
                new Translation("El Corte Ingles", "fsadfsa","fsafsfa"));
        versiones.add(
                new Translation("El Corte Ingles", "fsadfsa","fsafsfa"));
        versiones.add(
                new Translation("El Corte Ingles", "fsadfsa","fsafsfa"));

        TranslationAdapter adaptador = new TranslationAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }
}
