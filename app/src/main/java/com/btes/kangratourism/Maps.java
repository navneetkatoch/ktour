package com.btes.kangratourism;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback,

    GoogleApiClient.ConnectionCallbacks,
    GoogleApiClient.OnConnectionFailedListener,
    LocationListener
    {

    private GoogleMap mMap;
        GoogleApiClient mGoogleApiClient;
        Location mLastLocation;
        com.google.android.gms.maps.model.Marker mCurrLocationMarker;
        LocationRequest mLocationRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkLocationPermission();
        }
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

        private void checkLocationPermission() {
        }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Intent i=getIntent();
        String s=i.getStringExtra("S");
        switch (s)
        {
            case"BAGLAMUKHI TEMPLE":
                LatLng bagla = new LatLng(31.9679, 76.2053);
                mMap.addMarker(new MarkerOptions().position(bagla).title("Baglamukhi Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bagla));
                break;
            case "JWALAMUKHI TEMPLE":
                LatLng jwala = new LatLng(31.8752, 76.3203);
                mMap.addMarker(new MarkerOptions().position(jwala).title("Jwalamukhi Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(jwala));
                break;
            case "BRIJESHWARI TEMPLE":
                LatLng brijesh = new LatLng(32.1024, 76.27);
                mMap.addMarker(new MarkerOptions().position(brijesh).title("Brijeshwari Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(brijesh));
                break;
            case "BAIJNATH TEMPLE":
                LatLng baij = new LatLng(32.0507, 76.6456);
                mMap.addMarker(new MarkerOptions().position(baij).title("Baijnath Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(baij));
                break;
            case "CHAMUNDA TEMPLE":
                LatLng chamunda = new LatLng(32.1483, 76.4195);
                mMap.addMarker(new MarkerOptions().position(chamunda).title("Baijnath Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(chamunda));
                break;
            case "MASROOR TEMPLE":
                LatLng masroor = new LatLng(32.0729, 76.13);
                mMap.addMarker(new MarkerOptions().position(masroor).title("Masroor Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(masroor));
                break;




        }
        // Add a marker in Sydney and move the camera

    }

        @Override
        public void onConnected(@Nullable Bundle bundle) {

        }

        @Override
        public void onConnectionSuspended(int i) {

        }

        @Override
        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

        }

        @Override
        public void onLocationChanged(Location location) {

        }
    }
