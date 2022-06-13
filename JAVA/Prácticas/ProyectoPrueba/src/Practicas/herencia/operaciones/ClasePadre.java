package Practicas.herencia.operaciones;
import java.util.Scanner;

public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner input = new Scanner(System.in);

    public void PedirDatos(){
        System.out.print("Primer Valor: ");
        valor1 = input.nextInt();
        System.out.print("Segundo Valor: ");
        valor2 = input.nextInt();
    }

    public void ImprimirResultado(){
        System.out.print("Resultado: " + resultado);
    }
}
