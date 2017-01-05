package com.example.jbarrientos.bilbapp.Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import android.content.Context;

import com.example.jbarrientos.bilbapp.R;

/**
 * Created by jbarrientos on 5/01/17.
 */

public class DataPopulator {

    public DataPopulator (){

    }

    public ArrayList<Translation> cargaTranslationsFiesta(Context ctx){

        List<String> Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_fiesta));
        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Translation> cargaTranslationsCompras(Context ctx){

        List<String> Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_compras));
        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Translation> cargaTranslationsRestaurantes(Context ctx){

        List<String> Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_restaurantes));
        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Translation> cargaTranslationsAlojamiento(Context ctx){

        List<String> Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_alojamiento));
        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Translation> cargaTranslationsDeportes(Context ctx){

        List<String> Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_deportes));
        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Translation> cargaTranslationsMonumentos(Context ctx){

        List<String> Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_monumentos));
        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Translation> cargaTranslationsTransportes(Context ctx){

        List<String> Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_transporte));
        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Sitios> cargaInfoSitiosFiesta(Context ctx){

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

    public ArrayList<Sitios> cargaInfoSitiosCompras(Context ctx){

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

    public ArrayList<Sitios> cargaInfoSitiosRestaurantes(Context ctx){

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

    public ArrayList<Sitios> cargaInfoSitiosAlojamiento(Context ctx){

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

    public ArrayList<Sitios> cargaInfoSitiosDeportes(Context ctx){

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

    public ArrayList<Sitios> cargaInfoSitiosMonumetnos(Context ctx){

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

    public ArrayList<Sitios> cargaInfoSitiosTransportes(Context ctx){

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

    public ArrayList<Experience> cargaExperienciasByName(Context ctx,String name){

        String nombreDeBusqueda = name;

        Date inputDate = new Date();

        String inputString = "11/11/2012";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            inputDate = dateFormat.parse(inputString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayList<Experience> versiones = new ArrayList<Experience>();

        versiones.add(
                new Experience("Pepito", inputDate,"Todo muy mal"));
        versiones.add(
                new Experience("Joaqin Cortes", inputDate,"Todo muy bien"));

        return versiones;
    }

}
