/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo3;

/**
 *
 * @author nicoo
 */
public class Poo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel garcia marquez", 1967);
        
        //Mostrar informacion inicial
        System.out.println("Informacion inicial del libro: ");
        libro1.mostrarinfo();
        
        //Intentar modificar el año con un valor invalido
        System.out.println("\nIntentando cambiar el año a un valor invalido (2500)");
        libro1.setAñoPublicacion(2500);
        
        //Intentar modificar el año con un valor valido
        System.out.println("\nIntentando cambiar el año a un valñor valido (1985)");
        libro1.setAñoPublicacion(1985);
        
        //Mostrar informacion final
        System.out.println("\nInformacion final del libro: ");
        libro1.mostrarinfo();
    }
    
}
