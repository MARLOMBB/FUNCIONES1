/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcion_4;

/**
 *
 * @author DARMA
 */
import java.util.Scanner;
public class FUNCION_4 {

    public static void main(String[] args) {
        String palabra;
        String mayuscula;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        palabra = leer.nextLine();
        mayuscula = palabra.toUpperCase();
        System.out.println( mayuscula );
        
    }
}
