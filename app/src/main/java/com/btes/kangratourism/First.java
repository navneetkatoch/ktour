package com.btes.kangratourism;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class First extends AppCompatActivity {
    TextView textView5;
    ImageView imageView3;
    GridView grid;
    String s[] = {"Temples", "Lakes", "Tourist Places", "Treking Places", "Hotels", "Transport Facility"};
    int image[] = {R.drawable.temple, R.drawable.lake, R.drawable.tourism, R.drawable.trek, R.drawable.taragarh, R.drawable.himachal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        grid = (GridView) findViewById(R.id.grid);
        Intent i=getIntent();

        MyAdapter2 adapter1 = new MyAdapter2(getApplicationContext(), s, image);
        grid.setAdapter(adapter1);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent i2 =new Intent(getApplicationContext(),Second.class);
                i2.putExtra("S1",grid.getItemAtPosition(i).toString());
                startActivity(i2);
            }
        });

    }

    class MyAdapter2 extends ArrayAdapter {
        int imgarray[];
        String stitle[];

        MyAdapter2(Context contex, String s[], int image[]) {
            super(contex, R.layout.gridview, R.id.textView5, s);
            imgarray = image;
            stitle = s;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflator = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflator.inflate(R.layout.gridview, parent, false);
            ImageView myImage = (ImageView) row.findViewById(R.id.imageView3);
            TextView myTitle = (TextView) row.findViewById(R.id.textView5);

            myImage.setImageResource(imgarray[position]);
            myTitle.setText(stitle[position]);

            return row;


        }
    }
}