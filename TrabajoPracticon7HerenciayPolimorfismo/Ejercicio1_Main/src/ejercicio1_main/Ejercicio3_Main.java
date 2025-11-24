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
public class Ejercicio3_Main {
    public static void main(String[] args) {

            ArrayList<Empleado> empleados = new ArrayList<>();
            
            EmpleadoPlanta EP1= new EmpleadoPlanta();
            EmpleadoPlanta EP2= new EmpleadoPlanta();
            EmpleadoTemporal ET1= new EmpleadoTemporal();
            EmpleadoTemporal ET2= new EmpleadoTemporal();
            
            empleados.add(EP1);
            empleados.add(EP2);
            empleados.add(ET1);
            empleados.add(ET2);
            
            for(Empleado e : empleados){
                System.out.println("El sueldo del empleado es de: " + e.calcularSueldo(e));
            }
}
}
