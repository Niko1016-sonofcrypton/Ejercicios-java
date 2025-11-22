/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act9;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); //Correccion 
        
        System.out.println("Hola, " + nombre);
       
    }
    
}
