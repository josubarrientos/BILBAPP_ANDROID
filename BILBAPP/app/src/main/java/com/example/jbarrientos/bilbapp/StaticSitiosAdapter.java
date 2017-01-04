package com.example.jbarrientos.bilbapp;

/**
 * Created by jbarrientos on 4/01/17.
 */

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class StaticSitiosAdapter extends BaseAdapter{

    private ArrayList<Sitios> listSitios;
    private LayoutInflater lInflater;
    protected Activity activity;

    public StaticSitiosAdapter(Activity activity, ArrayList<Sitios> sitios) {
        this.activity=activity;
        this.listSitios = sitios;
    }

    @Override
    public int getCount() { return listSitios.size(); }

    @Override
    public Object getItem(int arg0) { return listSitios.get(arg0); }

    @Override
    public long getItemId(int arg0) { return arg0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(convertView==null){
            LayoutInflater inf= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.static_sitio_layout,null);
        }

        Sitios sitio= listSitios.get(position);
        Sitios dir= listSitios.get(position);

        TextView nombreSitio = (TextView) v.findViewById(R.id.nombreSitio);
        nombreSitio.setText(sitio.getNombre());
        TextView califSitio = (TextView) v.findViewById(R.id.calificacionSitio);
        califSitio.setText(sitio.getCalificacion());

        return v;
    }

}
