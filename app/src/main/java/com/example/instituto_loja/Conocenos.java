package com.example.instituto_loja;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Conocenos extends AppCompatActivity implements View.OnClickListener{
    Button regresar;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.institucion);


        regresar = (Button) findViewById(R.id.volvermenuconocenos);
        regresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == regresar){
            Intent ra = new Intent(this, MainActivity.class);
            startActivity(ra);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }
}
