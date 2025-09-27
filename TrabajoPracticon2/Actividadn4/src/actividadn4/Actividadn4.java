/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn4;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Se solicita el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextInt();
        
        //Se solicita la categoria del producto
        System.out.print("Ingrese la categoria del producto( A , B O C): ");
        char categoria = sc.next().toUpperCase().charAt(0); //Convertor de mayuscula para mayor comodidad
        
        double descuento = 0;
        
        //Se determina el porcentaje de descuento segun la categoria
        switch (categoria){
            case 'A':
                descuento = 0.10; //10%
                break;
            case 'B':
                descuento = 0.15; //15%
                break;
            case 'C':
                descuento = 0.20; //20%
                break;
            default:
                System.out.println("Categoria no valida.");
            return; //Salida del programa si la categoria no es valida
        }
        //Se calcula el precio final
        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;
        
        //Se muestran los resultados
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
}
