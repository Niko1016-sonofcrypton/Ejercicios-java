/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn13;

/**
 *
 * @author nicoo
 */
public class Actividadn13 {
    //Funcion recursiva para imprimir precios
    public static void imprimirarray(double[] precios, int indice){
        //Cuando el indice llega al tamaño del array, detenemos la recursion 
        if (indice == precios.length){
            return;
        }
        //Imprimir el precio actual
        System.out.println("Precio: $" + precios[indice]);
        //Se hace una llamada recursiva al siguiente indice
        imprimirarray(precios, indice + 1);
    }
    public static void main(String[] args) {
        //Se declara e inicia el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        //Se muestran los precios originales usando recursion
        System.out.println("Precios originales: ");
        imprimirarray(precios, 0);
        
        //Se modifica un valor
        precios[2] = 129.99;
        
        //Se muestran los precios modificados usando recursion
        System.out.println("\nPrecios modificados:");
        imprimirarray(precios,0);
    }
    
}
