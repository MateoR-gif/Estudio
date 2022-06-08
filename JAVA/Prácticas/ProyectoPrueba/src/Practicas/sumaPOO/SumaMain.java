package Practicas.sumaPOO;
import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Número 1: ");
        int valorUno = input.nextInt();

        System.out.print("Número 2: ");
        int valorDos = input.nextInt();
        /*
            * Se crea un objeto de tipo Suma (Suma es el nombre de la clase)
            * Se envían los parámetros que solicita la clase Suma -> (valorUno, valorDos)
        */
        Suma valores = new Suma(valorUno, valorDos);
        // Se llama al método Imprimir(), que está dentro del objeto "valores"//
        valores.Imprimir();
    }
}
