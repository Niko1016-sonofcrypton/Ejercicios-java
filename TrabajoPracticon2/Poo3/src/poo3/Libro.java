/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo3;

/**
 *
 * @author nicoo
 */
public class Libro {
    //Atribuir privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    //Constructor
    public Libro(String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);//usamos el setter para validar 
    }
    
    //Getters (Para leer los atributos)
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    public void setAñoPublicacion(int añoPublicacion){
        if (añoPublicacion > 0 && añoPublicacion <= 2025){ //Se validad que tenga sentido
                this.añoPublicacion = añoPublicacion;
        }else{
                   System.out.println("Año de publicacion invalido: " + añoPublicacion); 
                    }
        }
    //metodo opcional para mostrar info (Por si se quiere imprimir facil)
    public void mostrarinfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
    }
}

