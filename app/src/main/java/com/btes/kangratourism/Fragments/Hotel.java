package com.btes.kangratourism.Fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
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
import com.android.volley.toolbox.Volley;
import com.btes.kangratourism.Maps;
import com.btes.kangratourism.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;


public class Hotel extends Fragment {
    HashMap<String, String> templename;
    TextView textView2;
    ImageView imageView2;
    Button btnmap;
    Toolbar toolbar;
    String name,description,s;
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

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_temples, container, false);
        toolbar = (Toolbar) rootview.findViewById(R.id.toolbar);
        textView2=(TextView) rootview.findViewById(R.id.textView2);
        imageView2=(ImageView)rootview.findViewById(R.id.imageView2) ;
        btnmap=(Button)rootview.findViewById(R.id.btnmap);
        pDialog = new ProgressDialog(getActivity());
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);
        templename = new HashMap<String, String>();
        s = getArguments().getString("S");

        Log.e("NAVNEET",s);
        requestQueue = Volley.newRequestQueue(this.getActivity());
        String JsonURL = "https://busy-additives.000webhostapp.com/hello/hotels.php";
        showpDialog();
        JsonArrayRequest obreq = new JsonArrayRequest(Request.Method.GET, JsonURL,

                new Response.Listener<JSONArray>() {


                    @Override
                    public void onResponse(JSONArray response) {try {
                        for(int i = 0;i<response.length();i++) {
                            JSONObject jobj2=response.getJSONObject(i);
                            name=jobj2.getString("Name");
                            JSONObject jobj = response.getJSONObject(i);
                            description = jobj.getString("Description");
                            templename.put(name,description);
                           // Log.e("NAVNEET",name);

                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                       String s2=templename.get(s);
                       switch (s)
                        {
                            case "The Citadel Resorts Hotel":

                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.thecitaderesortshotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Baglamukhi Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "The Exotica Hotel":

                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.theexoticahotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Jwalamukhi Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "The Origin Hotel":
                                // toolbar.setTitle("BRIJESHWARI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.theoriginhotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BRIJESHWARI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Center Point Hotel":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.centerpointhotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BAIJNATH TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Nature Bloom Resort Hotel":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.naturebloomresorthotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Mahakal Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "White Ridge Hotel":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.whiteridgehotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","CHAMUNDA TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Kangra Rodeway Inn Hotel":

                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.kangrarodewayinnhotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Aghanzar Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Mayur Hotel ":

                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.mayurhotel );
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Indru Nag Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Club Mahindra Dharamshala Hotel":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.cmahindradharamshala);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","MASROOR TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "The Pavilion Hotel":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.thepavilionhotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BHAGSUNAG TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "The Grand Raj Hotel ":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.thegrandrajhotel);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","KUNAL PATHRI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Taragarh Palace Hotel":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.taragarhpalacehotel1);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","NAGNI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;

                        }
                        hidepDialog();


                    }

                },
                // The final parameter overrides the method onErrorResponse() and passes VolleyError
                //as a parameter
                new Response.ErrorListener() {
                    @Override
                    // Handles errors that occur due to Volley
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                        hidepDialog();
                    }
                }
        );
        requestQueue.add(obreq);
        return rootview;
    }

}
