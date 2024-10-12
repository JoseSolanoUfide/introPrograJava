package com.jp.retos.retosclase;

import java.util.Scanner;

public class tablas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(scanner.next());
        for (int i = 1; i <= 10; i++) {
            int tabla = numero * i;
            System.out.println(numero +" X "+ i+" = " + tabla);
        }
        
    }
    
}
