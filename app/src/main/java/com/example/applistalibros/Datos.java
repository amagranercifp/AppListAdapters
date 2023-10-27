package com.example.applistalibros;

public class Datos {
    private String titulo;
    private int paginas;

    private int portada;

    private Boolean marcado = Boolean.FALSE;

    public Datos(String titulo, int paginas, int portada) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPortada() {return portada; }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPortada(int portada) { this.portada = portada; }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
