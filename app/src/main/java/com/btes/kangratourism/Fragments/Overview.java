package com.btes.kangratourism.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.btes.kangratourism.R;


public class Overview extends Fragment {
    TextView textView4;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootview =  inflater.inflate(R.layout.fragment_overview, container, false);

        textView4=(TextView)rootview.findViewById(R.id.textView4);

        return rootview;
    }
}
