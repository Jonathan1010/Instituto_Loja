package com.example.instituto_loja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mapa , conocenos , docentes, contactanos, camara , ayuda;
    EasySlider slider;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        mapa = (Button) findViewById(R.id.mapa_google);
        mapa.setOnClickListener(this);

        conocenos = (Button) findViewById(R.id.btn_conocenos);
        conocenos.setOnClickListener(this);

        docentes = (Button) findViewById(R.id.docentes);
        docentes.setOnClickListener(this);

        contactanos = (Button) findViewById(R.id.contactanosel);
        contactanos.setOnClickListener(this);

        ayuda = (Button) findViewById(R.id.ayudaaa);
        ayuda.setOnClickListener(this);





        slider = findViewById(R.id.fotosinicio);
        List<SliderItem> easysliders = new ArrayList<>();
        easysliders.add(new SliderItem("Extension Vilcabamba", R.drawable.vilcabamba_galeria));
        easysliders.add(new SliderItem("Loja", R.drawable.lojamv));
        easysliders.add(new SliderItem("Feria en el municipio de Loja", R.drawable.servicioelectrico));
        easysliders.add(new SliderItem("Proyectos", R.drawable.prtoyectos));



        slider.setPages(easysliders);

    }

    /*public void wikitude(View view) {
        String nombre_paquete ="com.android.tools.build:gradle:3.2.1";
        Intent o = new Intent();
        PackageManager manager = getPackageManager();
        o = manager.getLaunchIntentForPackage(nombre_paquete);
        o.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(o);
    }*/

    public void wikitude(View view) {
        String nombre_paquete = "com.wikitude.wikitudestudioandroidapptemplate";
//com.android.tools.build:gradle:3.2.1
        Intent i = new Intent();
        PackageManager manager = getPackageManager();
        i = manager.getLaunchIntentForPackage(nombre_paquete);
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);

    }


    @Override
    public void onClick(View v) {
        if(mapa == v){
            Intent i = new Intent(this, ubicacion_mapa.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(conocenos == v){
            Intent i = new Intent(this, Conocenos.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(docentes == v){
            Intent i = new Intent(this, docentes.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(contactanos == v){
            Intent i = new Intent(this, contactanos.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(ayuda == v){
            Intent i = new Intent(this, Ayuda.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        /*if(v == camara) {
            Intent r = new Intent(this, SampleCamActivity.class);
            startActivity(r);
        }*/

    }
}