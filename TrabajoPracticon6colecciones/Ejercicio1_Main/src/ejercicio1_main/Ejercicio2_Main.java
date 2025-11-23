/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

/**
 *
 * @author nicoo
 */
public class Ejercicio2_Main {
    public static void main(String[] args) {
   
        Biblioteca bib = new Biblioteca("San Martín");

        //Creo al menos 3 autores
        Autor a1 = new Autor("001", "Pablo Neruda", "Chileno");
        Autor a2 = new Autor("002", "Liliana Bodoc", "Argentina");
        Autor a3 = new Autor("003", "Jorge Luis Borges", "Argentino");
        Autor a4 = new Autor("004", "Isabel Allende", "Chilena");

        //Agrego 5 libros asociados a los autores de la biblioteca
        bib.agregarLibro("123456789", "Veinte Poemas de Amor", 1924, a1);
        bib.agregarLibro("987654321", "Los días del Venado", 2000, a2);
        bib.agregarLibro("234567890", "Fervor de Buenos Aires", 1923, a3);
        bib.agregarLibro("098765431", "Los días de la Sombra", 2002, a2);
        bib.agregarLibro("211111111", "La Casa de los Espíritus", 1982, a4);

        System.out.println("Los libros encontrados son: ");
        bib.listarLibros();

        System.out.println("Buscar libro ISBN 123456789: ");
        Libro libroBuscado = bib.buscarLibroPorIsbn("123456789");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }
        
        System.out.println("Filtramos libros publicados en un año específico: ");
        bib.filtrarLibrosPorAnio(1923);

        System.out.println("Se eliminará el libro con ISBN : 211111111 ");
        bib.eliminarLibro("211111111");
        bib.listarLibros();

        System.out.println("La cantidad total de libros es de : ");
        bib.obtenerCantidadLibros();

        System.out.println("Autores disponibles: ");
        bib.mostrarAutoresDisponibles();
    }
}
