/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion5;

/**
 *
 * @author nicoo
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String 
            chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre (modelo, chipset);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario!= null && propietario.getComputadora() != this){
        propietario.setComputadora(this);
        }
    }
    
    public void mostrarComputadora() {
        System.out.println("Computadora:\nMarca: " + marca + 
                "\nNumero de serie: " + numeroSerie + placaMadre + propietario);
    }
}
