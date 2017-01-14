package com.example.jbarrientos.bilbapp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.Adapters.ExperienceAdapter;
import com.example.jbarrientos.bilbapp.Adapters.ExperiencesInSitiosAdapter;
import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Model.DataSender;
import com.example.jbarrientos.bilbapp.Model.Experience;
import com.example.jbarrientos.bilbapp.Model.QueryAsyncTask;
import com.example.jbarrientos.bilbapp.Model.Sitios;
import com.example.jbarrientos.bilbapp.R;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class ExpericenceShowActivity extends AppCompatActivity {

    ListView lista;
    private String nombre;
    private ArrayList<Experience> versiones = new ArrayList<Experience>();
    private DataPopulator dp = new DataPopulator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expericence_show);

        nombre = getIntent().getStringExtra("extra_text");

        setTitle(R.string.help_icon_4);

        lista = (ListView) findViewById(R.id.expe_list);

        CriticasQuery(nombre);

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

    public void CriticasQuery (final String nombreSitio){
        new QueryAsyncTask<ArrayList<Experience>>(this) {
            @Override
            protected ArrayList<Experience> work() throws Exception{

                versiones = dp.cargaExperienciasByName(nombreSitio);

                return versiones;
            }

            @Override
            protected void onFinish(ArrayList<Experience> estado){
                ExperienceAdapter adaptador = new ExperienceAdapter(ExpericenceShowActivity.this, versiones);
                lista.setAdapter(adaptador);
            }
        }.execute();
    }

}
