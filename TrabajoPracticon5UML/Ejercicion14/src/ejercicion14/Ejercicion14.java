/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion14;

/**
 *
 * @author nicoo
 */
public class Ejercicion14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Proyecto proyecto = new Proyecto ("Resumen El Eternauta", 120);
        EditorVideo editorVideo = new EditorVideo();
        
        editorVideo.exportarYMostrar("MP4", proyecto);
    }
    
}
