package Practicas.herencia.main;
import Practicas.herencia.operaciones.ClaseHija_Resta;
import Practicas.herencia.operaciones.ClaseHija_Suma;

public class ClaseMain {
    public static void main(String[] args){
        ClaseHija_Suma instanciaSuma = new ClaseHija_Suma();
        ClaseHija_Resta instanciaResta = new ClaseHija_Resta();

        instanciaSuma.PedirDatos();
        instanciaSuma.Sumar();
        instanciaSuma.ImprimirResultado();
        instanciaResta.PedirDatos();
        instanciaResta.Restar();
        instanciaResta.ImprimirResultado();
    }
}
