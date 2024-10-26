package com.jp.poo.poo.encapsulamiento;


public class Persona {
    
    private String nombre;
    private int edad;

        public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
        
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
}

    //public class Test {
     //public static void main(String[] args) {
      //  Persona persona = new Persona("Juan", 25);
       // System.out.println("Nombre: " + persona.getNombre());
        //System.out.println("Edad: " + persona.getEdad());
    //}
//}
}
