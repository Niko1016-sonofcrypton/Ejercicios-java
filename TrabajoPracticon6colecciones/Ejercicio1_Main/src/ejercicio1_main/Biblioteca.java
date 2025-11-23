/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author nicoo
 */
public class Biblioteca {
      private String nombre;
    private ArrayList<Libro> libros;
 
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", libros=" + libros + '}';
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles en la biblioteca");
        } else {
            for (Libro lib : libros) {
                lib.mostrarInfo();
            }
        }

    }
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro lib : libros) {
            if (lib.getISBN().equalsIgnoreCase(isbn)) {
                return lib;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String ISBN) {
        Libro libroEncontrado = buscarLibroPorIsbn(ISBN);
        if (libroEncontrado != null) {
            libros.remove(libroEncontrado);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anioPublicacion) {

        boolean encontrado = false;
        for (Libro lib : libros) {
            if (lib.getAnioPublicacion() == anioPublicacion) {
                System.out.println(lib);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros del año " + anioPublicacion);
        }
    }
    
   public void mostrarAutoresDisponibles() {
    HashSet<Autor> autoresUnicos = new HashSet<>();
    
    for (Libro lib : libros) {
        autoresUnicos.add(lib.getAutor()); 
    }

    for (Autor a : autoresUnicos) {
        System.out.println(a);
    }
}
}
