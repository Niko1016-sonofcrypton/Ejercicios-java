/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn5;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        
        //Solicitamos el primer numero
        System.out.print("Ingrese un numero(0 para terminar): ");
        numero = sc.nextInt();
        
        //Ciclo WHILE que se detiene si ingresamos el numero 0
        while (numero != 0) {
            if (numero % 2 == 0){ //Se verifica si es par
                suma += numero;
            }
            //Se solicita el siguente numero
            System.out.print("Ingrese un numero(0 para terminar): ");
            numero = sc.nextInt();
        }
        //se muestra el resultado final
        System.out.println("La suma de los numeros par es: " + suma);
    }
    
}
