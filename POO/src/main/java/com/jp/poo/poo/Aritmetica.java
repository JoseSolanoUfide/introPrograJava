
package com.jp.poo.poo;

public class Aritmetica {
    
    public int sumar(int a, int b){
        int resultado  = a + b;
        return resultado;
    }
    
    public double multiplicar(double a, int b){
        double resultado  = a * b;
        return resultado;
    }
    

    
    
    
    
 public static void main(String[] args) {
        Aritmetica operacion = new Aritmetica();
        int suma = operacion.sumar(1,2);
        System.out.println("El resultado de la suma es: " + suma);
        
        double multiplicacion = operacion.multiplicar(3.1,5);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    }

    
}

