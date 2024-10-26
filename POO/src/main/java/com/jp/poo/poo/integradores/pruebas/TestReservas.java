
package com.jp.poo.poo.integradores.pruebas;

import com.jp.poo.poo.integradores.ejemplos.Habitacion;
import com.jp.poo.poo.integradores.ejemplos.Habitacion.TipoHabitacion;
import java.util.Scanner;

public class TestReservas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        
        do {
            System.out.println("Ingrese el número de habitación:");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
            
            System.out.println("Ingrese el tipo de habitación (SENCILLA, DOBLE, SUITE):");
            String tipoIngresado = scanner.nextLine().toUpperCase();

            try {
                TipoHabitacion tipo = TipoHabitacion.valueOf(tipoIngresado);
                Habitacion habitacion = new Habitacion(numero, tipo);
                
                System.out.println("Reserva creada:");
                System.out.println("Número de habitación: " + habitacion.getNumeroHabitacion());
                System.out.println("Tipo: " + habitacion.getTipoHabitacion());
                System.out.println("Precio: $" + habitacion.getPrecio());
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de habitación no válido.");
            }

            System.out.println("¿Desea hacer otra reserva? (si/no):");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("si"));
        
        scanner.close();
    }
}