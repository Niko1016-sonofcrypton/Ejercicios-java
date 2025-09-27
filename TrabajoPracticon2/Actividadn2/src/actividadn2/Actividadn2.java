/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn2;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Se solicitan los tres numeros al ususario
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();
        
        //Se determina el mayor
        int mayor = num1; //Asumiendo que el primero es el mayor
        
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }
        
        //Se muestra el resultado
        System.out.println("El mayor es: " + mayor);
    }
    
}
