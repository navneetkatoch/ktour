package com.btes.kangratourism;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterViewFlipper;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Gallery extends AppCompatActivity {
    private AdapterViewFlipper adapterViewFlipper;
    int images[] = {R.drawable.kangrafort, R.drawable.badabhangal, R.drawable.dallake1, R.drawable.gyto, R.drawable.kareri,R.drawable.bhatumonestri};
   // private int mPosition = -1;
    String s[]={"Kangra Fort","Bada Bhangal","Dal Lake","Gyto Monestari","Kareri Lake","Bhatu Monestari"};
    int images1[] = {R.drawable.back,R.drawable.kangrafort, R.drawable.badabhangal, R.drawable.dallake1, R.drawable.gyto, R.drawable.kareri,R.drawable.bhatumonestri};

    String s2[]={" ","Kangra Fort","Bada Bhangal","Dal Lake","Gyto Monestari","Kareri Lake","Bhatu Monestari"};
    ImageButton imageview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Gallry");




        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.adapterviewflipper);
        FlipperAdapter adapter1 = new FlipperAdapter(this, images,s,images1,s2);
        adapterViewFlipper.setAdapter(adapter1);
        adapterViewFlipper.setAutoStart(true);
        //Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }

    class FlipperAdapter extends ArrayAdapter {
        Context ctx;
        int[] image;
        String text1[];
        int[] image1;
        String text2[];
        LayoutInflater inflater;


        public FlipperAdapter(Context context, int[] images, String[] s1,int[] images1,String[] s2) {
            super(context,R.layout.flipper_item,R.id.imageview1,s);
            this.ctx = context;
            this.image = images;
            this.text1=s1;
            this.image1=images1;
            this.text2=s2;
            inflater = LayoutInflater.from(context);


        }


        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=inflater.inflate(R.layout.flipper_item,null);
           ImageView timage=(ImageView) view.findViewById(R.id.imageview1);

            TextView ttext=(TextView)view.findViewById(R.id.textgallery);
            ImageView t1image=(ImageView) view.findViewById(R.id.imageview2);
            //TextView t1text=(TextView)view.findViewById(R.id.textgallery1);
            timage.setImageResource(image[i]);
            ttext.setText(text1[i]);
            t1image.setImageResource(image1[i]);
           // t1text.setText(text2[i]);
            return view;
        }

    }

}
