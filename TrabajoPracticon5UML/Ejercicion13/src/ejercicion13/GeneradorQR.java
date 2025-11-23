/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion13;

/**
 *
 * @author nicoo
 */
public class GeneradorQR {
    public void generarYMostrarQR (String valor, Usuario usuario){
        
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        
        System.out.println("El Codigo QR generado es: " + 
                codigoQR.getValor()+ codigoQR.getUsuario());
    }
}
