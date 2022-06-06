public class SwitchCase{
  public static void main(String args[]){
    
    int num_1 = 5, num_2 = 3, resultado = 0;
    int parametro = -32; 
   
    switch(parametro){
      case 1: resultado = num_1 + num_2;
              System.out.println("Resultado: " + resultado);
              break;
      case 2: resultado = num_1 - num_2;
              System.out.println("Resultado: " + resultado);
              break;
      default: System.out.println("sapo");
    }
  }
}