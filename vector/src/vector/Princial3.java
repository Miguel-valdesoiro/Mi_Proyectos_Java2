
package vector;

import java.util.Scanner;


public class Princial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String patron = "[a-zA-Z]*"; 
        boolean correcto;
        do {
            System.out.print("Ingrese cero a mas letras? ");
            String n = sc.next(); //2
            correcto = n.matches(patron);// "2".matches(patron)   verdadero
            if(!correcto) { //falso
                System.out.println("ERROR: ENTRADA INCORRECTA");
            }
        }while(!correcto);//falso
        System.out.println("CORRECTO");
        
        
    }
    
}
