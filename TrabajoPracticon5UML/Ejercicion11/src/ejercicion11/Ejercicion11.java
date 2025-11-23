/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion11;

/**
 *
 * @author nicoo
 */
public class Ejercicion11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Niño");
        Artista artista = new Artista ("Milo J", "Folklore");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();
        
        reproductor.reproducir(cancion);
    }
    
}
