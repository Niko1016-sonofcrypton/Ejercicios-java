/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_main;

/**
 *
 * @author nicoo
 */
public class Ejercicio1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nico", "nico.otano@gmail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Monitor", 100.0));
        pedido.agregarProducto(new Producto("Mouse", 50.0));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        PagoConDescuento pagoTarjeta = new TarjetaCredito();
        double montoConDescuento = pagoTarjeta.aplicarDescuento(pedido.calcularTotal());
        pagoTarjeta.procesarPago(montoConDescuento);

        pedido.cambiarEstado("Enviado");
    }
    
}
