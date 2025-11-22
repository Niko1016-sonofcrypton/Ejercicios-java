/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion1;

/**
 *
 * @author nicoo
 */
public class testPasaporte {
    public static void main(String[] args){
        titular titular = new titular("Nicolas Otaño", "44727219");
        Foto foto = new Foto("Nico.jpg", "JPEG");
        Pasaporte pasaporte = new Pasaporte("AAF799899", "2025-10-10", titular, foto);
        
        System.out.println(pasaporte);
        System.out.println("Titular del pasaporte: " + titular.getPasaporte().getnumero());
    }
}
