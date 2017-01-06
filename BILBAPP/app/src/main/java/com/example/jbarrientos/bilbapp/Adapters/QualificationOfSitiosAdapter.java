package com.example.jbarrientos.bilbapp.Adapters;

/**
 * Created by jbarrientos on 4/01/17.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.RatingBar.OnRatingBarChangeListener;


import com.example.jbarrientos.bilbapp.Model.DataSender;
import com.example.jbarrientos.bilbapp.Model.Sitios;
import com.example.jbarrientos.bilbapp.R;

import java.util.ArrayList;

public class QualificationOfSitiosAdapter extends BaseAdapter{

    private ArrayList<Sitios> listSitios;
    protected Activity activity;

    public QualificationOfSitiosAdapter(Activity activity, ArrayList<Sitios> sitios) {
        this.activity=activity;
        this.listSitios = sitios;
    }

    @Override
    public int getCount() { return listSitios.size(); }

    @Override
    public Object getItem(int position) { return listSitios.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {

        View v = convertView;

        if(convertView==null){
            LayoutInflater inf= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.static_sitio_layout,null);
        }

        final Sitios sitio= listSitios.get(position);

        TextView nombreSitio = (TextView) v.findViewById(R.id.nombreSitio);
        nombreSitio.setText(sitio.getNombre());
        final RatingBar califSitio = (RatingBar) v.findViewById(R.id.calificacionSitio);

        final View volcado = v;

        califSitio.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                califSitio.setIsIndicator(true);

                DataSender sender = new DataSender();

                sender.sendQualification(volcado.getContext(),sitio.getNombre(),sitio.getCalificacion());


            }
        });

        return v;
    }

}
