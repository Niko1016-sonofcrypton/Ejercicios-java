/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion4;

/**
 *
 * @author nicoo
 */
public class Ejercicion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente ("jhony", "28556786");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito ("956964038",
                "05/2028", new Banco ("BBVA", "23-98176493-1"));
        
        tarjetaDeCredito.setCliente(cliente);
        
        tarjetaDeCredito.mostrarTarjetaDeCredito();
    }  
}
