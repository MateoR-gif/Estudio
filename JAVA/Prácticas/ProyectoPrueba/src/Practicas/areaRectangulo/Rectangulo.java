/*
 * Creado por Mateo Rendón
 * Versión 1.0
 * Fecha: 09/06/2022
 */

package Practicas.areaRectangulo;

public class Rectangulo {
    private int base, altura, area;
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void Operacion(){
        area = base * altura;
    }

    public void Imprimir(){
        Operacion();
        System.out.println("Area: " + area);
    }
}
