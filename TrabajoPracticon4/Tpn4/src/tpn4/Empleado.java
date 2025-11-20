/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpn4;

/**
 *
 * @author nicoo
 */
public class Empleado {
    //atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalempleados = 0;
    private static int idAutomatico = 1; //Para que se pueda asignar id automaticamente
    
    //Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalempleados++;
        if (id >= idAutomatico){
            idAutomatico = id + 1;
        }
    }
    
    //Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto){
    this.id = idAutomatico++;
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = 30000.0;//salario por defecto
    totalempleados++;
}
    //getters y setters
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
    //metodos sobrecargados para actualizar el salario
    public void actualizarsalario (double porcentaje){
        this.salario += this.salario * (porcentaje/100.0);
    }
    public void actualizarsalario (int cantidadfija){
        this.salario += cantidadfija;
    }
    //metodo tostring()
    @Override
    public String toString (){
        return "Empleado [ID=" + id + ", Nombre =" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }
    
    //metodo estatico para mostrar total de empleados
    public static int mostrartotalempleados(){
        return totalempleados;
    }
}


