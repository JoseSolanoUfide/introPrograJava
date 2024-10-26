
package com.jp.poo.poo.prueba;

import com.jp.poo.poo.encapsulamiento.Carro;

public class TestCarro {
    
    public static void main(String[] args) {
        
        Carro miCoche = new Carro();

        // Usar setters para asignar valores a los atributos
        miCoche.setMarca("Toyota");
        miCoche.setModelo("Corolla");
        //miCoche.setColor("rojo");
        // Usar getters para obtener y mostrar los valores
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Color: " + miCoche.getColor());
    }
}
    

