/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.constructores;

/**
 *
 * @author josesolano
 */
public class EmpleadoConConstructor {
    
    public String DNI;
    public String nombre;
    public Integer edad;
    public String departamento;  // (Contabilidad, informatica y direccion)
    public Boolean teletrabajo;
    public String empresa;
    public Double salarioBase;
    
    
    public EmpleadoConConstructor(){
    
    }
    
    
    public EmpleadoConConstructor(String nombre, int edad, String departamento){
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    
    }
    
    
    public void calcularSueldo(){
        if (edad >=30) {
            salarioBase += 200; 
        }
        if (departamento == "Contabilidad") {
            salarioBase += 50; 
        } else if (this.departamento == "Informatica") {
            salarioBase += 80; 
        } else if (this.departamento == "Direccion") {
            salarioBase += 100;
        } 
        if (teletrabajo) {
            salarioBase += 30;
        }
        
        System.out.println("Salario base = " + salarioBase);
    
}}
