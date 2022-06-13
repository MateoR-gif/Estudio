package Practicas.polimorfismo;
import java.util.Scanner;
/* Para utilizar el polimorfismo, debemos declarar la clase como
Abstracta */
public abstract class Operaciones_ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){
        System.out.print("Primer Valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Segundo Valor: ");
        valor2 = entrada.nextInt();
    }

    /* La lógica del método abstracto no puede estar dentro de la clase
    abastracta, solo puede ser declarado */
    public abstract void Operaciones();

    public void MostrarResultado(){
        System.out.print(resultado);
    }
}
