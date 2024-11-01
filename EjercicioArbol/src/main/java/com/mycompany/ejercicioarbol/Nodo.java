package com.mycompany.ejercicioarbol;

public class Nodo {
    Producto producto;    
    Nodo izq;
    Nodo der;

    public Nodo(Producto producto) {
        this.producto = producto;
        izq = null;
        der = null;
    }

    public Producto getProducto() {
        return producto;
    }
    
}
