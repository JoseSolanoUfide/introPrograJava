/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    public String nombre;
    public String direccion;
    public ArrayList<Libro> listaDeLibros = new ArrayList<>();

    // Métodos
    public void añadirLibro(Libro libro) {
        listaDeLibros.add(libro);
        System.out.println("El libro ha sido añadido a la biblioteca.");
    }

    public void eliminarLibro(Libro libro) {
        listaDeLibros.remove(libro);
        System.out.println("El libro ha sido eliminado de la biblioteca.");
    }

    public void listarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : listaDeLibros) {
            System.out.println(libro.titulo + " de " + libro.autor);
        }
    }
}
