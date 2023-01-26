
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
public class tres {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
*Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        boolean vocal=false;
        System.out.println("a continuacion coloque una letra y te dire si es una vocal");
        String letra=leer.next();
        
        if (letra.equalsIgnoreCase("a")) {
            vocal=true;
            
        }else if (letra.equalsIgnoreCase("e")) {
            vocal=true;
        }else if (letra.equalsIgnoreCase("i")) {
            vocal=true;
        }else if (letra.equalsIgnoreCase("o")) {
            vocal=true;
        }else if (letra.equalsIgnoreCase("u")) {
            vocal=true;
        }
        // deberia haber usado un switch >.< XD
        System.out.println("es una vocal?? " + vocal);
    }
    
}
