import java.util.Scanner;

public class PracticaCadenasDeCaracteres{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String nombre_1 = "", nombre_2 = "";
    
    System.out.print("Ingrese el primer nombre: ");
    nombre_1 = input.nextLine();
    
    System.out.print("Ingrese el segundo nombre: ");
    nombre_2 = input.nextLine();

    if(nombre_1.equals(nombre_2)){
      System.out.print("Los nombres son iguales");
    }else{
      System.out.print("Los nombres son diferentes");
    }
  }
}