package poo2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicoo
 */
public class Mascota {
    //Atributos
    String nombre;
    String especie;
    int edad;
    
    //Constructor
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    //Metodo para mostrar la informacion de la mascota
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    //Metodo para cumplir años (Simula el paso del tiempo)
    public void cumpliranios(){
        edad ++;
        System.out.println(nombre + " ha cumplido un año mas. Ahora tiene " + edad + "años.");
    }
}
