
package com.mycompany.miguelvaldesoiromontes;

import java.util.Scanner;

public class Suma {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("INgrese numero");
       String numero = sc.next();
       int a = 0;
       for(int i=0; i<numero.length(); i++) {
           a = a + Integer.parseInt(numero.charAt(i)+"");
                   
       }
       System.out.println(a);
       
               
               
            
       
    } 
}
