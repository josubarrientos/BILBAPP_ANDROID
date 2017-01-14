package com.example.jbarrientos.bilbapp.Model;

import android.os.AsyncTask;

import com.example.jbarrientos.bilbapp.View.InfoActivity;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jbarrientos on 11/01/17.
 */

public class MyAsyncTaskSitios extends AsyncTask<String, Void, ArrayList<Sitios>> {

    public InfoActivity mActivity;

    private DataPopulator dp = new DataPopulator();

    private ArrayList<Sitios> versiones = new ArrayList<Sitios>();

    public MyAsyncTaskSitios(InfoActivity actividad) {
        this.mActivity = actividad;

    }

    @Override
    public ArrayList<Sitios> doInBackground(String... params) {

        String s = params[0];

        switch (s) {

            case "fiesta":
                try {
                    versiones = dp.cargaInfoSitios(s);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case "compras":
                try {
                    versiones = dp.cargaInfoSitios(s);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case "restaurantes":
                try {
                    versiones = dp.cargaInfoSitios(s);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case "hotel":
                try {
                    versiones = dp.cargaInfoSitios(s);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case "deporte":
                try {
                    versiones = dp.cargaInfoSitios(s);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case "monumentos":
                try {
                    versiones = dp.cargaInfoSitios(s);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case "transporte":
                try {
                    versiones = dp.cargaInfoSitios(s);
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
    public void onPostExecute(ArrayList<Sitios> sitios) {
        //delegate.processFinish(result);
        mActivity.populateList(sitios);
    }


}