package com.example.jbarrientos.bilbapp.Presenter.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jbarrientos.bilbapp.Model.Translation;
import com.example.jbarrientos.bilbapp.R;

import java.util.ArrayList;

/**
 * Created by jbarrientos on 5/01/17.
 */

public class TranslationAdapter extends BaseAdapter {

    private ArrayList<Translation> listTranslations;
    protected Activity activity;

    public TranslationAdapter(Activity activity, ArrayList<Translation> translations) {
        this.activity=activity;
        this.listTranslations = translations;
    }

    @Override
    public int getCount() { return listTranslations.size(); }

    @Override
    public Object getItem(int position) { return listTranslations.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(convertView==null){
            LayoutInflater inf= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.translation_layout,null);
        }

        Translation transla= listTranslations.get(position);

        TextView tituloTrans = (TextView) v.findViewById(R.id.transView1);
        tituloTrans.setText(transla.getTitulo());

        TextView trans1Trans = (TextView) v.findViewById(R.id.transView2);
        trans1Trans.setText(transla.getTrans1());
        TextView trans2Trans = (TextView) v.findViewById(R.id.transView3);
        trans2Trans.setText(transla.getTrans2());

        return v;
    }

}
