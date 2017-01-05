package com.example.jbarrientos.bilbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jbarrientos.bilbapp.Model.Sitios;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        setTitle(R.string.help_icon_2);

        ListView lista = (ListView) findViewById(R.id.info_list);

        ArrayList<Sitios> versiones =
                new ArrayList<Sitios>();

        versiones.add(
                new Sitios("El Corte Ingles", 3,"https://www.google.es/maps/place/El+Corte+Ingl%C3%A9s,+Bilbo,+Bizkaia/@43.2611946,-2.9312729,17z/data=!3m1!4b1!4m5!3m4!1s0xd4e4fd0362d1f5d:0x30af64dfd131ed33!8m2!3d43.2611424!4d-2.9289884"));
        versiones.add(
                new Sitios("Zara", 5,"https://www.google.es/maps/place/Zara/@43.2611946,-2.9312729,17z/data=!4m8!1m2!2m1!1szara+bilbao!3m4!1s0xd4e4fd77461cd9f:0x7bb79b49f6ad96d!8m2!3d43.2618447!4d-2.9345436"));
        versiones.add(
                new Sitios("Fnac", 4,"https://www.google.es/maps/place/FNAC+BILBAO/@43.2613269,-2.9322121,17z/data=!3m1!4b1!4m5!3m4!1s0xd4e4fd057f5e725:0x1149334bc16a475a!8m2!3d43.2613269!4d-2.9300234"));
        versiones.add(
                new Sitios("Pull and Bear", 2,"https://www.google.es/maps/place/Pull%26Bear/@43.2623615,-2.9335082,17z/data=!3m1!4b1!4m5!3m4!1s0xd4e4fd0b0f00693:0x9c1062f7b6902052!8m2!3d43.2623615!4d-2.9313195"));

        NameOfSitiosAdapter adaptador = new NameOfSitiosAdapter(this, versiones);
        lista.setAdapter(adaptador);

    }

}