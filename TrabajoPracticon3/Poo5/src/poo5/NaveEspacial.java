/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

/**
 *
 * @author nicoo
 */
public class NaveEspacial {
    //Atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; //Limite maximo del tanque
    
    //Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        //Si el combustible inicial supera el maximo, se limita
        if (combustible > MAX_COMBUSTIBLE){
            this.combustible = MAX_COMBUSTIBLE;
        } else { 
            this.combustible = combustible;
        }
    }
    
    //Metodo para despegar
    public void despegar(){
        if (combustible >= 10){
            combustible -= 10;
            System.out.println(nombre + " ha despegado con exito. Combustible restante: " + combustible);    
        } else {
            System.out.println("No hay suficiente combustible para despegar");
        }
    }
    
    //Metodo para avanzar cierta distancia (Cada 10 unidades de distancia gasta 5 de combustible)
    public void avanzar(int distancia) {
        int consumo = distancia / 10 * 5;
        if (combustible >= consumo){
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " km. Combustible restante: " + combustible);   
        } else {
            System.out.println(" Combustible insuficiente para avanzar " + distancia + " km");
        }
    }
    
    //Metodo para recargar combustible
    public void recargarCombustible(int cantidad){
    if (combustible + cantidad > MAX_COMBUSTIBLE){
        combustible = MAX_COMBUSTIBLE;
        System.out.println("Tanque lleno. El combustible se ha limitado al maximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades: " + combustible);
        }
    }
    
    //Metodo para mostrar el estado actual
    public void mostrarEstado(){
        System.out.println("\n estado de la nave: " + nombre);
        System.out.println("Combustible actual: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("--------------------");
    }
}
