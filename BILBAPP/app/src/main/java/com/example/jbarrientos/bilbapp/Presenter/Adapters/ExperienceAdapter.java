package com.example.jbarrientos.bilbapp.Presenter.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jbarrientos.bilbapp.Model.Experience;
import com.example.jbarrientos.bilbapp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by jbarrientos on 5/01/17.
 */

public class ExperienceAdapter extends BaseAdapter {

    private ArrayList<Experience> listExperiences;
    protected Activity activity;

    public ExperienceAdapter(Activity activity, ArrayList<Experience> experiences) {
        this.activity=activity;
        this.listExperiences = experiences;
    }

    @Override
    public int getCount() { return listExperiences.size(); }

    @Override
    public Object getItem(int position) { return listExperiences.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(convertView==null){
            LayoutInflater inf= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.experience_layout,null);
        }

        Experience exper= listExperiences.get(position);

        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MMM/yyyy");

        TextView tituloTrans = (TextView) v.findViewById(R.id.experView1);
        tituloTrans.setText(exper.getNombre());

        TextView trans1Trans = (TextView) v.findViewById(R.id.experView2);
        trans1Trans.setText(sdfr.format(exper.getFecha()));
        TextView trans2Trans = (TextView) v.findViewById(R.id.experView3);
        trans2Trans.setText(exper.getOpinion());

        return v;
    }

}
