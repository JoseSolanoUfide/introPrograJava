
package com.jp.poo.poo.empleado;

public class Empleado {
    
    public String DNI;
    public String nombre;
    public Integer edad;
    public String departamento;  // (Contabilidad, informatica y direccion)
    public Boolean teletrabajo;
    public String empresa;
    public Double salarioBase;
    
    public void calcularSueldo(Empleado empleado){
        if (this.edad >=30) {
            this.salarioBase += 200; 
        }
        if (this.departamento == "Contabilidad") {
            this.salarioBase += 50; 
        } else if (this.departamento == "Informatica") {
            this.salarioBase += 80; 
        } else if (this.departamento == "Direccion") {
            this.salarioBase += 100;
        } 
        if (teletrabajo) {
            this.salarioBase += 30;
        }
        
        System.out.println("Salario base = " + salarioBase);
}
}