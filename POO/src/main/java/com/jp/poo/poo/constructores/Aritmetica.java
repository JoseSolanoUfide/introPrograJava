/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.poo.poo.constructores;

/**
 *
 * @author josesolano
 */
public class Aritmetica {
    int operando1;
    int operando2;
    
    //este es el metodo constructor
    public Aritmetica(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
    }
    
    void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica(1,2);
        aritmetica.sumar();
    
}
}