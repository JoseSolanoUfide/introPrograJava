/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.prueba;

import com.jp.poo.poo.biblioteca.Libro;
import com.jp.poo.poo.biblioteca.Usuario;
import com.jp.poo.poo.biblioteca.Biblioteca;

/**
 *
 * @author jpsolano
 */
public class BibliotecaPrueba {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro();
        libro1.titulo = "Cien Años de Soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.ISBN = "978-3-16-148410-0";
        libro1.anio = 1967;

        Libro libro2 = new Libro();
        libro2.titulo = "Don Quijote de la Mancha";
        libro2.autor = "Miguel de Cervantes";
        libro2.ISBN = "978-84-376-0494-7";
        libro2.anio = 1605;

        // Crear un usuario
        Usuario usuario1 = new Usuario();
        usuario1.nombre = "Juan Pérez";
        usuario1.id = "123456";
        usuario1.librosPrestados = 0;

        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.nombre = "Biblioteca Central";
        biblioteca.direccion = "Av. Siempre Viva 123";

        // Añadir libros a la biblioteca
        biblioteca.añadirLibro(libro1);
        biblioteca.añadirLibro(libro2);

        // Listar libros en la biblioteca
        biblioteca.listarLibros();

        // El usuario pide un libro prestado
        System.out.println("\n" + usuario1.nombre + " va a pedir prestado un libro.");
        usuario1.pedirLibro();
        libro1.prestar();

        // El usuario devuelve el libro
        System.out.println("\n" + usuario1.nombre + " va a devolver el libro.");
        usuario1.devolverLibro();
        libro1.devolver();

        // Eliminar un libro de la biblioteca
        System.out.println("\nEliminando un libro de la biblioteca.");
        biblioteca.eliminarLibro(libro2);

        // Listar libros restantes en la biblioteca
        biblioteca.listarLibros();
    }
}
