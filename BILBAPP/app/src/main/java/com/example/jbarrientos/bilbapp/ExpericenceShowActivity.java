package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Model.Experience;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ExpericenceShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expericence_show);

        String nombre = getIntent().getStringExtra("extra_text");

        setTitle(R.string.help_icon_4);

        ListView lista = (ListView) findViewById(R.id.expe_list);

        DataPopulator recogedor = new DataPopulator();

        ArrayList<Experience> versiones = new ArrayList<Experience>();

        versiones = recogedor.cargaExperienciasByName(this,nombre);

        ExperienceAdapter adaptador = new ExperienceAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }
}
