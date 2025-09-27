/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn8;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn8 {
    
    //Metodo para calcular el precio final
    public static double calcularPrecioFinal(double PrecioBase , double Impuesto , double Descuento){
        double PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase * Descuento);
        return PrecioFinal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Se solicita datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double PrecioBase = sc.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double ImpuestoPorc = sc.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double DescuentoPorc = sc.nextDouble();
        
        //Conversion de porcentajes en decimales
        double Impuesto = ImpuestoPorc / 100;
        double Descuento = DescuentoPorc / 100;
        
        //Se llama al metodo
        double PrecioFinal = calcularPrecioFinal(PrecioBase, Impuesto, Descuento);
        
        //se muestra el resultado
        System.out.print("El precio final del producto es: " + PrecioFinal);
    }
    
}
