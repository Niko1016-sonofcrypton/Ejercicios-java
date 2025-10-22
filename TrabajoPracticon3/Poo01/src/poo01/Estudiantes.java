/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo01;

/**
 *
 * @author nicoo
 */
public class Estudiantes {
  String nombre;
  String apellido;
  String curso;
  float calificacion;
  
  // Se inician los atributos
  
  public Estudiantes(String nombre, String apellido, String curso, float calificacion){
      this.nombre = nombre;
      this.apellido = apellido;
      this.curso = curso;
      this.calificacion = calificacion; 
  }
  
  //Metodo para mostrar la informacion
  
  public void mostrarinfo(){
      System.out.println("Nombre " + nombre + " " + apellido);
      System.out.println("Curso: " + curso);
      System.out.println("Calificaciones: " + calificacion);
  } 
  
  //Metodo para subir la calificacion
  
  public void subirCalificacion(float puntos){
      calificacion += puntos;
      System.out.println("La calificacion ha subido en " + puntos + " puntos. Nueva calificacion: " +  calificacion);
  }
  
  //Metodo para bajar la calificacion
  
  public void bajarCalificacion(float puntos){
      calificacion -= puntos;
      System.out.println("La calificacion ha bajado en " + puntos + " puntos. Nueva calificacion: " + calificacion);
  }
}
