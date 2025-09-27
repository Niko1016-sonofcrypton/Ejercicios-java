/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn9;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn9 {

    public static double calcularcostoenvio(double peso, String zona){
        double costoenvio = 0;
        
        if (zona.equalsIgnoreCase("Nacional")){
            costoenvio = peso * 5; //$5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")){
            costoenvio = peso * 10; //10 por kg
        } else {
            System.out.println("Zona no valida. Se considera costo de envio 0.");
        }
        return costoenvio;
    }
    
    //Se calcula el total de la compra producto + envio
    public static double calculartotaldelacompra(double precioproducto, double costoenvio){
        return precioproducto + costoenvio;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Se solicitan los datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioproducto = sc.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.nextLine();
        
        //Se llama a la funcion costo de envio
        double costoenvio = calcularcostoenvio(peso, zona);
        
        //Se calcula el total de la compra
        double total = calculartotaldelacompra(precioproducto, costoenvio);
        
        //Se muestra el resultado
        System.out.println("El costo del envio es: " + costoenvio);
        System.out.print("El total a pagar es: " + total);
    }
    
}
