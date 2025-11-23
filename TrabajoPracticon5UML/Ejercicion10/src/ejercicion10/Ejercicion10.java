/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion10;

/**
 *
 * @author nicoo
 */
public class Ejercicion10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Ramon Stone", "44719764");
        CuentaBancaria cuentaBancaria = new CuentaBancaria
        ("84597352753168906537", 500000.00, "VLH300", "23/05/2024");
        
        cuentaBancaria.setTitular(titular);
        
        cuentaBancaria.mostrarCuentaBancaria();
    }
    
}
