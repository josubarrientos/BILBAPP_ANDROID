package com.example.jbarrientos.bilbapp.Presenter.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jbarrientos.bilbapp.Presenter.DataSender;
import com.example.jbarrientos.bilbapp.R;

import org.json.JSONException;

import java.io.IOException;

public class RatingActivity extends AppCompatActivity {

    private String placeName;
    private DataSender ds = new DataSender();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        placeName = getIntent().getStringExtra("extra_text");

        TextView tv = (TextView) findViewById(R.id.CualificationTarget);
        tv.setText(placeName);

        System.out.println(placeName);

    }

    public void sendRating(View v) throws IOException, JSONException {

        RatingBar rt = (RatingBar) findViewById(R.id.CualificationBar);
        rt.setIsIndicator(true);

        if(rt.getRating() == 0.0){

            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        }else{

            float nota = rt.getRating();
            ds.sendQualification(RatingActivity.this,placeName,nota);
        }

    }
}
