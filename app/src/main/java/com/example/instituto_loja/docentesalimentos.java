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

public class docentesalimentos extends AppCompatActivity implements View.OnClickListener {
    ListView listaDatos;
    Button volver , software, mecanica , contabilidad, electricidad , alimentos;
    ArrayList<datos> Lista;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docentesalimentos);
        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<datos>();

        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 1 , R.drawable.alimentos1,"Alexa Janina Rojas Rivera Ing."));
        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 2 , R.drawable.alimentos2,"Vanessa Soledad Arias Tapia Ing."));
        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 3 , R.drawable.alimentos3,"Sandra Del Cisne Santín Castillo, Ing."));
        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 4 , R.drawable.alimentos4,"Gabriela Alexandra Arciniega Alvarado, Mgs."));
        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 5 , R.drawable.alimentos5,"Juan Andrés Ordoñez Gutiérrez, Ing."));
        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 6 , R.drawable.alimentos6,"Mayra Isabel Calva Luzon Ing."));
        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 7 , R.drawable.alimentos7,"Margoth Alexandra Cabrera Cueva, Ing."));
        Lista.add(new datos("DOCENTE DE PROCESAMIENTO DE ALIMENTOS", 8 , R.drawable.alimentos8,"Alba Lorena Veintimilla Villavicencio, Ing."));

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
        software = (Button) findViewById(R.id.softwarelistas);
        software.setOnClickListener(this);
        contabilidad = (Button) findViewById(R.id.listacontabilidad);
        contabilidad.setOnClickListener(this);
        mecanica = (Button) findViewById(R.id.mecanicalistas);
        mecanica.setOnClickListener(this);


        alimentos = (Button) findViewById(R.id.listaalimentos);
        alimentos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == volver){
            Intent intent = new Intent(this , MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == software){
            Intent intent = new Intent(this , docentes.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == mecanica){
            Intent intent = new Intent(this , docentesmecanica.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == electricidad){
            Intent intent = new Intent(this , docenteselectricidad.class);
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
    }
}