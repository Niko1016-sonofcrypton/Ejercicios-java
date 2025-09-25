/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act8;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    //Le pedimos al usuario que ingrese numeros enteros
        System.out.println("Ingresa el primer numero entero: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = entrada.nextInt();
        
        //Division con enteros
        if (num2 != 0){
            int resultado = num1/num2;
            System.out.println("Resultado(int): " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
        entrada.close();
    }
    
}
