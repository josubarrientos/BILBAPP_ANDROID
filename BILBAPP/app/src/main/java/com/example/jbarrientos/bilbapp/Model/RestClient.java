package com.example.jbarrientos.bilbapp.Model;

/**
 * Created by jbarrientos on 14/01/17.
 */

import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class RestClient {


    private final String baseUrl;

    public RestClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    private HttpURLConnection getConnection(String path) throws IOException {
        URL url = new URL(String.format("%s/%s", baseUrl, path));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Connection","Keep-Alive");
        return conn;
    }

    public String getString(String path) throws IOException {
        HttpURLConnection conn = null;
        try {
            conn = getConnection(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String volcado = br.readLine();
            br.close();
            return volcado;
        } finally {
            if (conn != null)
                conn.disconnect();
        }
    }

    public JSONObject getJson(String path) throws IOException, JSONException {
        return new JSONObject(getString(path));
    }

    public int postJson(final JSONObject json, String path) throws IOException {
        HttpURLConnection conn = null;
        try {
            conn = getConnection(path);
            System.out.println("conexión recuperada");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            PrintWriter pw = new PrintWriter(conn.getOutputStream());
            pw.print(json.toString());
            pw.close();
            return conn.getResponseCode();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

}
