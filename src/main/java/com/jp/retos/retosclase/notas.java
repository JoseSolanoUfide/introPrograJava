package com.jp.retos.retosclase;

import java.util.Scanner;

   public class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una cantidad de estudiantes: ");
        int estudiantes = Integer.parseInt(scanner.next());
        double sumatoria_notas=0;
        int aprobados = 0;
        double mayor = 0;
        double menor = 100;
        
        for (int i = 1; i <= estudiantes; i++) {
            System.out.println("Digite la nota del estudiante numero " +i );
            int nota = Integer.parseInt(scanner.next());
            if (nota>=70) {
                aprobados++;
            }
            if (nota>mayor) {
                mayor = nota;
            }
            if (nota<menor) {
                menor = nota;
            }
            sumatoria_notas+=nota;
            
            
            
        }
        
        System.out.println("Promedio de notas = " + sumatoria_notas/estudiantes);
        System.out.println("Nota Mayor = " + mayor);
        System.out.println("Nota Menor = " + menor);
        System.out.println("aprobados = " + aprobados);
        
        
        
    }
   }