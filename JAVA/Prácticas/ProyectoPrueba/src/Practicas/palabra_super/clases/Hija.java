package Practicas.palabra_super.clases;

public class Hija extends Padre{
    public void Saludar(){
        System.out.println("¡Hola, yo soy la hija!");
        //"super" llama al método "Saludar()" de la clase padre //
        super.Saludar();
    }
}
