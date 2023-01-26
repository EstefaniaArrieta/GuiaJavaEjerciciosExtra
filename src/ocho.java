
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
public class ocho {

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    *detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    *la cantidad de números impares. Al    igual que en el ejercicio anterior los números
    *negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int num;
        int par=0;
        int cantidad=0;
        
        int impar=0;
        
        System.out.println("ingrese un numero cualquiera, para salir ingrese un numero multiplo de 5");
        do { 
             num=leer.nextInt();
             
             if (num>0) {
                cantidad++;
                if (num%2==0) {
                    par++;
                }else{
                    impar++;
                }  
            }
             
            
        } while (num%5!=0);
        
        System.out.println("la cantidad de numeros ingresados es " + cantidad+ " , " + par+" numeros fueron pares y "+ impar+ " fueron impares");
        
        
        // TODO code application logic here
    }
    
}
