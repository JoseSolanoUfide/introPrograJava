
package com.jp.poo.poo.empleado;

public class Empleado {
    
    public String DNI;
    public String nombre;
    public Integer edad;
    public String departamento;  // (Contabilidad, informatica y direccion)
    public Boolean teletrabajo;
    public String empresa;
    public Double salarioBase;
    
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
}
}