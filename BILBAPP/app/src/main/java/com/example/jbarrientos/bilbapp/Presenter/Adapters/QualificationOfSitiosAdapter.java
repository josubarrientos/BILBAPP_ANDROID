package com.example.jbarrientos.bilbapp.Presenter.Adapters;

/**
 * Created by jbarrientos on 4/01/17.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jbarrientos.bilbapp.Model.Sitios;
import com.example.jbarrientos.bilbapp.R;
import com.example.jbarrientos.bilbapp.Presenter.Activities.RatingActivity;
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

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(convertView==null){
            LayoutInflater inf= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.name_of_sitio_layout,null);
        }

        final Sitios sitio= listSitios.get(position);

        TextView nombreSitio = (TextView) v.findViewById(R.id.nombreSitio);
        nombreSitio.setText(sitio.getNombre());
        nombreSitio.setTextSize(TypedValue.COMPLEX_UNIT_SP,22);
        nombreSitio.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), RatingActivity.class);
                i.putExtra("extra_text", sitio.getNombre());
                v.getContext().startActivity(i);
            }
        });

        return v;
    }


}
