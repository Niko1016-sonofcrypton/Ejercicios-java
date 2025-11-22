/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act4;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Act4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Se crea el objeto scanner para leer desde el teclado
        Scanner entrada = new Scanner(System.in);
        
        //Se solicita el nombre del usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        //Se solicita la edad del usuario
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        
        //Se muestran los datos
        System.out.println("Hola " + nombre + " tienes " + edad + " años.");
        
        //Se cierra el Scanner
        entrada.close();
        //Se muestran los datos en pantalla
        
    }
    
}
