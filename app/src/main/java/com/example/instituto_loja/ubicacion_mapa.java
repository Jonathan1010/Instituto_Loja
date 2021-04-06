package com.example.instituto_loja;

import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ubicacion_mapa extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;

    Button twitter, facebook, instagram , menu , institucion , camara , ayuda , sitioweb  ,youtube, mapa;
    Button volver;

    private String urlfacebook;
    private String urlinstagram;
    private String urltwitter;
    private String urlyoutube;
    private String urlsitioweb;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if(status == ConnectionResult.SUCCESS){
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

        }else{
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status,(Activity)getApplicationContext(),10);
            dialog.show();
        }


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        urltwitter ="https://twitter.com/Tecnologicoloja";

        urlsitioweb = "https://tecnologicoloja.edu.ec/";

        twitter = (Button) findViewById(R.id.twitter);
        twitter.setOnClickListener(this);

        urlfacebook="https://www.facebook.com/TecnologicoLoja";
        facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(this);


        urlinstagram="https://www.instagram.com/tecnologicoloja/";

        urlyoutube = "https://www.youtube.com/channel/UCKcQ2KvksH21kCAZ76daGoA";
        instagram = (Button) findViewById(R.id.instagram);
        instagram.setOnClickListener(this);


        /*camara = (Button) findViewById(R.id.camara);
        camara.setOnClickListener(this);*/


        youtube = (Button) findViewById(R.id.youtube);
        youtube.setOnClickListener(this);

        volver = (Button) findViewById(R.id.volvermapa);
        volver.setOnClickListener(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        UiSettings uiSettings = mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-3.974980, -79.205881);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Instituto Superior Tecnológico Loja").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        float zoomlevel = 16;

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,zoomlevel));
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        if(v == menu){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        /*if(v == camara){
            Intent i = new Intent(this, SampleCamActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }*/

        if(v == ayuda){
            Intent t = new Intent(this, Ayuda.class);
            startActivity(t);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == institucion){
            Intent i = new Intent(this,Conocenos.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == facebook){
            Uri uri = Uri.parse(urlfacebook);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        if(v == instagram){
            Uri uri = Uri.parse(urlinstagram);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        if(v == twitter){
            Uri uri = Uri.parse(urltwitter);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if(v == sitioweb){
            Uri uri = Uri.parse(urlsitioweb);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if(v == youtube){
            Uri uri = Uri.parse(urlyoutube);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        }
        if(volver == v){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }
}