package com.btes.kangratourism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.btes.kangratourism.Fragments.Category;
import com.btes.kangratourism.Fragments.Home;
import com.btes.kangratourism.Fragments.Overview;

public class drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        toolbar.setTitle("Kangra Tourism");
        Home c=new Home();
        toolbar.setTitle("Home");
        FragmentTransaction frg = getSupportFragmentManager().beginTransaction();
        frg.replace(R.id.fragmentoverview,c);
        frg.commit();





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);







    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return false;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            Home h=new Home();
            toolbar.setTitle("Home");
            FragmentTransaction frg = getSupportFragmentManager().beginTransaction();
            frg.replace(R.id.fragmentoverview,h);
            frg.commit();

        } else if (id == R.id.overview) {

            Overview o=new Overview();
            toolbar.setTitle("Overview");
            FragmentTransaction frg1 = getSupportFragmentManager().beginTransaction();
            frg1.replace(R.id.fragmentoverview,o);
            frg1.commit();


        } else if (id == R.id.categories) {
            Category c=new Category();

            toolbar.setTitle("Categories");
            FragmentTransaction frg1 = getSupportFragmentManager().beginTransaction();
            frg1.replace(R.id.fragmentoverview,c);
            frg1.commit();

        } else if (id == R.id.gallery) {

          Intent i=new Intent(getApplicationContext(), com.btes.kangratourism.Gallery.class);
            startActivity(i);


        } else if (id == R.id.share) {

        } else if (id == R.id.send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
