package com.jp.retos.retosclase;

import java.util.Scanner;

   public class arbolito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n = Integer.parseInt(scanner.next());
        

       
        for (int i = 1; i <= n; i++) {
          
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
    
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
