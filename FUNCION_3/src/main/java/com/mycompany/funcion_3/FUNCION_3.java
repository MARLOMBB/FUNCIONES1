/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcion_3;

/**
 *
 * @author DARMA
 */
import java.util.Scanner;
public class FUNCION_3 {
 
    public static boolean esPalindromo(String palabra){
   palabra = palabra.toLowerCase();
   palabra = palabra.replace(" ", " ");
  int a = 0;
  int b = palabra.length() - 1;
  for(int i = 0; i<palabra.length();i++){
      if(palabra.charAt(a)== palabra.charAt(b)){
          a++;
          b--;
      }
  else
          return false;

    }
    return true;
    }
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println(" Ingresa una palabra o frase ");
        palabra = leer.nextLine();
        if(esPalindromo(palabra))
            System.out.println("Es palindromo ");
        else
            System.out.println("No es palindromo ");
    }
}
