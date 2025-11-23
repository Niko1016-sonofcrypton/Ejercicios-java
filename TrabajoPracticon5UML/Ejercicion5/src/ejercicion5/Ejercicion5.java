/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion5;

/**
 *
 * @author nicoo
 */
public class Ejercicion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Propietario propietario = new Propietario ("Jse", "30763497");
        Computadora computadora = new Computadora("Aorus","5939g9276s96", 
                "Micro-ATX", "Z790");
        
        computadora.setPropietario(propietario);
        
        computadora.mostrarComputadora();
    }  
}
