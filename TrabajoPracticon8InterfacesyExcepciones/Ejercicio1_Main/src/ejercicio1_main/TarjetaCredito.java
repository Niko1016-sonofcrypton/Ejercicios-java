/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

/**
 *
 * @author nicoo
 */
public class TarjetaCredito implements PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Aplicando 10% de descuento por pago con tarjeta...");
        return monto * 0.90;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado por $" + monto);
    }
    
}
