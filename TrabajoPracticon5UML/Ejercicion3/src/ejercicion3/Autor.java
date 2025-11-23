/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion3;

/**
 *
 * @author nicoo
 */
public class Autor {
      private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return ("\nAutor: "+ nombre +"\nNacionalidad del autor: "+ 
                nacionalidad+"\n");
    }
}
