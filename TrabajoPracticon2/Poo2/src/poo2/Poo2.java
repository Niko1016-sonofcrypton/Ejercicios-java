/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2;

/**
 *
 * @author nicoo
 */
public class Poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea una mascota
        Mascota mascota1 = new Mascota("Luna", "Perro", 3);
        
        //Mostrar infromacion inicial
        System.out.println("Informacion inicial de la mascota: ");
        mascota1.mostrarInfo();
        
        //Simular el paso del tiempo
        System.out.println("\nPaso un año...");
        mascota1.cumpliranios();
        
        //Mostrar informacion final
        System.out.println("\nInformacion despues del tiempo: ");
        mascota1.mostrarInfo();
    }
    
}
