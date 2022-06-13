package Practicas.lavadora;

import java.util.Scanner;

public class FuncionesMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Tipo de ropa: (1 - Blanca), (2 - De Color)");
        int tipoRopa = input.nextInt();

        System.out.println("Kilos de Ropa: ");
        int kilosRopa = input.nextInt();

        Funciones instancia = new Funciones(kilosRopa, tipoRopa);

        instancia.setTipoRopa(2);
        System.out.println("Tipo de Ropa: " + instancia.getTipoRopa());
        instancia.CicloFinalizado();
    }
}
