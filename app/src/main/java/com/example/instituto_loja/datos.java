package com.example.instituto_loja;

import java.io.Serializable;

public class datos implements Serializable {
    private int id;
    private String Titulo;
    private String Detalle;
    private int imagen;

    public datos(String detalle , int id, int imagen , String titulo) {
        Detalle = detalle;
        this.id = id;
        this.imagen = imagen;
        Titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
