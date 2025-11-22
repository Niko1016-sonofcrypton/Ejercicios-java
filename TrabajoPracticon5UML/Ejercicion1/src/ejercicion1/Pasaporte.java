/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion1;

/**
 *
 * @author nicoo
 */
public class Pasaporte {
    private String numero;
    private String fechaemision;
    private Foto foto;
    private titular titular;
    
    public Pasaporte(String numero,String fechaemision, titular titular, Foto foto){
        this.numero = numero;
        this.fechaemision = fechaemision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this); 
    //Enlace en la relacion bidireccional
    }
    
    public String getnumero(){ return numero;}
    public String getfechaemision(){ return fechaemision;}
    public Foto getFoto(){ return foto;}
    public titular gettitular(){ return titular;}
    
    @Override
    public String toString(){
        return "Pasaporte [numero= " + numero + ", fechaemision= "+ fechaemision + ", titular= " + titular + ", Foto= " + foto +"]";
    }
}
