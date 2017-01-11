package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jbarrientos.bilbapp.Adapters.StaticSitiosAdapter;
import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Model.MyAsyncTaskSitios;
import com.example.jbarrientos.bilbapp.Model.Sitios;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setTitle(R.string.help_icon_1);

        String sitioType = getIntent().getStringExtra("extra_text");

        lista = (ListView) findViewById(R.id.info_list);

        //DataPopulator recogedor = new DataPopulator();


        //ArrayList<Sitios> versiones = new ArrayList<Sitios>();

        MyAsyncTaskSitios runner = new MyAsyncTaskSitios(InfoActivity.this);
        runner.execute("tutut");

                /*
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
        }*/

        //StaticSitiosAdapter adaptador = new StaticSitiosAdapter(this, versiones);
        //lista.setAdapter(adaptador);
    }


    public void populateList(ArrayList<Sitios> sitios) {
        StaticSitiosAdapter adaptador = new StaticSitiosAdapter(this, sitios);
        lista.setAdapter(adaptador);
    }


}
