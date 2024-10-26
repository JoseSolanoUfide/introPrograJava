/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.biblioteca;

/**
 *
 * @author jpsolano
 */
public class Usuario {
    // Atributos
    public String nombre;
    public String id;
    public int librosPrestados;

    // Métodos
    void registrarse() {
        System.out.println("Usuario registrado con éxito.");
    }

    public void pedirLibro() {
        System.out.println("El libro ha sido solicitado.");
    }

    public void devolverLibro() {
        System.out.println("El libro ha sido devuelto.");
    }
}
