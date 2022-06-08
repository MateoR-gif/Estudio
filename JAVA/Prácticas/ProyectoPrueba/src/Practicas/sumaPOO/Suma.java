/*
    * Creado por Mateo Rendón
    * Versión 1.0
    * Fecha: 08/06/2022
*/

package Practicas.sumaPOO;

public class Suma {
    // "private" para que las variables solo se usen dentro de la clase Suma //
    private int vUno, vDos, Resultado;
    // Método Constructor //
    public Suma(int valorUno, int valorDos){
        // "this" => esta clase //
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    /*
        * "Public" Para que sea utilizado por métodos externos.
        * "Void" para que su retorno sea el resultado de la suma.
    */
    public void Operacion(){
        Resultado = vUno + vDos;
    }
    // Método para imprimir el resultado en pantalla //
    public void Imprimir(){
        // Llamar al método que tiene el resultado de la suma (Operacion()) //
        Operacion();
        System.out.println("El Resultado de la Suma es: " + Resultado);
    }
}
