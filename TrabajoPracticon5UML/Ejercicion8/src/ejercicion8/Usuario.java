/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion8;

/**
 *
 * @author nicoo
 */
public class Usuario {
     private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return ("\nDocumento asociado al usuario:\nNombre: " + nombre + 
                "\nEmail: " + email+"\n");
    }
}
