package com.btes.kangratourism;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView txttemple;
    ImageView imgtemple;
    String s[]={"Baglamukhi Temple","Jwalamukhi Temple","Brijeshwari Temple","Baijnath Temple","Mahakal Temple","Chamunda Devi Temple","Aghanzar Temple","Indru Nag Temple","Masroor Rock Cut Temple ","Bhagsunath Temple","Kunal Pathri Temple","Nagni Mata Temple"};
    int image[]={R.drawable.baglamukhi,R.drawable.jwalaji,R.drawable.kangra,R.drawable.baijnathtemple,R.drawable.mahakaal,R.drawable.chamunda,R.drawable.aghanjarmahadevtemple,R.drawable.indrunagtemple,R.drawable.masroor_temple,R.drawable.bhagsutemple,R.drawable.kunalpathri,R.drawable.nagani};
    String ls[]={"Dal Lake","Maharana Partap Sagar Lake","Kareri Lake"};
    int limage[]={R.drawable.dallake1,R.drawable.maharanapratapsagar,R.drawable.kareri};
    String ts[]={"Heritage Village Pragpur","Kangra Fort","Bhatu Monestari","Palampur Tea Garden","Gopalpur Zoo","Sobha Singh Art Gallery","Mcleodganj Monestari","Bhagsu Water Fall","Gyuto Monastery","Pong Dam Sanchutary"};
    int timage[]={R.drawable.heritage,R.drawable.kangrafort,R.drawable.bhatumonestri,R.drawable.palampurtea,R.drawable.gopalpurzoo,R.drawable.sobhasinghsartgallery,R.drawable.dalai,R.drawable.bhagsu,R.drawable.gyto,R.drawable.pong};
   String trs[]={"Bada Bhangal","Himani Chamunda","Triund and Indhar Pass"};
   int trsimage[]={R.drawable.badabhangal,R.drawable.himanichamunda,R.drawable.triund1};
   String hs[]={"The Citadel Resorts Hotel", "The Exotica Hotel","The Origin Hotel","Center Point Hotel","Nature Bloom Resort Hotel","White Ridge Hotel","Kangra Rodeway Inn Hotel","Mayur Hotel ","Club Mahindra Dharamshala Hotel","The Pavilion Hotel","The Grand Raj Hotel ","Taragarh Palace Hotel"};
   int himage[]={R.drawable.thecitaderesortshotel,R.drawable.theexoticahotel,R.drawable.theoriginhotel,R.drawable.centerpointhotel,R.drawable.naturebloomresorthotel,R.drawable.whiteridgehotel,R.drawable.hotelkangrarodeway,R.drawable.mayurhotel,R.drawable.cmahindradharamshala,R.drawable.thepavilionhotel,R.drawable.thegrandrajhotel,R.drawable.taragarhpalacehotel1};
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
        
        ltsview=(ListView) findViewById(R.id.ltsview);
        switch(s1) {

            case "Temples":
                toolbar.setTitle("Temples");
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
                toolbar.setTitle("Lakes");
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
                toolbar.setTitle("Tourist Places");
                MyAdapter2 adapter2=new MyAdapter2(getApplicationContext(),ts,timage);
                ltsview.setAdapter(adapter2);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i1 = new Intent(getApplicationContext(), Blankfragment.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);
                    }
                });
                break;
            case "Trekking Places":
                toolbar.setTitle("Trekking Places");
                MyAdapter2 adapter4=new MyAdapter2(getApplicationContext(),trs,trsimage);
                ltsview.setAdapter(adapter4);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i1 = new Intent(getApplicationContext(), Blankfragment.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);
                    }
                });
                break;
            case "Hotels":
                toolbar.setTitle("Hotels");
                MyAdapter2 adapter5=new MyAdapter2(getApplicationContext(),hs,himage);
                ltsview.setAdapter(adapter5);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i1 = new Intent(getApplicationContext(), Blankfragment.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);
                    }
                });
                break;
            case "Transport Facility":
                toolbar.setTitle("Transport Facility");
                MyAdapter2 adapter6=new MyAdapter2(getApplicationContext(),s,image);
                ltsview.setAdapter(adapter6);
                ltsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                       Intent i1 = new Intent(getApplicationContext(), Blankfragment.class);
                        i1.putExtra("S", ltsview.getItemAtPosition(i).toString());
                        startActivity(i1);
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
        @SuppressLint("ViewHolder") View row = inflator.inflate(R.layout.litview, parent, false);
        ImageView myImage = row.findViewById(R.id.imgtemple);
        TextView myTitle = row.findViewById(R.id.txttemple);

        myImage.setImageResource(imgarray[position]);
        myTitle.setText(stitle[position]);

        return row;


    }
}
