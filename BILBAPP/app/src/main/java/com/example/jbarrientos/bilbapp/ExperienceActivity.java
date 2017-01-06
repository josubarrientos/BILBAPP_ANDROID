package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jbarrientos.bilbapp.Adapters.ExperiencesInSitiosAdapter;
import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Model.Sitios;

import java.util.ArrayList;

public class ExperienceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        setTitle(R.string.help_icon_4);

        String sitioType = getIntent().getStringExtra("extra_text");

        ListView lista = (ListView) findViewById(R.id.info_list);

        DataPopulator recogedor = new DataPopulator();

        ArrayList<Sitios> versiones = new ArrayList<Sitios>();

        switch (sitioType) {

            case "fiesta":
                versiones = recogedor.cargaInfoSitiosFiesta(this);
                break;
            case "compras":
                versiones = recogedor.cargaInfoSitiosCompras(this);
                break;
            case "restaurantes":
                versiones = recogedor.cargaInfoSitiosRestaurantes(this);
                break;
            case "hotel":
                versiones = recogedor.cargaInfoSitiosAlojamiento(this);
                break;
            case "deporte":
                versiones = recogedor.cargaInfoSitiosDeportes(this);
                break;
            case "monumentos":
                versiones = recogedor.cargaInfoSitiosMonumetnos(this);
                break;
            case "transporte":
                versiones = recogedor.cargaInfoSitiosTransportes(this);
            default:
                break;
        }

        ExperiencesInSitiosAdapter adaptador = new ExperiencesInSitiosAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }
}
