/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion13;

/**
 *
 * @author nicoo
 */
public class Ejercicion13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Usuario usuario = new Usuario("Camila Villalobos", "camivilla@gmail.com");
        GeneradorQR generadorQR = new GeneradorQR();
        
        generadorQR.generarYMostrarQR("geo:40.7128,-74.0060", usuario);
    }
    
}
