/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn3;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitar la edad al usuario
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        //clasificacion segun la edad
        if (edad <= 0 || edad > 99){
            System.out.println("Edad no valida");
        } else if (edad < 12){
            System.out.println("Eres un niño.");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Eres un adolecente.");
        } else if ( edad >= 18 && edad <=59){
            System.out.println("Eres un adulto.");
        } else if (edad >= 60){
            System.out.println("Eres un adulto mayor.");
        }
    }
    
}
