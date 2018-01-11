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
            case"Baglamukhi Temple":
                LatLng bagla = new LatLng(31.9679, 76.2053);
                mMap.addMarker(new MarkerOptions().position(bagla).title("Baglamukhi Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bagla));
                break;
            case "Jwalamukhi Temple":
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
                mMap.addMarker(new MarkerOptions().position(chamunda).title("Chamunda Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(chamunda));
                break;
            case "MASROOR TEMPLE":
                LatLng masroor = new LatLng(32.0729, 76.13);
                mMap.addMarker(new MarkerOptions().position(masroor).title("Masroor Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(masroor));
                break;
            case "BHAGSUNAG TEMPLE":
                LatLng bhagsu  = new LatLng(32.2465, 76.3326);
                mMap.addMarker(new MarkerOptions().position(bhagsu).title("Bhagsunag Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bhagsu));
                break;
            case "KUNAL PATHRI TEMPLE":
                LatLng kunal  = new LatLng(32.2726, 76.357);
                mMap.addMarker(new MarkerOptions().position(kunal).title("Kunal Pathri Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(kunal));
                break;
            case"NAGNI TEMPLE":
                LatLng nagni  = new LatLng(32.2943, 75.944);
                mMap.addMarker(new MarkerOptions().position(nagni).title("Nagni Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(nagni));
                break;
            case"Mahakal Temple":
                LatLng maha  = new LatLng(32.0088, 76.6536);
                mMap.addMarker(new MarkerOptions().position(maha).title("Mahakal Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(maha));
                break;
            case"Aghanzar Temple":
                LatLng agh  = new LatLng(32.2208, 76.3344);
                mMap.addMarker(new MarkerOptions().position(agh).title("Aghanzar Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(agh));
                break;
            case"Indru Nag Temple":
                LatLng indru  = new LatLng(32.2208, 76.3347);
                mMap.addMarker(new MarkerOptions().position(indru).title("Indru Nag Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(indru));
                break;
            case "Kareri Lake":
                LatLng kareri  = new LatLng(32.3257, 76.2734);
                mMap.addMarker(new MarkerOptions().position(kareri).title("Kareri Lake"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(kareri));
                break;
            case "Dal Lake":
                LatLng dal  = new LatLng(32.2471, 76.3107);
                mMap.addMarker(new MarkerOptions().position(dal).title("Dal Lake"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(dal));
                break;
            case "Maharana Partap Sagar Lake":
                LatLng mahar  = new LatLng(31.9766, 76.0508);
                mMap.addMarker(new MarkerOptions().position(mahar).title("Maharana Partap Sagar Lake"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(mahar));
                break;
            case "Heritage Village Pragpur":
                LatLng hvp  = new LatLng(31.8229, 76.2117);
                mMap.addMarker(new MarkerOptions().position(hvp).title("Heritage Village Pragpur"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(hvp));
                break;
            case "Kangra Fort":
                LatLng kf  = new LatLng(32.0873, 76.2561);
                mMap.addMarker(new MarkerOptions().position(kf).title("Kangra Fort"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(kf));
                break;
            case "Bhatu Monestari":
                LatLng bm  = new LatLng(31.8618, 76.4568);
                mMap.addMarker(new MarkerOptions().position(bm).title("Bhatu Monestari"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bm));
                break;
            case "Palampur Tea Garden":
                LatLng ptg  = new LatLng(32.1108, 76.5362);
                mMap.addMarker(new MarkerOptions().position(ptg).title("Palampur Tea Garden"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(ptg));
                break;
            case "Gopalpur Zoo":
                LatLng gz  = new LatLng(32.1406, 76.4551);
                mMap.addMarker(new MarkerOptions().position(gz).title("Gopalpur Zoo"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(gz));
                break;
            case "Sobha Singh Art Gallery":
                LatLng ssag  = new LatLng(32.0388, 76.5705);
                mMap.addMarker(new MarkerOptions().position(ssag).title("Sobha Singh Art Gallery"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(ssag));
                break;
            case "Mcleodganj Monestari":
                LatLng mm = new LatLng(32.2426, 76.3213);
                mMap.addMarker(new MarkerOptions().position(mm).title("Mcleodganj Monestari"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(mm));
                break;
            case "Bhagsu Water Fall":
                LatLng bwf  = new LatLng(32.2486, 76.3399);
                mMap.addMarker(new MarkerOptions().position(bwf).title("Bhagsu Water Fall"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bwf));
                break;
            case "Gyuto Monastery":
                LatLng gm  = new LatLng(32.1972, 76.3409);
                mMap.addMarker(new MarkerOptions().position(gm).title("Gyuto Monastery"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(gm));
                break;
            case "Pong Dam Sanchutary":
                LatLng pds  = new LatLng(31.9766, 76.0508);
                mMap.addMarker(new MarkerOptions().position(pds).title("Pong Dam Sanchutary"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(pds));
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
