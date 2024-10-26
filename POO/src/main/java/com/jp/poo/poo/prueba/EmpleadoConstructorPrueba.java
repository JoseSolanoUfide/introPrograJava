/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.prueba;

import com.jp.poo.poo.constructores.EmpleadoConConstructor;

/**
 *
 * @author jpsolano
 */
public class EmpleadoConstructorPrueba {
    public static void main(String[] args) {
        // Crear empleados
        EmpleadoConConstructor empleado1 = new EmpleadoConConstructor("Jose", 40,"Contabilidad");
        empleado1.salarioBase = 100.0;
        empleado1.edad = 30;
        empleado1.departamento = "Contabilidad";
        empleado1.teletrabajo = true;
        empleado1.calcularSueldo();

    }
}
