package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jbarrientos.bilbapp.Model.Sitios;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setTitle(R.string.help_icon_1);

        ListView lista = (ListView) findViewById(R.id.info_list);

        ArrayList<Sitios> versiones =
                new ArrayList<Sitios>();

        versiones.add(
                new Sitios("El Corte Ingles", 3));

        versiones.add(
                new Sitios("Zara", 5));

        versiones.add(
                new Sitios("Fnac", 4));

        versiones.add(
                new Sitios("Pull and Bear", 2));

        versiones.add(
                new Sitios("El Corte Ingles", 3));

        versiones.add(
                new Sitios("Zara", 5));

        versiones.add(
                new Sitios("Fnac", 4));

        versiones.add(
                new Sitios("Pull and Bear", 2));

        versiones.add(
                new Sitios("El Corte Ingles", 3));

        versiones.add(
                new Sitios("Zara", 5));

        versiones.add(
                new Sitios("Fnac", 4));

        versiones.add(
                new Sitios("Pull and Bear", 2));

        StaticSitiosAdapter adaptador = new StaticSitiosAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }

}
