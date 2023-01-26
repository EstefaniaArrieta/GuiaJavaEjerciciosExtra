
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
public class cuatro {

    /**    
    *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    *equivalente en romano.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num;
        String letra;
        do {            
            System.out.println("a continuacion coloque un numero del 1 al 10 y te dire cuanto es en numeros romanos");
            num= leer.nextInt();
        
            
            if (num<1 || num>10) {
                System.out.println("el numero es incorrecto, debe ser un numero del 1 al 10");
               System.out.println("desea convertir otro numero? S/N");
                letra=leer.next();
            }else{
                leernum(num);
                System.out.println("desea convertir otro numero? S/N");
                letra=leer.next();
            }
        
            
        
        } while (letra.equalsIgnoreCase("S"));
      
    }
    
    public static void leernum(int num){
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break; 
            case 6:
                System.out.println("VI");
                break;    
            case 7:
                System.out.println("VII");
                break;    
            case 8:
                System.out.println("VIII");
                break;    
            case 9:
                System.out.println("IX");
                break;  
            case 10:
                System.out.println("X");
                break;    
                
            default:
                throw new AssertionError();
        }
    }
    
}
