/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion6;

/**
 *
 * @author nicoo
 */
public class Reserva {
    private String fecha;
    private String hora;
    Mesa mesa;
    Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void mostrarReserva() {
        System.out.println("Reserva:\nFecha: "+ fecha +"\nHora: " + hora 
                + mesa + cliente);
    }
}
