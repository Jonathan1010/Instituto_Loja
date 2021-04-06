package com.example.instituto_loja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

public class docentescontabilidad extends AppCompatActivity implements View.OnClickListener {
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
        setContentView(R.layout.activity_docentescontabilidad);
        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<datos>();

        Lista.add(new datos("COORDINADORA DE LA CARRERA DE CONTABILIDAD & DOCENTE DE CONTABILIDAD", 1 , R.drawable.contabilidad1,"Ana María Alvarado Rodríguez, Ing."));
        Lista.add(new datos("DOCENTE DE CONTABILIDAD", 2 , R.drawable.contabilidad2,"Katerine Johanna Ramírez Alvarado, Ing."));
        Lista.add(new datos("DOCENTE DE CONTABILIDAD", 3 , R.drawable.contabilidad3,"Dalton Arturo Ricaurte Songor, Lic."));
        Lista.add(new datos("DOCENTE DE CONTABILIDAD", 4 , R.drawable.contabilidad4,"Pamela Cecilia Quituizaca Correa, Ing."));
        Lista.add(new datos("DOCENTE DE CONTABILIDAD", 5 , R.drawable.contabilidad5,"Maita Morocho Sonia Edith Ing."));
        Lista.add(new datos("DOCENTE DE CONTABILIDAD", 6 , R.drawable.contabilidad6,"Azalia del cisne Capa Torres Dra."));


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

        mecanica = (Button) findViewById(R.id.mecanicalistas);
        mecanica.setOnClickListener(this);

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

        if(v == mecanica){
            Intent intent = new Intent(this , docentesmecanica.class);
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