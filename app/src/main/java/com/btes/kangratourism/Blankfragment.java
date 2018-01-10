package com.btes.kangratourism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.btes.kangratourism.Fragments.Lakes;
import com.btes.kangratourism.Fragments.Temples;
import com.btes.kangratourism.Fragments.Touristplaces;
import com.btes.kangratourism.Fragments.Trekkingplaces;

public class Blankfragment extends FragmentActivity {
    String s1;
    private Temples t=null;
    private FragmentManager manager=null;
    private   FragmentTransaction ft,ft1,ft2,ft3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blankfragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        Intent i=getIntent();
                String s=i.getStringExtra("S");
                if(s.contains("Temple")){
                    s1="Temple";
                }
                else if(s.contains("Lake"))
                {
                    s1="Lake";
                }
                else if (s.contains("Bhangal")|| s.contains("Chamunda")|| s.contains("Pass"))
                {
                    s1="Trekking Places";
                }
                else
                {
                    s1="Tourist Places";
                }
        //Log.e("nnnnnn",s1);
                switch (s1)
                {
                    case "Temple":
                        toolbar.setTitle("Temple");
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
                    case "Tourist Places":
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("S", s);
                        Touristplaces tpl=new Touristplaces();
                        tpl.setArguments(bundle2);
                        manager=getSupportFragmentManager();
                        ft2=manager.beginTransaction();
                        ft2.add(R.id.fragmentblank,tpl);
                        ft2.commit();
                        break;
                    case "Trekking Places":
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("S", s);
                        Trekkingplaces tre=new Trekkingplaces();
                        tre.setArguments(bundle3);
                        manager=getSupportFragmentManager();
                        ft3=manager.beginTransaction();
                        ft3.add(R.id.fragmentblank,tre);
                        ft3.commit();
                        break;
                }











    }

}
