/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion3;

/**
 *
 * @author nicoo
 */
public class Ejercicion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor = new Autor("Edgar Allan Poe", "Estadounidense");
        Libro libro = new Libro ("Cuentos de imaginacion y misterio", 
                "9788492412143", new Editorial("Libros del zorro rojo", 
                        "Pallars 85, Barcelona, Espania"));
        
        libro.setAutor(autor);
        libro.mostrarLibro();
    }
    }
