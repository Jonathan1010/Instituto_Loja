package com.example.instituto_loja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class galeria_menu extends AppCompatActivity {
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

        slider = findViewById(R.id.fotosinicio);
        List<SliderItem> easysliders = new ArrayList<>();
        easysliders.add(new SliderItem("Extension Vilcabamba", R.drawable.vilcabamba_galeria));
        easysliders.add(new SliderItem("Loja", R.drawable.lojamv));
        easysliders.add(new SliderItem("Feria en el municipio de Loja", R.drawable.servicioelectrico));
        easysliders.add(new SliderItem("Proyectos", R.drawable.prtoyectos));



        slider.setPages(easysliders);


    }
}