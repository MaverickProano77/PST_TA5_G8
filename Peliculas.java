package com.example.amst8;

public class Peliculas {
    String titulo, autor, editorial, imagen_url;

    public Peliculas(){}
    public Peliculas(String titulo, String autor, String editorial, String imagen_url) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.imagen_url = imagen_url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }
}
