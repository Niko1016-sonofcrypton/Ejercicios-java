/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion8;

/**
 *
 * @author nicoo
 */
public class Ejercicion8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento documento= new Documento("TP UML", 
                "Ejercicios de programacion", "SHA-256","22/11/2025", 
                new Usuario("Nicolas Otaño", "nico.otano@gmail.com"));
        
        documento.mostrarDocumento();
    }
    
}
