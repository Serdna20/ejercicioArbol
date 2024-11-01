package com.mycompany.ejercicioarbol;

import java.util.ArrayList;

public class Producto {

    public String getPrenda() {
        return prenda;
    }
    
    public String getColor() {
        return color;
    }

    public String getMedida() {
        return medida;
    }
    
    public String getMarca() {
        return marca;
    }  
    
    public int getPrecio() {
        return precio;
    }
    
    public int getNumberedValue() {
        int numbered = 0;
        numbered += stringValue(prenda);
        numbered += stringValue(color);
        numbered += stringValue(medida);
        numbered += stringValue(marca);
        numbered += precio;
        return numbered;
    }

    public String[] getArray() {
        String[] stringArray = new String[4];
        stringArray[0] = prenda;
        stringArray[1] = color;
        stringArray[2] = medida;
        stringArray[3] = marca;
        
        return stringArray;
    }
    
    private final String prenda;
    private final String color;    
    private final String medida;
    private final String marca;
    private final int precio;

    public Producto(String prenda, String color, String medida, String marca, int precio) {
        this.prenda = prenda;
        this.color = color;
        this.medida = medida;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Prenda: " + prenda + " - Color: " + color + " - Medida: " + medida + " - Marca: " + marca + " - Precio: " + precio;
    }
    
    public int stringValue(String str1) {
        int value = 0;
        for (int i = 0; i < str1.length(); i++) {
            value += (int) str1.charAt(i);
        }
        return value;
    }
}