public class OperacionesAritmeticas{
 public static void main (String args[]){
   int num_1 = 4;
   int num_2 = 4;
   int resultado = 0;
   
   resultado = (num_1 + num_2) / 2;
   System.out.println("(4 + 4) / 2 = " + resultado);

   resultado = num_1 + num_2 / 2;
   System.out.println("4 + 4 / 2 = " + resultado);
 }
}
