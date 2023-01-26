
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
public class diez {

    /**
     * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    *dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    *   si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    *al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    *utilizar la función Math.random() de Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1=(int)(Math.random()*(10-1)+1);
        int num2=(int)(Math.random()*(10-1)+1);
        int respuesta;
        int i=0;
        System.out.println("Debe adivinar cual es el resultado de la multiplicacion entre " + num1+ " y " + num2 );
        
        
        do {         
            System.out.println("coloque su respuesta");
            respuesta=leer.nextInt();
            if (respuesta==(num1*num2)) {
                System.out.println("Felicidades, adivinó!!");
                i++;
            }else
                System.out.println("intentelo de nuevo");
        } while (i==0);
        
                
        // TODO code application logic here
    }
    
}
