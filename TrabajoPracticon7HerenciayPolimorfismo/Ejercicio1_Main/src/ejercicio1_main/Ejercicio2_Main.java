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
public class Ejercicio2_Main {
     public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        //Crep e instancio figuras distinas
        Rectangulo rectangulo1 = new Rectangulo (4.7,5,"rectangulo");
        Rectangulo rectangulo2 = new Rectangulo (4.5,7,"rectangulo");
        Circulo circulo1 = new Circulo (4.4,"circulo");
        Circulo circulo2 = new Circulo (5,"circulo");
        
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);
        figuras.add(circulo1);
        figuras.add(circulo2);
        
        for(Figura f : figuras){
        f.calcularArea();
}
}
    }
