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

public class docentes extends AppCompatActivity implements View.OnClickListener {
    ListView listaDatos;
    Button volver , alimentos , mecanica , contabilidad, electricidad;
    ArrayList<datos> Lista;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docentes);
        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<datos>();

        Lista.add(new datos("COORDINADORA TECNOLOGÍA SUPERIOR EN DESARROLLO DEL SOFTWARE & DOCENTE DE DESARROLLO DE SOFTWARE", 1 , R.drawable.ing_fabiola,"Fabiola Maritza Espinoza Castillo, Ing."));
        Lista.add(new datos("DOCENTE DE DESARROLLO DE SOFTWARE", 2 , R.drawable.ing_fernando,"Luis Fernando León Pinzón, Ing."));
        Lista.add(new datos("DOCENTE CARRERA DE SOFTWARE", 3 , R.drawable.ing_mario,"Mario Andrés Palma Jaramillo, Mgs."));
        Lista.add(new datos("DOCENTE DE DESARROLLO DE SOFTWARE", 4 , R.drawable.ing_jhon,"John Patricio Solano Cabrera, Ing."));

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

        electricidad= (Button) findViewById(R.id.listaelectricidad);
        electricidad.setOnClickListener(this);
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

    }
}