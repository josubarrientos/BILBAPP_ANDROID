package com.example.jbarrientos.bilbapp.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jbarrientos.bilbapp.ExpericenceShowActivity;
import com.example.jbarrientos.bilbapp.Model.Sitios;
import com.example.jbarrientos.bilbapp.R;

import java.util.ArrayList;

public class ExperiencesInSitiosAdapter extends BaseAdapter {

    private ArrayList<Sitios> listSitios;
    protected Activity activity;

    public ExperiencesInSitiosAdapter(Activity activity, ArrayList<Sitios> sitios) {
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
        nombreSitio.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), ExpericenceShowActivity.class);
                i.putExtra("extra_text", sitio.getNombre());
                v.getContext().startActivity(i);

            }
        });

        return v;
    }

}
