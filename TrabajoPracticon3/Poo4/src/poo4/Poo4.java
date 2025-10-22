/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo4;

/**
 *
 * @author nicoo
 */
public class Poo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear dos gallinas
        Gallina gallina1 = new Gallina(1,2,10);
        Gallina gallina2 = new Gallina(2,1,5);
        
        //Se muestra el estado inicial
        System.out.println("Estado inicial de las gallinas: ");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        //Simular acciones
        System.out.println("\n--Simulacion--");
        gallina1.envejecer();
        gallina1.ponerhuevo();
        gallina2.envejecer();
        gallina2.ponerhuevo();
        
        //Mostrar resultado final
         System.out.println("\nEstado final de las gallinas: ");
         gallina1.mostrarEstado();
         gallina2.mostrarEstado();
    }
    
}
