
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
public class uno {

    /**Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("a continuacion coloque la cantidad de minutos que quiere convertir");
        int minutos=leer.nextInt();
        
        int hora=(minutos%1440)/60;
        
        int dia=minutos/1440;
        
        System.out.println("su cantidad de minutos son "+ dia +" dias y "+hora+" horas");
    }
    
}
