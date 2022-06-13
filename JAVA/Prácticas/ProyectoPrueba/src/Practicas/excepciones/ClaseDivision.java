package Practicas.excepciones;

import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args){
        int valor1, valor2, resultado;
        Scanner input = new Scanner(System.in);
        try{
            //código que se va a ejecutar
            System.out.print("Primer Valor: ");
            valor1 = input.nextInt();

            System.out.print("Segundo Valor: ");
            valor2 = input.nextInt();

            resultado = valor1 / valor2;

            System.out.print("Resultado: " + resultado);
        }catch (Exception e) {
            //comportamiento cuando se genere un error
            String error = e.toString();
            switch (error){
                case "java.lang.ArithmeticException: / by zero":
                    System.out.println("No se puede dividir entre 0");
            }
        }finally {
            //esto se ejecuta sin importar si el try se ejecuta correctamente o no
            System.out.println("Operación Concluída");
        }
    }
}
