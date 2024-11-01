package com.mycompany.ejercicioarbol;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArbolBinario {
    
    Nodo raiz;
    
    public ArbolBinario() {
        raiz = null;
    }
    
    public void insertar(Producto producto) {
        raiz = insertarRecursivo(raiz, producto);
    }

    private Nodo insertarRecursivo(Nodo actual, Producto producto) {
        if (actual == null) {
            return new Nodo(producto);
        }

        if (producto.getNumberedValue()< actual.getProducto().getNumberedValue()) {
            actual.izq = insertarRecursivo(actual.izq, producto);
        } else if (producto.getNumberedValue() > actual.getProducto().getNumberedValue()) {
            actual.der = insertarRecursivo(actual.der, producto);
        }

        return actual;
    }

    public void recorrerInOrden() {
        ArrayList<String> arrPrint = new ArrayList();
        recorrerInOrdenRecursivo(raiz, arrPrint);
        
        String output = "";
        
        for (String string : arrPrint) {
            output += string + "\n";
        }
        
        if (output.equals("")) {
            output = "No encontramos nada :(";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }

    private void recorrerInOrdenRecursivo(Nodo nodo, ArrayList<String> arrPrint) {
        
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.izq, arrPrint);
            arrPrint.add(nodo.getProducto().toString());
            recorrerInOrdenRecursivo(nodo.der, arrPrint);
        }
    }
    
    public void buscarInOrden(String findThis) {
        ArrayList<String> arrPrint = new ArrayList();
        buscarInOrdenRecursivo(raiz, arrPrint, findThis);
        
        String output = "";
        
        for (String string : arrPrint) {
            output += string + "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
    
    private void buscarInOrdenRecursivo(Nodo nodo, ArrayList<String> arrPrint, String findThis) {
        
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.izq, arrPrint);
            
            String[] infoArray = nodo.getProducto().getArray();
            
            for (String string : infoArray) {
                if (string.equals(findThis)) {
                    arrPrint.add(nodo.getProducto().toString());
                    break;
                }
            }
            
            recorrerInOrdenRecursivo(nodo.der, arrPrint);
        }
    }
    
}