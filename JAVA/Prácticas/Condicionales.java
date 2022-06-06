public class Condicionales{
  public static void main(String args[]){
   int matematicas = 5;
   int biologia = 8;
   int quimica = 4;
   int promedio = 0;
   
   promedio = (matematicas + biologia + quimica) / 3;
   if(promedio >= 6){
     System.out.println("Aprobó con el promedio: " + promedio);
   }else{
     System.out.println("No Aprobó con el promedio: " + promedio);
   }
 }
}