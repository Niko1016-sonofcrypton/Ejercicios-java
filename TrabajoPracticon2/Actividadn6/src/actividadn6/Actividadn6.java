/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn6;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        //Solicitar 10 numeros usando el ciclo for
        for (int i = 1; i <= 10; i++){
            System.out.print("Ingrese el numero " + i +": ");
            int numero = sc.nextInt();
            
            if (numero > 0){
                positivos++;
            } else if (numero < 0){
                negativos++;
            } else {
                ceros++;
            }
    }
        //Se muestran los resultados
        System.out.println("\nResultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
}
