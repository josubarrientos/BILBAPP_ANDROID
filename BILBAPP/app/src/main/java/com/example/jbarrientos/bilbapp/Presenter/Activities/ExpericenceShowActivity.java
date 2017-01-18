package com.example.jbarrientos.bilbapp.Presenter.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.jbarrientos.bilbapp.Presenter.Adapters.ExperienceAdapter;
import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Presenter.DataSender;
import com.example.jbarrientos.bilbapp.Model.Experience;
import com.example.jbarrientos.bilbapp.Presenter.QueryAsyncTask;
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

        criticasQuery(nombre);

    }

    public void sendReview(View v) throws IOException, JSONException {

        DataSender sender = new DataSender();

        sender.sendExperiencia(this,nombre);

    }

    public void criticasQuery(final String nombreSitio){
        new QueryAsyncTask<ArrayList<Experience>>(this) {
            @Override
            protected ArrayList<Experience> work() throws Exception{

                //versiones = dp.cargaExperienciasByName(nombreSitio.replaceAll("\\s+","%20"));
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
