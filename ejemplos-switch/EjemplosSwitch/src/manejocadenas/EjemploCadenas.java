/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {

    public static void main(String[] args) {
        String ciudad = "loJa";
        /*
        Usamos el toUpperCase para poner todo en mayuscula y el toLowerCase
        para poner todo en minuscula
        */
        ciudad = ciudad.toUpperCase();
        // se presentqa loja en minuscula porue solo estamos tranformando para 
        //la presentacion
        System.out.printf("%s\n", ciudad.toLowerCase());
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        // toLowerCase es un método
        // toUpperCase es un método

    }
}
