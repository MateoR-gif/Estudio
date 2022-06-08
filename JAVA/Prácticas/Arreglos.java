public class Arreglos{
  public static void main(String args[]){
   
   int numeros[] = new int[5];

   numeros[0] = 5;
   numeros[1] = 4;
   numeros[2] = 3;
   numeros[3] = 2;
   numeros[4] = 1;

   int long_numeros = numeros.length;

   for(int i = 0; i < long_numeros; i++){
     System.out.println(numeros[i]);
   }
   
   System.out.println(" ");
   System.out.println("Matrices Bidimensionales");
   System.out.println(" ");
   
   int numerosBidimensionales[][] = new int[2][2];

   numerosBidimensionales[0][0] = 5;
   numerosBidimensionales[0][1] = 2;
   numerosBidimensionales[1][0] = 2;
   numerosBidimensionales[1][1] = 5;

   for(int i = 0; i < numerosBidimensionales[0].length; i ++){
    for(int j = 0; j < numerosBidimensionales[1].length; j ++){
     System.out.println(numerosBidimensionales[i][j]);
    }
   }
 }
}