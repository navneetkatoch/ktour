package com.btes.kangratourism.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.TimeFormatException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.btes.kangratourism.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Home extends Fragment {


    TextView textView4,txtweather;
    ImageView imageView4;
    RequestQueue requestQueue;
    String  temperature;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_home, container, false);

        textView4=(TextView)rootview.findViewById(R.id.textView4);
        txtweather=(TextView)rootview.findViewById(R.id.txtweather);
        imageView4=(ImageView)rootview.findViewById(R.id.imageView4);
        txtweather.setSelected(true);
        requestQueue = Volley.newRequestQueue(this.getActivity());
        String JsonURL = "http://dataservice.accuweather.com/currentconditions/v1/188524.json?apikey=QHhiovNjO8nqlb1wWic9DGfzAqgK8U1e";
        JsonArrayRequest obreq = new JsonArrayRequest(Request.Method.GET, JsonURL,

                new Response.Listener<JSONArray>() {


                    @Override
                    public void onResponse(JSONArray response) {
                        Log.e("===response===",""+response);
                        try {
                            for(int i = 0;i<response.length();i++) {
                                JSONObject jobj2=response.getJSONObject(i);
                                String date=jobj2.getString("LocalObservationDateTime");
                                String d1[]=date.split("T");
                                DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                                DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");
                                //TimeFormatException timeFormatException=new SimpleTimeZone("HH:mm:ss");
                                Date date2 = inputFormat.parse(d1[0]);
                                String outputDateStr = outputFormat.format(date2);
                                String time=d1[1].substring(0,5);
                                //SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

                                //Date date2=sdf.parse(d1[0]);
                                JSONObject jobj = response.getJSONObject(i);
                                String weather = jobj.getString("WeatherText");
                                JSONObject obarr = response.getJSONObject(i);
                                //temprature = obarr.getString("Temperature");
                                JSONObject jobj1 = obarr.getJSONObject("Temperature");
                                JSONObject obj2 = jobj1.getJSONObject("Metric");
                                temperature = obj2.getString("Value");
                                Log.e("===temp===",""+temperature+" "+time);


                                txtweather.setText("Temperature:"+" "+temperature+" Celsius " + weather+" "+outputDateStr+" "+time);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                },
                // The final parameter overrides the method onErrorResponse() and passes VolleyError
                //as a parameter
                new Response.ErrorListener() {
                    @Override
                    // Handles errors that occur due to Volley
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                    }
                }
        );
        // Adds the JSON object request "obreq" to the request queue
        requestQueue.add(obreq);




        return rootview;
    }

}
