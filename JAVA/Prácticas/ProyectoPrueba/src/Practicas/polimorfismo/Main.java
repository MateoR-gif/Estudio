package Practicas.polimorfismo;

public class Main {
    public static void main(String[] args){
        Operaciones_ClasePadre instanciaSuma = new Suma_ClaseHija();
        Operaciones_ClasePadre instanciaResta = new Resta_ClaseHija();

        instanciaSuma.PedirDatos();
        instanciaSuma.Operaciones();
        instanciaSuma.MostrarResultado();

        instanciaResta.PedirDatos();
        instanciaResta.Operaciones();
        instanciaResta.MostrarResultado();
    }
}
