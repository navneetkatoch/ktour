package com.btes.kangratourism.Fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
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
import com.btes.kangratourism.Maps;
import com.btes.kangratourism.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;


public class Lakes extends Fragment {
    HashMap<String, String> templename;
    TextView textView2;
    ImageView imageView2;
    Button btnmap;
    String s,s2,name,description;
    RequestQueue requestQueue;
    private ProgressDialog pDialog;
    private void showpDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }
    private void hidepDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.fragment_lakes, container, false);
        textView2=(TextView) rootview.findViewById(R.id.textView2);
        imageView2=(ImageView)rootview.findViewById(R.id.imageView2) ;
        btnmap=(Button)rootview.findViewById(R.id.btnmap);
        pDialog = new ProgressDialog(getActivity());
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);
        templename = new HashMap<String, String>();
        s = getArguments().getString("S");
         requestQueue = Volley.newRequestQueue(getActivity());
        String JsonURL = "https://busy-additives.000webhostapp.com/hello/lake.php";
        showpDialog();
        JsonArrayRequest obreq = new JsonArrayRequest(Request.Method.GET, JsonURL,

                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                      try {
                            for(int i = 0;i<response.length();i++) {
                                JSONObject jobj2=response.getJSONObject(i);
                                name=jobj2.getString("Name");
                                JSONObject jobj = response.getJSONObject(i);
                                description = jobj.getString("Description");
                                templename.put(name,description);

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        //Log.e("hello",templename.toString());
                         s2=templename.get(s);
                         switch (s)
                         {
                                     case"Kareri Lake":
                                 textView2.setText(s2);
                                 imageView2.setImageResource(R.drawable.kareri);
                                         btnmap.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent i=new Intent(getActivity(),Maps.class);
                                                 i.putExtra("S","Kareri Lake");
                                                 startActivity(i);
                                             }
                                         });
                                 break;
                                case"Dal Lake":
                                textView2.setText(s2);
                                  imageView2.setImageResource(R.drawable.dallake1);
                                    btnmap.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent i=new Intent(getActivity(),Maps.class);
                                            i.putExtra("S","Dal Lake");
                                            startActivity(i);
                                        }
                                    });
                               break;
                                 case"Maharana Partap Sagar Lake":
                                   textView2.setText(s2);
                                   imageView2.setImageResource(R.drawable.maharanapratapsagar);
                                     btnmap.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             Intent i=new Intent(getActivity(),Maps.class);
                                             i.putExtra("S","Maharana Partap Sagar Lake");
                                             startActivity(i);
                                         }
                                     });
                                 break;
                         }
                         hidepDialog();

                        }

                },
               new Response.ErrorListener() {
                    @Override
                    // Handles errors that occur due to Volley
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");hidepDialog();
                    }
                }
        );
        requestQueue.add(obreq);
       return rootview;
    }

    // TODO: Rename method, update argument and hook method into UI event

    }


