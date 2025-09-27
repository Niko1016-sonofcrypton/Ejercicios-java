/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn11;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn11 {
    
    //Variable global (Estatica) con el valor del descuento del 10%
    static double descuento_especial = 0.10;
    
    //Metodo para calcular el descuento especial
    public static void calculardescuentoespecial(double precio){
        //Usamos la variable local
        double descuentoaplicado = precio * descuento_especial;
        double preciofinal = precio - descuentoaplicado;
        
        //se muestran los resultados
        System.out.println("El descuento especial aplicado es: " + descuentoaplicado);
        System.out.println("El precio final con descuento es: " + preciofinal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos precio al usuario
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        
        //Se llama al metodo
        calculardescuentoespecial(precio);
    }
    
}
