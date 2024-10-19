/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.biblioteca;

/**
 *
 * @author jpsolano
 */
public class Libro {
    // Atributos
    public String titulo;
    public String autor;
    public String ISBN;
    public int anio;

    // Métodos
    public void prestar() {
        System.out.println("El libro ha sido prestado.");
    }

    public void devolver() {
        System.out.println("El libro ha sido devuelto.");
    }

    public void reservar() {
        System.out.println("El libro ha sido reservado.");
    }
}
