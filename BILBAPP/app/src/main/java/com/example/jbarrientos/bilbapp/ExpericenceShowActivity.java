package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Model.DataSender;
import com.example.jbarrientos.bilbapp.Model.Experience;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ExpericenceShowActivity extends AppCompatActivity {

    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expericence_show);

        nombre = getIntent().getStringExtra("extra_text");

        setTitle(R.string.help_icon_4);

        ListView lista = (ListView) findViewById(R.id.expe_list);

        DataPopulator recogedor = new DataPopulator();

        ArrayList<Experience> versiones = new ArrayList<Experience>();

        versiones = recogedor.cargaExperienciasByName(this,nombre);

        ExperienceAdapter adaptador = new ExperienceAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }

    public void sendReview(View v){

        DataSender sender = new DataSender();

        Boolean state = sender.sendExperiencia(this,nombre);

        if (state){

            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Correctamente enviado", Toast.LENGTH_SHORT);

            toast1.show();
        }


    }
}
