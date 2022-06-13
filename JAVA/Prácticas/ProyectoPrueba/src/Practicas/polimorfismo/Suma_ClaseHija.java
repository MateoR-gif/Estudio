package Practicas.polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre{
    //@Override para declarar que estamos sobreescribiendo un método ya declarado//
    @Override
    public void Operaciones(){
        resultado = valor1 + valor2;
    }
}
