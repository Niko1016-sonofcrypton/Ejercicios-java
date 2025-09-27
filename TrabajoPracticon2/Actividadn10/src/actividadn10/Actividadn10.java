/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadn10;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Actividadn10 {
    
    //Metodo para calcular el stock
    public static int actualizarstock(int stockanual, int cantidadvendida, int cantidadrecibida){
        int nuevostock = stockanual - cantidadvendida + cantidadrecibida;
        return nuevostock;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Se solicita datos al usuario
        System.out.println("Ingrese el stock actual del producto: ");
        int stockactual = sc.nextInt();
        
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadvendida = sc.nextInt();
        
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadrecibida = sc.nextInt();
        
        //Llamamos al metodo para actualizar el stock
        int nuevostock = actualizarstock(stockactual, cantidadvendida, cantidadrecibida);
        
        //Muestra de resultado
        System.out.println("El nuevo stock del producto es: " + nuevostock);
    }
    
}
