//* Escribir hola mundo *//
function holaMundo(){
    document.getElementById("p").innerHTML='Hola Mundo';
}

/* Crea una Función Llamada "avisoLluvia",
que contenga un único parámetro y que este esa
booleano (estaLloviendo). Si está lloviendo,
se imprimirá "Está Lloviendo", si no, "No está Lloviendo"
*/

function avisoLluvia(estaLloviendo){
    if(estaLloviendo){
        console.log('Está Lloviendo')
    }else{
        console.log('No está lloviendo')
    }
}

avisoLluvia(false)

/* Función "Calcular", Parámetros: X,Y,Z, Retorno: (X + Y) * Z */

function calcular(X, Y, Z){
    let suma = X + Y;
    let multiplicacion = suma * Z;
    console.log(multiplicacion)
}

calcular(2,3,5)