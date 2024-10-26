package com.jp.poo.poo.prueba;

import com.jp.poo.poo.elementosEstaticos.CuentaBancaria;


public class TestCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        CuentaBancaria cuenta2 = new CuentaBancaria(2000);


        System.out.println("Tasa de interés: " + CuentaBancaria.tasaInteres);


        System.out.println("Saldo cuenta1 con interés: " + cuenta1.getSaldoConInteres());
        System.out.println("Saldo cuenta2 con interés: " + cuenta2.getSaldoConInteres());


        CuentaBancaria.tasaInteres = 0.03;
        System.out.println("Nueva tasa de interés: " + CuentaBancaria.tasaInteres);


        System.out.println("Saldo cuenta1 con nuevo interés: " + cuenta1.getSaldoConInteres());
        System.out.println("Saldo cuenta2 con nuevo interés: " + cuenta2.getSaldoConInteres());
    }
}