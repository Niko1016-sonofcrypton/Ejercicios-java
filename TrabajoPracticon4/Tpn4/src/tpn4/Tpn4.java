/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpn4;

/**
 *
 * @author nicoo
 */
public class Tpn4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando empleados con ambos constructores
        Empleado e1 = new Empleado ("Nicolas Otaño", "Maestro");
        Empleado e2 = new Empleado ("Matias Otaño", "Director");
        Empleado e3 = new Empleado (100, "josefina Otaño", "Maestra", 80000.0);
        //Aplicando metodos sobrecargados actualizarsalario
        e1.actualizarsalario(10.0);//Un aumento del 10%
        e2.actualizarsalario(5000);//Aumento Fijo
        e3.actualizarsalario(5.0);//Aumento del 5%
        //Imprimiendo informacion de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        //Mostrando la cantidad de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrartotalempleados());
    }
}
