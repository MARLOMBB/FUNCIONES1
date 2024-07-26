/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcion_1;

/**
 *
 * @author DARMA
 */
import java.util.Scanner;
public class FUNCION_1 {

    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
        System.out.println(" Ingresa un numero ");
        int num = a.nextInt();
        int suma = 0; 
        for(int i = 1; i <= num; i++){
            int aux = num%i;
            
           if (aux == 0){
               suma = suma+1;
           }
        }
        if(suma <= 2){
            System.out.println(" Tu numero es primo ");
        }else{
            System.out.println(" Tu numero no es primo ");
        }
    }
}  


