/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Scanner input = new Scanner(System.in);
        String nombre;
        String saludo;
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        saludo = "Hola " + nombre; 
        System.out.println(saludo);
            
        
    }
    
}
