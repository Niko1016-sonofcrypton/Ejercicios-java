/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_main;

import java.util.ArrayList;

/**
 *
 * @author nicoo
 */
public class Inventario {
    ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProducto() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Producto p : productos) { 
                p.mostrarInfo();
            }
        }
    }

    public Producto buscarPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p; 
            }
        }
        return null; 
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en la categoría " + categoria);
        }
    }
    
     public boolean eliminarProducto(String id) {
        Producto p = buscarPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

     public boolean actualizarStock(String id, int nuevaCantidad){
         Producto p = buscarPorId(id);
         if (p != null){
         p.setCantidad(nuevaCantidad);
         return true;
     }
         return false;
     }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

     public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

     public void filtrarProductosPorPrecio(double min, double max) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos con precio entre $" + min + " y $" + max);
        }
    }

      public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " → " + c.getDescripcion());
        }
    }
}
