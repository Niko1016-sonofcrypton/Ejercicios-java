/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion6;

/**
 *
 * @author nicoo
 */
public class Ejercicion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Micaela Ovando","1165340025");
        Reserva reserva = new Reserva ("25/11/25", "21:00hs",
                new Mesa("20","7 personas"));
        
        reserva.setCliente(cliente);
        
        reserva.mostrarReserva();
    }
    
}
