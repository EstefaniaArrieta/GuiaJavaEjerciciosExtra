
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
public class seis {

    /**Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    *debajo de 1.60 mts. y el promedio de estaturas en general.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        float bajos=0;
        float sumageneral=0;
        int cantidadbajos=0;
        
        System.out.println("a cuantas personas vamos a ingresar??");
        int cantidad=leer.nextInt();
        
        float[] personas= new float[cantidad];
        
        System.out.println("a  continuacion coloque las alturas en metros");
        for (int i = 0; i < cantidad; i++) {
            personas[i]=leer.nextFloat();
            sumageneral+=personas[i];
            if (personas[i]< 1.60) {
                bajos+=personas[i];
                cantidadbajos++;
            }
        }
        System.out.println("de un todal de "+ cantidad+ " de personas, son "+ cantidadbajos+" los que miden menos de 1.60");
        System.out.println("el %"+ (cantidadbajos*100)/cantidad + " de las personas son mas bajas");
        System.out.println("y de las personas mas bajas el promedio es de "+ bajos/cantidadbajos);
    
        
        
        
        
    }
    
}
