import java.util.Scanner;

public class CondicionalesAnidados{
  public static void main(String args[]){

   int num_1 = 3;
   int num_2 = 2;
   Scanner decision = new Scanner(System.in);
   int operacion = 0;
   operacion = decision.nextInt();
   int resultado = 0;   

   if(operacion == 1){
     resultado = num_1 + num_2;
     System.out.println("El resultado de la suma es: " + resultado);
   }else if(operacion == 2){
     resultado = num_1 - num_2;
     System.out.println("El resultado de la resta es: " + resultado);
   }else if(operacion == 3){
     resultado = num_1 * num_2;
     System.out.println("El resultado de la multiplicacion es: " + resultado);
   }else if(operacion == 4){
     resultado = num_1 / num_2;
     System.out.println("El resultado de la division es: " + resultado);
   }else{
     System.out.println("No existe la operación seleccionada");
   }
 }
}