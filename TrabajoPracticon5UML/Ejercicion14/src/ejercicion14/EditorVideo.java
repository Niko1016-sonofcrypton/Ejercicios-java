/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion14;

/**
 *
 * @author nicoo
 */
public class EditorVideo {
    public void exportarYMostrar (String formato, Proyecto proyecto){
        
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        
        System.out.println("El video ha sido exportado.\nFormato: "+ 
                render.getFormato()+ "\n"+render.getProyecto());
    }
}
