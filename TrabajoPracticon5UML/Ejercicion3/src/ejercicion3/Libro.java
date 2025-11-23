/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion3;

/**
 *
 * @author nicoo
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public void mostrarLibro() {
        System.out.println("Libro:\nTitulo: "+ titulo +"\nISBN: " 
                + isbn+"\n" + autor + editorial);
    }
}
