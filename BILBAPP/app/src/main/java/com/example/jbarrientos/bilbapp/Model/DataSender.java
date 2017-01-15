package com.example.jbarrientos.bilbapp.Model;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.jbarrientos.bilbapp.R;
import com.example.jbarrientos.bilbapp.View.ExpericenceShowActivity;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Created by jbarrientos on 5/01/17.
 */

public class DataSender {

    private RestClient restClient;
    private String server = "http://u017633.ehu.eus:28080/BILBAPP_SERVER/rest/Bilbapp";
    private String senderUserName;
    private String senderOpinion;
    private Context contx;
    private Context contxcaul;
    private String nombreDeSitio;

    public DataSender(){
        restClient = new RestClient(server);
    }

    public void sendExperiencia(Context ctx, final String nombreSitio) throws IOException, JSONException {

        contx=ctx;
        nombreDeSitio=nombreSitio;

        AlertDialog.Builder expDialog = new AlertDialog.Builder(ctx);

        LayoutInflater factory = LayoutInflater.from(ctx);
        final View f = factory.inflate(R.layout.experience_insert, null);

        expDialog.setTitle(ctx.getString(R.string.qualification_title)+" "+nombreSitio);
        expDialog.setView(f);

        Button submit = (Button)f.findViewById(R.id.submit);

        final AlertDialog dialog = expDialog.create();

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText name = (EditText)f.findViewById(R.id.user_name);
                EditText opinion = (EditText)f.findViewById(R.id.user_opinion);

                senderUserName = name.getText().toString();
                senderOpinion = opinion.getText().toString();

                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = df.format(c.getTime());

                final JSONObject jo = new JSONObject();
                try {
                    jo.put("critica",senderOpinion);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    jo.put("fecha",formattedDate);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    jo.put("usuario",senderUserName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    jo.put("sitio",nombreSitio);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                ExperiencePost(jo);

                dialog.dismiss();

            };

        });

        dialog.show();

    }

    public void sendQualification(Context ctx, String nombre,float nota) throws IOException, JSONException {

        contxcaul=ctx;

        final JSONObject joqua = new JSONObject();
        joqua.put("calificacion",nota);
        joqua.put("sitio",nombre);

        QualificationPost(ctx,joqua);

    }

    public void QualificationPost (final Context ctx, final JSONObject joqua){
        new QueryAsyncTask<Integer>(ctx) {
            @Override
            protected Integer work() throws Exception{
                return restClient.postJson(joqua,"addPuntuacion");
            }

            @Override
            protected void onFinish(Integer estado){

                if(estado==200){
                    Toast toast1 = Toast.makeText(contxcaul,R.string.post_response_code_OK, Toast.LENGTH_SHORT);
                    toast1.show();
                    ((Activity) contxcaul).finish();
                }else{
                    Toast toast1 =
                            Toast.makeText(contxcaul,R.string.post_response_code_NOK, Toast.LENGTH_SHORT);

                    toast1.show();
                }

            }
        }.execute();
    }


    public void ExperiencePost (final JSONObject jo){
        new QueryAsyncTask<Integer>(contx) {
            @Override
            protected Integer work() throws Exception{

                return restClient.postJson(jo,"addCriticas");
            }

            @Override
            protected void onFinish(Integer estado){

                if(estado==200){
                    Toast toast1 = Toast.makeText(contx,R.string.post_response_code_OK, Toast.LENGTH_SHORT);
                    toast1.show();
                    Intent i = new Intent(contx, ExpericenceShowActivity.class);
                    i.putExtra("extra_text", nombreDeSitio);
                    contx.startActivity(i);
                    ((Activity) contx).finish();
                }else{
                    Toast toast1 =
                            Toast.makeText(contx,R.string.post_response_code_NOK, Toast.LENGTH_SHORT);

                    toast1.show();
                }

            }
        }.execute();
    }


}