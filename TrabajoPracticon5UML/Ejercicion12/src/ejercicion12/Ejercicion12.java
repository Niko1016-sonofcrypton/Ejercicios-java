/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion12;

/**
 *
 * @author nicoo
 */
public class Ejercicion12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Martrin", "6815345879");
        Impuesto impuesto = new Impuesto(50560.33);
        impuesto.setContribuyente(contribuyente);
        
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
    
}
