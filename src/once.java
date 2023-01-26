
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class once {

    /**Escribir un programa que lea un número entero y devuelva el número de dígitos que
    *componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    *deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
    *de división. Nota: recordar que las variables de tipo entero truncan los números o
    *resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int cifra=0;
        System.out.println("a continuacion coloque un numero");
        double num = leer.nextDouble();
        
        


        while (num>=1 ) {
            num=num/10;
            cifra++;
        }
        while (num<1 ) {
            
        }
        
    
        System.out.println("el numero tiene "+cifra+" cifras");
        
        
    }
    
}
