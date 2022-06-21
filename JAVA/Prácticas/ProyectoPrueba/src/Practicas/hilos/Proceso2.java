package Practicas.hilos;
// Otra forma de manejar los hilos es implementar la interfaz Runnable
public class Proceso2 implements Runnable{
    // hay que sobreescribir el método run()
    @Override
    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println("Proceso 2");
        }
    }
}
