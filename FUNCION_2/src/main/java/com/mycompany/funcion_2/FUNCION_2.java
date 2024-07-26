/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcion_2;

/**
 *
 * @author DARMA
 */
import java.util.Scanner;
public class FUNCION_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b;
        System.out.print(" Ingrese el primer numero:");
                a = leer.nextInt();
         System.out.print(" Ingrese el segundo numero:");
         b = leer.nextInt();
         System.out.print(" El MCD es:"+ MCD(a,b));
         
    }
    public static int MCD(int a,int b){
        int c;
        while(b != 0){
            c = b;
            b = a%c;
            a = c;
        }
        return a;
    }
}
