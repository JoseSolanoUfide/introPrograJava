package com.jp.poo.poo.enumerators;


public class OrdenCafe {
    
    public enum TamanioCafe {
    PEQUEÑO, MEDIANO, GRANDE;

    public String obtenerDescripcion() {
        switch (this) {
            case PEQUEÑO:
                return "Café pequeño de 200 ml";
            case MEDIANO:
                return "Café mediano de 300 ml";
            case GRANDE:
                return "Café grande de 400 ml";
            default:
                return "Tamaño desconocido";
        }
    }
}
    
    private TamanioCafe tamaño;

    
    public OrdenCafe(TamanioCafe tamaño) {
        this.tamaño = tamaño;
    }

    public void mostrarOrden() {
        System.out.println("Orden de café:");
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Descripción: " + tamaño.obtenerDescripcion());
    }
}
