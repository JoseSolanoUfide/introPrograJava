/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.constructores;


public class TestPersona {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan", 25);
        //persona.setNombre("Juan");
        //persona.setEdad(25);
        //persona.setEquipoFavorito("Saprissa");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("DNI: " + persona.getDNI());
        System.out.println("Equipo Favorito: " + persona.getEquipoFavorito());
    }
}

