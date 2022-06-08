/*
    * Creado por Mateo Rendón
    * Versión 1.0
    * Fecha: 08/06/2022
*/
package Practicas;
import java.util.Scanner;

public class InversorPalabras {
    public static void main(String args[]){
        int longitudPalabra = 0;
        String palabraInvertida = "", palabra = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la palabra a Invertir: ");
        palabra = input.nextLine();
        longitudPalabra = palabra.length();

        System.out.println("");
        System.out.println("Proceso con While");
        System.out.println("");

        while(longitudPalabra != 0){
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
            System.out.println(palabraInvertida);
        }

        System.out.println("");
        System.out.println("Proceso con For");
        System.out.println("");

        longitudPalabra = palabra.length();
        palabraInvertida = "";

        for(int i = longitudPalabra; i > 0; i--){
            palabraInvertida += palabra.substring(i - 1, i);
            System.out.println(palabraInvertida);
        }

        System.out.println("");
        System.out.print("Palabra Invertida: " + palabraInvertida);
    }
}
