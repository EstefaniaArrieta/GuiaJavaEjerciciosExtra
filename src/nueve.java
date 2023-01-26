
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
public class nueve {

    /**Simular la división usando solamente restas. Dados dos números enteros mayores que
    *uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
    *Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
    *resultado es el residuo, y el número de restas realizadas es el cociente.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int dividendo;
        int divisor;
        int residuo;
        int cociente=0;
        int j,i;
        
        System.out.println("a continuacion coloque el dividendo");
        dividendo=leer.nextInt();
        i=dividendo;
        System.out.println("a continuacion coloque el divisor");
        divisor=leer.nextInt();
        j=divisor;
        
        while (dividendo>divisor) {
            System.out.println("" +dividendo+ "-" + divisor );
            dividendo-=divisor;
            cociente++;
            System.out.println("cociente =" + cociente);
            
        }
       residuo=dividendo;
        System.out.println("el resultado de dividir " + i+ " entre " + j + " da  un cociente de "+ cociente+ " y un residuo de " +residuo );
       
    }
    
}
