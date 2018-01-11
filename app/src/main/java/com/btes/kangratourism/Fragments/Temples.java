package com.btes.kangratourism.Fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
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


public class Temples extends Fragment {
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

    @Override
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
        String JsonURL = "https://busy-additives.000webhostapp.com/hello/temple.php";
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
                            Log.e("NAVNEET",name);

                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                        //Log.e("hello",templename.toString());
                        String s2=templename.get(s);
                        Log.e("NAVNEET",s2);

                        //Toast.makeText(getContext(),s2,Toast.LENGTH_LONG).show();
                        switch (s)
                        {
                            case "Baglamukhi Temple":

                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.baglamukhi);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Baglamukhi Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Jwalamukhi Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.jwalaji);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Jwalamukhi Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Brijeshwari Temple":
                                // toolbar.setTitle("BRIJESHWARI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.kangra);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BRIJESHWARI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Baijnath Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.baijnathtemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BAIJNATH TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Mahakal Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.mahakaal);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Mahakal Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Chamunda Devi Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.chamunda);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","CHAMUNDA TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Aghanzar Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.aghanjarmahadevtemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Aghanzar Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Indru Nag Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.indrunagtemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Indru Nag Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Masroor Rock Cut Temple ":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.masroor_temple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","MASROOR TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Bhagsunath Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.bhagsutemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BHAGSUNAG TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Kunal Pathri Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.kunalpathri);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","KUNAL PATHRI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Nagni Mata Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.nagani);
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
