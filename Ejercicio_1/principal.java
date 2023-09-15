
package com.mycompany.miguelvaldesoiromontes;


public class principal {

    public static void main(String[] args) {
  double a = 2;
        double b = 3;
        double c = 5;
        
        String x = ecuacionSegundoGrado(a, b, c);
        
         String[] parte = x.split(",");
        System.out.println("x1: " + parte[0]);
        System.out.println("x2: " + parte[1]);
 }

    public static String ecuacionSegundoGrado(double a, double b, double c) {
        double x1 = 0, x2 = 0, d = 0;
        int z=0;
        if (a != 0) {
            
            d = Math.pow(b, 2) - 4 * a * c;
            if (d >= 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
            } else {
                System.out.println("no tiene solucion real");
                z=-1;
            }
        } else {
            System.out.println("no es una ecuacion de segundo grado");
            z=-2;
        }

        return x1 + "," + x2+","+z;

    }


    
}
