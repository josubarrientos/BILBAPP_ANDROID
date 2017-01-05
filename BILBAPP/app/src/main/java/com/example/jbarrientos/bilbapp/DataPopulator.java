package com.example.jbarrientos.bilbapp;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.content.Context;
import java.util.ResourceBundle;

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

        System.out.println("Se saca un arraylist con tamaño: "+versiones.size());

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

}
