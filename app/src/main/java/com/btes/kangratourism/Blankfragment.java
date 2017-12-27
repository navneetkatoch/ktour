package com.btes.kangratourism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;

import com.btes.kangratourism.Fragments.Lakes;
import com.btes.kangratourism.Fragments.Temples;

public class Blankfragment extends FragmentActivity {
    String s1;
    private Temples t=null;
    private FragmentManager manager=null;
    private   FragmentTransaction ft,ft1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blankfragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        Intent i=getIntent();
                String s=i.getStringExtra("S");
                if(s.contains("TEMPLE")){
                    s1="Temple";
                }
                else if(s.contains("Lake"))
                {
                    s1="Lake";
                }
                switch (s1)
                {
                    case "Temple":
                    Bundle bundle = new Bundle();
                    bundle.putString("S", s);
                    t=new Temples();
                    t.setArguments(bundle);
                    manager=getSupportFragmentManager();
                    ft=manager.beginTransaction();
                    ft.add(R.id.fragmentblank,t);
                    ft.commit();
                    break;
                    case "Lake":
                        Bundle bundle1 = new Bundle();
                        bundle1.putString("S", s);
                        Lakes l=new Lakes();
                        l.setArguments(bundle1);
                        manager=getSupportFragmentManager();
                        ft1=manager.beginTransaction();
                        ft1.add(R.id.fragmentblank,l);
                        ft1.commit();
                        break;
                }











    }

}
