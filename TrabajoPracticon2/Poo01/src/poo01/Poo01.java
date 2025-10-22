/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo01;

import java.util.Scanner;

/**
 *
 * @author nicoo
 */
public class Poo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    //Se crea un objeto Estudiantes
        Estudiantes est1 = new Estudiantes("Nicolas","Otaño","Programacion 2", 8.5f);
        
        //Se muestra informacion inicial
        System.out.println("Informacion Inicial del estudiante: ");
        est1.mostrarinfo();
        
        //Subir y bajar calificacion
        est1.subirCalificacion(0.5f);
        est1.bajarCalificacion(1.0f);
        
        //Mostrar informacion final
        System.out.println("\nInformacion final del estudiante: ");
        est1.mostrarinfo();
    }   
    }
