/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion2;

/**
 *
 * @author nicoo
 */
public class Ejercicion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Usuario usuario = new Usuario ("Regina Perez", "34827655");
        
        Celular celular= new Celular("74626f8mm", "Apple", 
                "Iphone 17",new Bateria ("Li-ion", 250));
        
        celular.setUsuario(usuario);
        
        celular.mostrarCelular();
    }
}
