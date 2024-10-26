package com.jp.poo.poo.constructores;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private String equipoFavorito;

    public Persona(){
        System.out.println("Constructor vacio");

    }
    
    public Persona(String nombre, int edad) {
        System.out.println("Constructor con  2 parametros");
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nombre, int edad, String equipoFavorito) {
        System.out.println("Constructor con 3 parametros");
        this.nombre = nombre;
        this.edad = edad;
        this.equipoFavorito =equipoFavorito;
        setDNI("000000");
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEquipoFavorito() {
        return equipoFavorito;
    }

    public void setEquipoFavorito(String equipoFavorito) {
        this.equipoFavorito = equipoFavorito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}




