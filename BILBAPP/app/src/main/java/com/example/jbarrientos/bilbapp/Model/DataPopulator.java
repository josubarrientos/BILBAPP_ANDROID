package com.example.jbarrientos.bilbapp.Model;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import android.content.Context;

import com.example.jbarrientos.bilbapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jbarrientos on 5/01/17.
 */

public class DataPopulator {

    private RestClient restClient;
    private String server = "http://u017633.ehu.eus:28080/BILBAPP_SERVER/rest/Bilbapp";
    private ArrayList<Sitios> arraySitios = new ArrayList<Sitios>();
    private List<String> Lines;

    public DataPopulator (){
        restClient = new RestClient(server);
    }

    public ArrayList<Translation> cargaTranslations(Context ctx,String typeSitio){

        switch (typeSitio) {

            case "fiesta":
                Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_fiesta));
                break;
            case "compras":
                Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_compras));
                break;
            case "restaurantes":
                Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_restaurantes));
                break;
            case "hotel":
                Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_alojamiento));
                break;
            case "deporte":
                Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_deportes));
                break;
            case "monumentos":
                Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_monumentos));
                break;
            case "transporte":
                Lines = Arrays.asList(ctx.getResources().getStringArray(R.array.expresion_transporte));
            default:
                break;
        }

        ArrayList<Translation> versiones = new ArrayList<Translation>();

        for (int i=0;i<Lines.size();i++){
            String cadena= Lines.get(i);
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split(";")));
            versiones.add(
                    new Translation(list.get(0), list.get(1),list.get(2)));
        }
        return versiones;
    }

    public ArrayList<Sitios> cargaInfoSitios(String tipoSitio) throws IOException, JSONException {

        JSONObject jo = restClient.getJson(String.format("requestSitios?opcionName=%s",tipoSitio));

        JSONArray listaSitios = jo.getJSONArray("sitio");
        int listaSitiosLength = listaSitios.length();

        for(int i = 0;i<listaSitiosLength;i++){
            JSONObject jsonSitio = listaSitios.getJSONObject(i);
            Sitios sitioTemp = new Sitios(jsonSitio.getString("sitio"),jsonSitio.getInt("puntuacion"),jsonSitio.getString("direccion"));

            arraySitios.add(sitioTemp);

        }

        return arraySitios;
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
