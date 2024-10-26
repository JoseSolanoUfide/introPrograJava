package com.jp.poo.poo.encapsulamiento;

 class Persona2{
    private String nombre;
    private int edad;

  
    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

// Clase de prueba
public class Test {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 25);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        
    }
}
