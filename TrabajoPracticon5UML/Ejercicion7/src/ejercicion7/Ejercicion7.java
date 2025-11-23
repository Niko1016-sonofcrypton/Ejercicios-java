/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion7;

/**
 *
 * @author nicoo
 */
public class Ejercicion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Walter White", "M75927472l");
        Vehiculo vehiculo = new Vehiculo ("AG8547LU","Toyota Ethios",
                new Motor("Gasolina","37789dh45"));
        
        vehiculo.setConductor(conductor);
        
        vehiculo.mostrarVehiculo();
    }
    
}
