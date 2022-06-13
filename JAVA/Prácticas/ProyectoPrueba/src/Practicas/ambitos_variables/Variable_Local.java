package Practicas.ambitos_variables;

public class Variable_Local {

    void miMetodo(int parametro){
        int variableLocal = 52; //Esta es una variable local, se debe inicializar y no se puede usar fuera del método //

        System.out.println("Variable Local: " + variableLocal);
        System.out.println("Parametro: " + parametro);
    }
}
