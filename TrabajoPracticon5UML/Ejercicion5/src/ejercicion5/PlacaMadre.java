/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion5;

/**
 *
 * @author nicoo
 */
public class PlacaMadre {
     private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return ("\nModelo de la placa madre: " + modelo + 
                "\nChipset de la placa madre: " + chipset+"\n");
    }
}
