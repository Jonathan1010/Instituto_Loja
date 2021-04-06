package com.example.instituto_loja;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class docentesmecanica extends AppCompatActivity implements View.OnClickListener {
    ListView listaDatos;
    Button volver , alimentos , mecanica , contabilidad, electricidad , software;
    ArrayList<datos> Lista;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docentesmecanica);
        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<datos>();

        Lista.add(new datos("COORDINADOR TECNOLOGÍA SUPERIOR EN MECÁNICA AUTOMOTRIZ & DOCENTE DE MECÁNICA AUTOMOTRIZ", 1 , R.drawable.mecanica1,"Diego Javier Jiménez Pereira, Mgs."));
        Lista.add(new datos("DOCENTE DE LA TECNOLOGÍA EN MECÁNICA AUTOMOTRIZ", 2 , R.drawable.mecanica2,"Marco Vinicio Pucha Tambo, Mgs."));
        Lista.add(new datos("DOCENTE DE MECÁNICA AUTOMOTRIZ", 3 , R.drawable.mecanica3,"Marco Felipe Cabrera Erazo, Ing."));
        Lista.add(new datos("DOCENTE DE MECÁNICA AUTOMOTRIZ", 4 , R.drawable.mecanica4,"José Vicente Alvarado Rodríguez, Ing."));


        adaptador miadaptador = new adaptador(getApplicationContext(),Lista);
        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                datos obj = (datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), Detalles.class);
                paso.putExtra("objeto" , (Serializable) obj);
                startActivity(paso);
            }
        });



        volver = (Button) findViewById(R.id.volvermenu);
        volver.setOnClickListener(this);

        alimentos = (Button) findViewById(R.id.listaalimentos);
        alimentos.setOnClickListener(this);


        contabilidad = (Button) findViewById(R.id.listacontabilidad);
        contabilidad.setOnClickListener(this);


        software= (Button) findViewById(R.id.softwarelistas);
        software.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == volver){
            Intent intent = new Intent(this , MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v == alimentos){
            Intent intent = new Intent(this , docentesalimentos.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v == contabilidad){
            Intent intent = new Intent(this , docentescontabilidad.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == electricidad){
            Intent intent = new Intent(this , docenteselectricidad.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v == software){
            Intent intent = new Intent(this , docentes.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

    }
}