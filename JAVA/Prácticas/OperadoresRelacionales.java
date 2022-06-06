import java.util.Scanner;

public class OperadoresRelacionales{ 
 public static void main(String args[]){
   String nombre = "";
   int clave = 0;
   int antiguedad = 0;
   Scanner info = new Scanner(System.in);

   System.out.println("Ingrese su nombre: ");
   nombre = info.nextLine();
   System.out.println("Ingrese la clave: ");
   clave = info.nextInt();
   System.out.println("Antiguedad?: ");
   antiguedad = info.nextInt();

   if(clave==1){
     if(antiguedad==1){
       System.out.println(nombre + "Derecho a 6 días de vacaciones");
     }else if(antiguedad>=2 && antiguedad<=6){
       System.out.println(nombre + "Derecho a 14 días de vacaciones");
     }else if(antiguedad == 7){
       System.out.println(nombre + "Derecho a 20 días de vacaciones");
     }else{System.out.println("No tiene derecho a vacaciones.");}
   }else{
     System.out.println("Error, la clave de departamento no existe.");
   }
 }
}