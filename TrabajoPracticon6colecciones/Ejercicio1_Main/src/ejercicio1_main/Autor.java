/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

/**
 *
 * @author nicoo
 */
public class Autor {
       private String idAutor;
     private String nombre;
     private String nacionalidad;

    public Autor() {
    }

    public Autor(String idAutor, String nombre, String nacionalidad) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    
    public String getIdAutor() {
        return idAutor;
    }

    
    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNacionalidad() {
        return nacionalidad;
    }

    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
     
     
   public void mostrarInfoAutor() {
    System.out.println("ID Autor: " + idAutor + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
}

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;
        Autor autor = (Autor) o;
        return idAutor != null && idAutor.equals(autor.idAutor);
    }

    @Override
    public int hashCode() {
        return idAutor != null ? idAutor.hashCode() : 0;
    }
}
