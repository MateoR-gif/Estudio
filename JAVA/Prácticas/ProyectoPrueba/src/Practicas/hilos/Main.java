package Practicas.hilos;

public class Main {
    public static void main(String[] args){
        //2 maneras diferentes de instanciar hilos: (es mejor el primero)
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo2 = new Proceso1(); // se pueden crear varios hilos con la misma clase
        Thread hilo3 = new Thread(new Proceso2());

        //método para hacer funcionar los hilos = start()
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
