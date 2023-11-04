package com.example.applistalibros;

import java.io.Serializable;

public class Datos implements Serializable {
    private String titulo;
    private int paginas;

    private int portada;

    private String descripcion;

    private Boolean marcado = Boolean.FALSE;

    public Datos(String titulo, int paginas, int portada, String descripcion) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.portada = portada;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPortada() {return portada; }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPortada(int portada) { this.portada = portada; }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
