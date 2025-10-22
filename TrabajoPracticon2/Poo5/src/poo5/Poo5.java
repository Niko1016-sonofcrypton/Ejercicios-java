/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo5;

/**
 *
 * @author nicoo
 */
public class Poo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Explorer-1", 50);
        
        //mostrar estado inicial
        nave1.mostrarEstado();
        
        //Intentar avanzar sin recargar
        System.out.println("\nIntentando avanzar sin recargar... ");
        nave1.avanzar(200);
        
        //Recargar combustible
        System.out.println("\nRecargando combustible...");
       nave1.recargarCombustible(40);
       
       //Despegar y avanzar correctamente
        System.out.println("\nDespegando...");
        nave1.despegar();
        
        System.out.println("\nAvanzando...");
        nave1.avanzar(100);
        
        //Mostrar estado final
        nave1.mostrarEstado();
    }
    
}
