/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_main;

/**
 *
 * @author nicoo
 */
public class Ejercicio1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        
        // Se agregan 5 productos a la lista
        inv.agregarProducto(new Producto("001", "Ps5", 1500.0, 5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("002", "Camisa", 25.0, 50, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("003", "Cortinas", 2000.0, 20, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("004", "Medias", 350.0, 100, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("005", "Ipad", 1000.0, 15, CategoriaProducto.ELECTRONICA));

        
        System.out.println("Los productos disponibles son los siguientes: ");
        inv.listarProducto();
        
        System.out.println("Búsqueda de producto por ID: ");
        Producto buscado = inv.buscarPorId("001");
        if (buscado != null) buscado.mostrarInfo();
        
       System.out.println("Filtrar productos por categoría: ");
        inv.filtrarPorCategoria(CategoriaProducto.HOGAR);

        System.out.println("Eliminar producto: ");
        inv.eliminarProducto("002");
        inv.listarProducto();

        System.out.println("=Actualizando stock: ");
        inv.actualizarStock("005", 30);
        inv.buscarPorId("004").mostrarInfo();

        System.out.println("Total de stock disponible: " + inv.obtenerTotalStock());

        System.out.println("Producto con mayor stock: ");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        System.out.println("Productos entre $1000 y $3000: ");
        inv.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("Categorías disponibles: ");
        inv.mostrarCategoriasDisponibles();
    }
    
}
