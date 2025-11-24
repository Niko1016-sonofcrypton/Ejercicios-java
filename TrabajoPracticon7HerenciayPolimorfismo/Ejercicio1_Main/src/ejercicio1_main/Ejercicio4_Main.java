/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

import java.util.ArrayList;

/**
 *
 * @author nicoo
 */
public class Ejercicio4_Main {
     public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Vaca vaca1 = new Vaca();
        
        animales.add(vaca1);
        animales.add(perro1);
        animales.add(gato1);
        
        
        for(Animal a : animales){
            a.hacerSonido();
        }
    }
}
