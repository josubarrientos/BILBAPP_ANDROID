package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Model.Translation;

import java.util.ArrayList;

public class TranslationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        setTitle(R.string.help_icon_3);

        String sitioType = getIntent().getStringExtra("extra_text");

        ListView lista = (ListView) findViewById(R.id.trans_list);

        DataPopulator recogedor = new DataPopulator();

        ArrayList<Translation> versiones = new ArrayList<Translation>();

        switch (sitioType) {

            case "fiesta":
                versiones = recogedor.cargaTranslationsFiesta(this);
                break;
            case "compras":
                versiones = recogedor.cargaTranslationsCompras(this);
                break;
            case "restaurantes":
                versiones = recogedor.cargaTranslationsRestaurantes(this);
                break;
            case "hotel":
                versiones = recogedor.cargaTranslationsAlojamiento(this);
                break;
            case "deporte":
                versiones = recogedor.cargaTranslationsDeportes(this);
                break;
            case "monumentos":
                versiones = recogedor.cargaTranslationsMonumentos(this);
                break;
            case "transporte":
                versiones = recogedor.cargaTranslationsTransportes(this);
            default:
                break;
        }

        TranslationAdapter adaptador = new TranslationAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }
}
