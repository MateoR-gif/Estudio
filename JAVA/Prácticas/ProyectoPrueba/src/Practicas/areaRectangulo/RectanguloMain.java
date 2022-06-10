/*
 * Creado por Mateo Rendón
 * Versión 1.0
 * Fecha: 09/06/2022
 */

package Practicas.areaRectangulo;
import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Valor de la Base: ");
        int base = input.nextInt();

        System.out.print("Valor de la Altura: ");
        int altura = input.nextInt();

        Rectangulo instancia = new Rectangulo(base, altura);

        instancia.Imprimir();
    }
}
