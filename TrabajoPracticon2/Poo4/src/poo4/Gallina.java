/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo4;

/**
 *
 * @author nicoo
 */
public class Gallina {
    //Atributos
    private int idGallina;
    private int edad;
    private int huevospuestos;
    
    //constructor
    public Gallina(int idGallina, int edad, int huevospuestos){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevospuestos = huevospuestos;
    }
    //metodo para simular que la gallina pone un huevo
    public void ponerhuevo(){
        huevospuestos++;
        System.out.println("La gallina " +  idGallina + " ha puesto un huevo. Total: " + huevospuestos);
    }
    
    //metodo para simular envejecimiento
    public void envejecer(){
        edad ++;
        System.out.println("La gallina " + idGallina + " ha cumplido un año mas. Edad: " + huevospuestos);
    }
    
    //Metodo para mostrar el estado actual
    public void mostrarEstado(){
        System.out.println("Gallina ID " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevospuestos);
        System.out.println("-----------------------");
    }
}
