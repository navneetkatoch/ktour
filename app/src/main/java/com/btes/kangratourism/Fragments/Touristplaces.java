package com.btes.kangratourism.Fragments;

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


public class Touristplaces extends Fragment {
    HashMap<String, String> templename;
    TextView textView2;
    ImageView imageView2;
    Button btnmap;
    Toolbar toolbar;
    String name,description,s;
    RequestQueue requestQueue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_touristplaces, container, false);
        toolbar = (Toolbar) rootview.findViewById(R.id.toolbar);
        textView2=(TextView) rootview.findViewById(R.id.textView2);
        imageView2=(ImageView)rootview.findViewById(R.id.imageView2) ;
        btnmap=(Button)rootview.findViewById(R.id.btnmap);
        templename = new HashMap<String, String>();
        s = getArguments().getString("S");
        Log.e("NAVNEET",s);
        requestQueue = Volley.newRequestQueue(this.getActivity());
        String JsonURL = "https://busy-additives.000webhostapp.com/hello/touristplaces.php";
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

                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                        //Log.e("hello",templename.toString());
                        String s2=templename.get(s);

                        //Toast.makeText(getContext(),s2,Toast.LENGTH_LONG).show();
                        switch (s)
                        {
                            case "Heritage Village Pragpur":
                                //toolbar("BAGLAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.heritage);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Heritage Village Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Kangra Fort":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.kangrafort);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Kangra Fort");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Bhatu Monestari":
                                // toolbar.setTitle("BRIJESHWARI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.bhatumonestri);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BRIJESHWARI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Palampur Tea Garden":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.palampurtea);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BAIJNATH TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Gopalpur Zoo":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.gopalpurzoo);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Mahakal Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Sobha Singh Art Gallery":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.sobhasinghsartgallery);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","CHAMUNDA TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Mcleodganj Monestari":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.dalai);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Aghanzar Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Bhagsu Water Fall":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.bhagsu);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Indru Nag Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Gyuto Monastery":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.gyto);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","MASROOR TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Pong Dam Sanchutary":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.pong);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BHAGSUNAG TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;


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
        requestQueue.add(obreq);


        return rootview;
    }
}
