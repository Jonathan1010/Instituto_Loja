package com.example.instituto_loja;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ayuda extends AppCompatActivity implements View.OnClickListener {
    Button menu, institucion , ayuda, camara , ubicacion , volver;



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);



       volver = (Button) findViewById(R.id.volverayuda);
        volver.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == menu){
            Intent m = new Intent(this, MainActivity.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == institucion){
            Intent m = new Intent(this, Conocenos.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        if(v == ayuda){
            Intent m = new Intent(this, Ayuda.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

        /*if(v == camara){
            Intent m = new Intent(this, SampleCamActivity.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }**/

        if(v == ubicacion){
            Intent m = new Intent(this, ubicacion_mapa.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
        if(v == volver){
            Intent m = new Intent(this, MainActivity.class);
            startActivity(m);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }

    }
}