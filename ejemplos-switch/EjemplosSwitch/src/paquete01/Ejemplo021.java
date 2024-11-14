/*
*   Ingrese la fecha de nacimiento
dia: 
mes
año
usted a macido el 7 de febrero de 180

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int diaNacimiento;
        int mesNacimiento;
        int yearNacimiento;
        String mesCadena ="";

        System.out.println("Ingrese su dia de nacimiento");
        diaNacimiento = entrada.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mesNacimiento = entrada.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        yearNacimiento = entrada.nextInt();
        switch (mesNacimiento) {
            case 1:
                mesCadena = "enero";
                break;
            case 2:
                mesCadena = "febrero";
                break;
            case 3:
                mesCadena = "marzo";
                break;
            case 4:
                mesCadena = "abril";
                break;
            case 5:
                mesCadena = "mayo";
                break;
            case 6:
                mesCadena = "junio";
                break;
            case 7:
                mesCadena = "julio";
                break;
            case 8:
                mesCadena = "agosto";
                break;
            case 9:
                mesCadena = "septiembre";
                break;
            case 10:
                mesCadena = "octubre";
                break;
            case 11:
                mesCadena = "noviembre";
                break;
            case 12:
                mesCadena = "dicimbre";
                break;

            default:
                System.out.println("opcion inncorrecta");
        }
        System.out.printf("Usted a nacido el %d de %s de %d\n", diaNacimiento,
                 mesCadena, yearNacimiento);
    }
}
