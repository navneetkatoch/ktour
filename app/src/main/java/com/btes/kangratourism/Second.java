package com.btes.kangratourism;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.btes.kangratourism.Fragments.Temples;


import java.util.HashMap;

public class Second extends AppCompatActivity {
    TextView txttemple;
    ImageView imgtemple;
    String s[]={"BAGLAMUKHI TEMPLE","JWALAMUKHI TEMPLE","BRIJESHWARI TEMPLE","BAIJNATH TEMPLE","CHAMUNDA TEMPLE","MASROOR TEMPLE","BHAGSUNAG TEMPLE","KUNAL PATHRI TEMPLE","NAGNI TEMPLE"};
    int image[]={R.drawable.baglamukhi,R.drawable.jwalaji,R.drawable.kangra,R.drawable.baijnathtemple,R.drawable.chamundakangara,R.drawable.masroor_temple,R.drawable.bhagsutemple,R.drawable.kunalpathri,R.drawable.nagani};
    String ls[]={"Dal Lake","Maharana Partap Sagar Lake","Kareri Lake"};
    int limage[]={R.drawable.dallake1,R.drawable.maharanapratapsagar,R.drawable.kareri};
    ListView ltsview;
    Toolbar toolbar;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent i=getIntent();

        //getActionBar().setTitle("Temple Categories");
        String s1=i.getStringExtra("S1");
        toolbar.setTitle(s1);
        ltsview=(ListView) findViewById(R.id.ltsview);
        switch(s1) {

            case "Temples":
            MyAdapter2 adapter1=new MyAdapter2(getApplicationContext(),s,image);
            ltsview.setAdapter(adapter1);
            ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                   Intent i1=new Intent(getApplicationContext(),Blankfragment.class);
                    i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                    startActivity(i1);

                }
            });
            break;
            case "Lakes":
                MyAdapter2 adapter=new MyAdapter2(getApplicationContext(),ls,limage);
                ltsview.setAdapter(adapter);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        toolbar.setTitle("Lakes");
                       Intent i1 = new Intent(getApplicationContext(), Blankfragment.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);
                    }
                });
                break;
            case "Tourist Places":
                MyAdapter2 adapter2=new MyAdapter2(getApplicationContext(),s,image);
                ltsview.setAdapter(adapter2);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                       /* Intent i1 = new Intent(getApplicationContext(), baijnath.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);*/
                    }
                });
                break;
            case "Stadium":
                MyAdapter2 adapter4=new MyAdapter2(getApplicationContext(),s,image);
                ltsview.setAdapter(adapter4);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                       /* Intent i1 = new Intent(getApplicationContext(), baijnath.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);*/
                    }
                });
                break;
            case "Hotels":
                MyAdapter2 adapter5=new MyAdapter2(getApplicationContext(),s,image);
                ltsview.setAdapter(adapter5);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        /* Intent i1 = new Intent(getApplicationContext(), baijnath.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);*/
                    }
                });
                break;
            case "Transport Facility":
                MyAdapter2 adapter6=new MyAdapter2(getApplicationContext(),s,image);
                ltsview.setAdapter(adapter6);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                       /* Intent i1 = new Intent(getApplicationContext(), baijnath.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);*/
                    }
                });
                break;



        }


        }
    }

class MyAdapter2 extends ArrayAdapter {
    int imgarray[];
    String stitle[];

    MyAdapter2(Context contex, String s[], int image[]) {
        super(contex, R.layout.litview, R.id.txttemple, s);
        imgarray = image;
        stitle = s;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflator.inflate(R.layout.litview, parent, false);
        ImageView myImage = (ImageView) row.findViewById(R.id.imgtemple);
        TextView myTitle = (TextView) row.findViewById(R.id.txttemple);

        myImage.setImageResource(imgarray[position]);
        myTitle.setText(stitle[position]);

        return row;


    }
}
