/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int anioDeNacimiento, anioactual, edaddelusuario;
         
         anioactual = 2025;
                 
         System.out.println("Ingrese su año de nacimiento: ");
         anioDeNacimiento = Integer.parseInt(input.nextLine());
         
        edaddelusuario =anioactual - anioDeNacimiento;
        
        System.out.println("Su edad es: " + edaddelusuario + "años");
    }
    
}
