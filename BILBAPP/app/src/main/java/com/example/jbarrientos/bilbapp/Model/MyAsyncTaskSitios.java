package com.example.jbarrientos.bilbapp.Model;

import android.app.Activity;
import android.os.AsyncTask;

import com.example.jbarrientos.bilbapp.InfoActivity;

import java.util.ArrayList;

/**
 * Created by jbarrientos on 11/01/17.
 */

public class MyAsyncTaskSitios extends AsyncTask<String, Void, ArrayList<Sitios>> {

    public InfoActivity mActivity;

    public MyAsyncTaskSitios(InfoActivity actividad) {
        this.mActivity = actividad;

    }


    @Override
    public ArrayList<Sitios> doInBackground(String... params) {

        ArrayList<Sitios> versiones = new ArrayList<Sitios>();

        versiones.add(
                new Sitios("El Corte Ingles", 3,"https://www.google.es/maps/place/El+Corte+Ingl%C3%A9s,+Bilbo,+Bizkaia/@43.2611946,-2.9312729,17z/data=!3m1!4b1!4m5!3m4!1s0xd4e4fd0362d1f5d:0x30af64dfd131ed33!8m2!3d43.2611424!4d-2.9289884"));
        versiones.add(
                new Sitios("Zara", 5,"https://www.google.es/maps/place/Zara/@43.2611946,-2.9312729,17z/data=!4m8!1m2!2m1!1szara+bilbao!3m4!1s0xd4e4fd77461cd9f:0x7bb79b49f6ad96d!8m2!3d43.2618447!4d-2.9345436"));
        versiones.add(
                new Sitios("Fnac", 4,"https://www.google.es/maps/place/FNAC+BILBAO/@43.2613269,-2.9322121,17z/data=!3m1!4b1!4m5!3m4!1s0xd4e4fd057f5e725:0x1149334bc16a475a!8m2!3d43.2613269!4d-2.9300234"));
        versiones.add(
                new Sitios("Pull and Bear", 2,"https://www.google.es/maps/place/Pull%26Bear/@43.2623615,-2.9335082,17z/data=!3m1!4b1!4m5!3m4!1s0xd4e4fd0b0f00693:0x9c1062f7b6902052!8m2!3d43.2623615!4d-2.9313195"));

        return versiones;

    }

    @Override
    public void onPostExecute(ArrayList<Sitios> sitios) {
        //delegate.processFinish(result);
        mActivity.populateList(sitios);
    }


}