public class Ciclos{
  public static void main(String args[]){

    System.out.println(" ");
    System.out.println("For Incrementado");
    System.out.println(" ");

    for(int i=5; i>=0; i--){
      System.out.println(i);
    }

    System.out.println(" ");
    System.out.println("For Decrementado");
    System.out.println(" ");

    for(int i=0; i<=5; i++){
      System.out.println(i);
    }

    System.out.println(" ");
    System.out.println("While Incrementado");
    System.out.println(" ");
    int i = 0;

    while(i<10){
      System.out.println(i);
      i+=2;
    }

    System.out.println(" ");
    System.out.println("Do While Decrementado");
    System.out.println(" ");

    i = 1000;
    do{
      System.out.println(i);
      i-=200;
    }while(i>=0);
  }
}