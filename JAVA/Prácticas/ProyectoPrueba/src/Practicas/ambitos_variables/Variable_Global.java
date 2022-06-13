package Practicas.ambitos_variables;

public class Variable_Global {
    int variableGlobal; //La variable global se declara fuera de los métodos y no se tiene que inicializar //

    void miMetodo(){
        System.out.println("Variable Global: " + variableGlobal);
    }

    public void Prueba(){
        System.out.println("Variable Global: " + variableGlobal);
    }

}
