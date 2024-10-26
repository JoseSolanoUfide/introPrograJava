
package com.jp.poo.poo.elementosEstaticos;

public class CuentaBancaria {
    private double saldo;
    
 
    public static double tasaInteres = 0.02;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldoConInteres() {
        return saldo + (saldo * tasaInteres);
    }
}
