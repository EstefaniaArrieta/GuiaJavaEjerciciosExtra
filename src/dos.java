
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
public class dos {

    /**
     * @param args the command line arguments
     *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
/*una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
*tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
*iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
             
             
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("a continuacion coloque los valores de A, B, C, D");
       
        a=leer.nextInt();
        b=leer.nextInt();
        c=leer.nextInt();
        d=leer.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        
        e=b;
        b=c;
        c=a;
        a=d;
        d=e;
        
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);

        
        
        // TODO code application logic here
    }
    
}
