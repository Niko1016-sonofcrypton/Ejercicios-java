/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author nicoo
 */
public class Empleado {
    //Atributos
    private int id;
    private String puesto;
    private String nombre;
    private double salario;
    private static int totalempleados = 0;
    private static int idautomatico = 1;
    
    //se envian los atributos al constructor
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalempleados++;
        if (id >= idautomatico){
            idautomatico = id + 1;
        }
    }
    //Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto){
        this.id = idautomatico++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0;
        totalempleados++;
    }
    public int getid(){
        return id;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getpuesto(){
        return puesto;
    }
    public void setpuesto(String puesto){
        this.puesto = puesto;
    }
    public double getsalario(){
        return salario;
    }
    public void setsalario(double salario){
        this.salario = salario;
    }
    
    //metodos sobrecargados para actualizar el salarios
    public void actualizarsalario(double porcentaje) { 
        this.salario += this.salario * (porcentaje/100.0);
    }
    public void actualizarsalario(int cantidadfija){
        this.salario += cantidadfija;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Empleado [ID="+ id + ", Nombre= "+ nombre + ", Puesto= " + puesto + ", Salario= " + salario + "]";
    }
    //Metodo para mostrar cant de empleados
    public static int mostrartotalempleados(){
        return totalempleados;
    }
}
