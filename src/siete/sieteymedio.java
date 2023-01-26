/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siete;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class sieteymedio {

    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    *de n números (n>0). El valor de n se solicitará al principio del programa y los números
    *serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    *bucle “while” y otra con el bucle “do - while”.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner leer=new Scanner(System.in);
        System.out.println("cuantos numeros desea ingresar?");
        int n=leer.nextInt();
        
        int[] vector =new int[n];
        
        int max=0;
        int min=1110;
        int suma=0;
        int j=n;
        
        do {            
             System.out.println("coloque el numero n° " + n);
            vector[n-1]=leer.nextInt();
            if (vector[n-1]>max) {
                max=vector[n-1];
            }else if (vector[n-1]<min) {
                min=vector[n-1];
            }
            suma+=vector[n-1];
            n--;           
        } while ((n-1)>=0);
        
        System.out.println("de los numeros ingresados, el mayor fue " + max + " y el menor fue "+ min +" el promedio de todos los numeros es "+ suma/j );
    }
    
}
