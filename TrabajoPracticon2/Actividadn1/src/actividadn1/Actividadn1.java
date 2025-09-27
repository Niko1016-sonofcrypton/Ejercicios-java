/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn1;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Se solicita al ususario que ingrese un año
        System.out.println("Por favor ingrese un año: ");
        int año = sc.nextInt();
        
        //Se verifica si el año es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0 )){
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
            
        }
    }
    
}
