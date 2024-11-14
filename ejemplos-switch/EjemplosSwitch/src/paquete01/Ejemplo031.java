/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String apellido;
        String universidad;
        int edad;
        System.out.println("Ingrese su nombre");
        nombre= entrada.nextLine();
        
        System.out.println("Ingrese su apelllido");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su edad");
        edad=entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese la universidad");
        universidad=entrada.nextLine();
        
        nombre = nombre.toLowerCase();
        char valor = nombre.charAt(0);
        
        // ANA DIAZ con edad 19, es estudiante de UTPL

        // luis vera con edad 19, es estudiante de UNL
           
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s %s conn edad %d, es estudiante de %s\n"
                        ,nombre.toUpperCase(),apellido.toUpperCase(),edad,
                        universidad.toUpperCase());
                break;
            
            default:
                System.out.printf("%s %s conn edad %d, es estudiante de %s\n"
                        ,nombre.toLowerCase(),apellido.toLowerCase(),edad,
                        universidad.toUpperCase());
                break;
                
        }
        
    }
}
