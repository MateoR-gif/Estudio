package Practicas.hilos;
// Heredamos de la clase Thread que viene en el JDK de java
public class Proceso1 extends Thread{
    //el método run viene dentro de la clase Thread y hay que sobreescribirlo (@Override)
    @Override
    public void run(){
        for(int i = 0; i <=5; i ++){
            System.out.println("Proceso 1");
        }
    }
}
