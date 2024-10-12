package com.jp.retos.retosclase;

import java.util.Scanner;

   public class notasDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Digite una cantidad de estudiantes: ");
        //int estudiantes = Integer.parseInt(scanner.next());
        int estudiantes = 0;
        double sumatoria_notas=0;
        int aprobados = 0;
        double mayor = 0;
        double menor = 100;
        double ultima_nota=0;
        do{
        
            System.out.println("Digite la nota del estudiante" );
            int nota = Integer.parseInt(scanner.next());
            ultima_nota = nota;
            
            if (nota>=70) {
                aprobados++;
            }
            if (nota>mayor) {
                mayor = nota;
            }
            if (nota<menor && nota>0) {
                menor = nota;
            }
            if (nota>=0) {
            sumatoria_notas+=nota;
            estudiantes++;
            }

            
            
            
        }while(ultima_nota>=0);
        
        System.out.println("Promedio de notas = " + sumatoria_notas/estudiantes);
        System.out.println("Nota Mayor = " + mayor);
        System.out.println("Nota Menor = " + menor);
        System.out.println("aprobados = " + aprobados);
        
        
        
    }
   }