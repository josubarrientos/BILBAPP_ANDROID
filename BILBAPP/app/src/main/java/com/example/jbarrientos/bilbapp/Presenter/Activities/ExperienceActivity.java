package com.example.jbarrientos.bilbapp.Presenter.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.Presenter.Adapters.ExperiencesInSitiosAdapter;
import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Presenter.NetworkChecker;
import com.example.jbarrientos.bilbapp.Presenter.QueryAsyncTask;
import com.example.jbarrientos.bilbapp.Model.Sitios;
import com.example.jbarrientos.bilbapp.R;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class ExperienceActivity extends AppCompatActivity {

    ListView lista;
    private ArrayList<Sitios> versiones = new ArrayList<Sitios>();
    private DataPopulator dp = new DataPopulator();
    private Boolean networkOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        setTitle(R.string.help_icon_4);

        String sitioType = getIntent().getStringExtra("extra_text");

        lista = (ListView) findViewById(R.id.info_list);

        networkOn = NetworkChecker.getConnectivity(this);

        if(networkOn==true)
        {
            sitiosQuery(sitioType);
        }else{
            Toast toast1 = Toast.makeText(this,R.string.network_off,Toast.LENGTH_SHORT);
            toast1.show();
        }

    }

    public void sitiosQuery(final String typeSitio){
        new QueryAsyncTask<ArrayList<Sitios>>(this) {
            @Override
            protected ArrayList<Sitios> work() throws Exception{

                switch (typeSitio) {

                    case "fiesta":
                        try {
                            versiones = dp.cargaInfoSitios(typeSitio);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "compras":
                        try {
                            versiones = dp.cargaInfoSitios(typeSitio);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "restaurantes":
                        try {
                            versiones = dp.cargaInfoSitios(typeSitio);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "alojamiento":
                        try {
                            versiones = dp.cargaInfoSitios(typeSitio);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "deportes":
                        try {
                            versiones = dp.cargaInfoSitios(typeSitio);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "monumentos":
                        try {
                            versiones = dp.cargaInfoSitios(typeSitio);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "transportes":
                        try {
                            versiones = dp.cargaInfoSitios(typeSitio);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    default:
                        break;
                }

                return versiones;
            }

            @Override
            protected void onFinish(ArrayList<Sitios> estado){
                ExperiencesInSitiosAdapter adaptador = new ExperiencesInSitiosAdapter(ExperienceActivity.this, versiones);
                lista.setAdapter(adaptador);
            }
        }.execute();
    }
}
