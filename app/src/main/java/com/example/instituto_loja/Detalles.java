package com.example.instituto_loja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity implements View.OnClickListener {
    ImageView foto;
    TextView titulo , detalle;
    Button regresar;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        foto = (ImageView) findViewById(R.id.imgfoto);
        titulo = (TextView) findViewById(R.id.txtTitulo);
        detalle = (TextView) findViewById(R.id.txtDetalle);

        datos obj = (datos) getIntent().getExtras().getSerializable("objeto");
        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());
        foto.setImageResource(obj.getImagen());

        regresar = (Button) findViewById(R.id.volver);
        regresar.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if(regresar == v){
            Intent i = new Intent(this, docentes.class);
            startActivity(i);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        }
    }
}