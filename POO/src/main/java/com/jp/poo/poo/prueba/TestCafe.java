package com.jp.poo.poo.prueba;

import com.jp.poo.poo.enumerators.OrdenCafe;
import com.jp.poo.poo.enumerators.OrdenCafe.TamanioCafe;


public class TestCafe {
    public static void main(String[] args) {
        // Crear una orden de café de tamaño mediano
        OrdenCafe ordenMediana = new OrdenCafe(TamanioCafe.MEDIANO);
        ordenMediana.mostrarOrden();

        // Crear una orden de café de tamaño grande
        OrdenCafe ordenGrande = new OrdenCafe(TamanioCafe.GRANDE);
        ordenGrande.mostrarOrden();

        // Mostrar todos los tamaños disponibles
        System.out.println("\nTamaños disponibles:");
        for (TamanioCafe tamaño : TamanioCafe.values()) {
            System.out.println(tamaño + " - " + tamaño.obtenerDescripcion());
        }
    }
}

