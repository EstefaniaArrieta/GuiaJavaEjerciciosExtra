
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
*real que represente el costo del tratamiento (previo al descuento) y determine el
*importe en efectivo a pagar por dicho socio.
 * @author Martin
 */
public class cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String tipo;
        int costo=0;
        
        System.out.println("a continuacion coloque que tipo de socio es  a/b/c");
        tipo=leer.next();
        
        System.out.println("coloque el costo del tratamiento que desea realizar");
        costo=leer.nextInt();
        
        switch (tipo) {
            case "a":
                System.out.println("deberia pagar $"+ (costo/2) );
                break;
            case "b":
                System.out.println("deberia pagar $"+ (costo*0.65) );
                break;
            case "c":
                System.out.println("deberia pagar $"+ (costo) );
                break;    
            default:
                System.out.println("coloque una opcion valida");;
        }
        
                
        
        // TODO code application logic here
    }
    
}
