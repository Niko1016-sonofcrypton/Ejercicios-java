/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act8.pkg2;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Act82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        
    //Le pedimos al usuario que ingrese numeros decimales
        System.out.println("Ingresa el primer numero decimal: ");
        double num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        double num2 = entrada.nextInt();
        
        //Division con decimales
        if (num2 != 0){
            double resultado = num1/num2;
            System.out.println("Resultado(double): " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
        entrada.close();
    }
    
}
