/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion1;

/**
 *
 * @author nicoo
 */
public class titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; 
    //relacion bidireccional
    
    public titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
    }
    
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
    
    @Override
    public String toString(){
        return "Titular [nombre= " + nombre + ", dni=" + dni + "]";
    }
}
