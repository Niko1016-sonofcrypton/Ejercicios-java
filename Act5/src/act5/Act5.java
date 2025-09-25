/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
            //Se solicita al ususario los numeros
            System.out.println("Ingrese el primer numero entero: ");
            int num1 = entrada.nextInt();
            
            System.out.println("Ingrese el segundo numero entero: ");
            int num2 = entrada.nextInt();
            
            //Operaciones
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            
            //Para la division es mejor usar double para tener decimales
            double division = 0;
            if (num2 != 0){
                division =(double) num1/num2;
    }
            //Se muestran los resultados
            System.out.println("Resultados: ");
            System.out.println("Suma: "+ suma);
            System.out.println("Resta: "+ resta);
            System.out.println("Multiplicacion: "+ multiplicacion);
            
            if (num2 !=0){
                System.out.println("Division: "+ division);
            } else {
                System.out.println("Division: No se puede dividir entre cero");
            }
    }
    
}
