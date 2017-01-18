package com.example.jbarrientos.bilbapp.Presenter.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.Presenter.Adapters.StaticSitiosAdapter;
import com.example.jbarrientos.bilbapp.Model.DataPopulator;
import com.example.jbarrientos.bilbapp.Presenter.NetworkChecker;
import com.example.jbarrientos.bilbapp.Presenter.QueryAsyncTask;
import com.example.jbarrientos.bilbapp.Model.Sitios;
import com.example.jbarrientos.bilbapp.R;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    ListView lista;
    private ArrayList<Sitios> versiones = new ArrayList<Sitios>();
    private DataPopulator dp = new DataPopulator();
    private Boolean networkOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setTitle(R.string.help_icon_1);

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
                StaticSitiosAdapter adaptador = new StaticSitiosAdapter(InfoActivity.this, estado);
                lista.setAdapter(adaptador);
            }
        }.execute();
    }

}
