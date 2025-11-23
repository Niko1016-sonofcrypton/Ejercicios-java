/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion14;

/**
 *
 * @author nicoo
 */
public class Proyecto {
     private String nombre;
    private int duracion;

    public Proyecto(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return ("\nProyecto:\nNombre: " + nombre + "\nDuracion: " + duracion);
    }
}
