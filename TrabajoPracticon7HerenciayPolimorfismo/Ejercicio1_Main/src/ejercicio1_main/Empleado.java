/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

/**
 *
 * @author nicoo
 */
public class Empleado {
    public double calcularSueldo(Empleado e){
        if(e instanceof EmpleadoPlanta){
        return 981000;
        }else if(e instanceof EmpleadoTemporal){
        return 781000;
        }else{
                return 0;
    }
    }
}
