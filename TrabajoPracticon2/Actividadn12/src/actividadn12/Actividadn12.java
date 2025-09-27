/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn12;

/**
 *
 * @author nicoo
 */
public class Actividadn12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se declara e iniciamos el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        //Mostramos los valores originales
        System.out.println("Precios originales: ");
        for (double precio : precios){
            System.out.println("Precios: $" + precio);
        }
        
        //Se modifica el precio de un producto en especifico
        precios[2] = 129.99;
        
        //Se muestran los valores modificados
        System.out.println("\nPrecios modificados: ");
        for (double precio : precios){
            System.out.println("Precio: $" + precio);
        }
    }
    
}
