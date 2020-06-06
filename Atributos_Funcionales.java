/*
 * Diseñe un algoritmo que le permita ingresar los atributos
funcionales en un diseño experimental de un vehiculo autónomo
 */
package atributos_funcionales;

/**
 *
 * @author Alex Beltran
 */
import java.util.Scanner;
public class Atributos_Funcionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        Scanner objeto=new Scanner (System.in);
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("INGENIERÍA AUTOMOTRIZ\n");
        System.out.println("ATRIBUTOS FUNCIONALES\n");
        
        System.out.println("Ingrese el atributo funcional 1:");
        String atributo1=objeto.nextLine();
        
        System.out.println("\nIngrese el atributo funcional 2:");
        String atributo2=objeto.nextLine();
        
        System.out.println("\nIngrese el atributo funcional 3:");
        String atributo3=objeto.nextLine();
        
        System.out.println("\nIngrese el atributo funcional 4:");
        String atributo4=objeto.nextLine();
        
        
    }
    
}
