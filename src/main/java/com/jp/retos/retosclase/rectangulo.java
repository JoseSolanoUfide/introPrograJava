/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jp.retos.retosclase;

/**
 *
 * @author josesolano
 */
public class rectangulo {

    public static void main(String[] args)throws Exception{
        int lineas = 0;
        while (lineas <= 5) {            
            for (int i = 0; i < 10; i++) {
                System.out.print("@");
            }
            System.out.println("");
            Thread.sleep(1000);
            lineas++;
            // System.out.println(lineas);
        }
    }
}
