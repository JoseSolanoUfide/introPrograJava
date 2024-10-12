package com.jp.retos.retosclase;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(scanner.next());
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <=i -1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
            
            
        }
         
}
}