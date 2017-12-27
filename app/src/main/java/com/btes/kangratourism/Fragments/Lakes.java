package com.btes.kangratourism.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.btes.kangratourism.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Lakes extends Fragment {

    TextView textView2;
    ImageView imageView2;
    Button btnmap;
    String name,photo,place;
    RequestQueue requestQueue;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.fragment_lakes, container, false);
        textView2=(TextView) rootview.findViewById(R.id.textView2);
        imageView2=(ImageView)rootview.findViewById(R.id.imageView2) ;
        btnmap=(Button)rootview.findViewById(R.id.btnmap);
        String s = getArguments().getString("S");
     requestQueue = Volley.newRequestQueue(getActivity());
        String JsonURL = "https://maps.googleapis.com/maps/api/place/textsearch/json?query=lakes+in+Kangra%20Distt&key=AIzaSyDpgyebhvpT-bN73rihFMAdVggSbLG2hXk";
        JsonObjectRequest obreq = new JsonObjectRequest(Request.Method.GET, JsonURL,

                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("===response===",""+response);
                        try {
                           // first1 = response.getString("results");
                            JSONArray obarr = response.getJSONArray("results");
                            for(int i = 0;i<obarr.length();i++) {
                                JSONObject jobj = obarr.getJSONObject(i);
                                name=jobj.getString("name");
                                textView2.setText(name);
                            }
                            JSONArray obarr1=response.getJSONArray("photos");
                            for(int i=0;i<obarr1.length();i++)
                            {
                                JSONObject jobj1=obarr1.getJSONObject(i);
                                photo=jobj1.getString("photo_reference");

                            }
                            } catch (JSONException e) {
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
        switch (s)
        {
            case"Kareri Lake":
                textView2.setText(name);
                imageView2.setImageResource(R.drawable.kareri);
                break;
            case"Dal Lake":
                textView2.setText(name);
                imageView2.setImageResource(R.drawable.dallake1);
                break;
            case"Maharana Partap Sagar Lake":
                textView2.setText(name);
                imageView2.setImageResource(R.drawable.maharanapratapsagar);
                break;
        }
        // Adds the JSON object request "obreq" to the request queue
       // requestQueue.add(obreq);



        return rootview;
    }

    // TODO: Rename method, update argument and hook method into UI event

    }


