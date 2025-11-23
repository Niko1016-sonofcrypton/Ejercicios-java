/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

/**
 *
 * @author nicoo
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, int anioPublicacion, Autor autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }
    
    public void mostrarInfo() {
    System.out.println("ISBN: " + ISBN
        + ", Título: " + titulo 
        + ", Año: " + anioPublicacion 
        + ", Autor: " + autor.getNombre());
}
}
