package Practicas.lavadora;

public class Funciones {
    private int kilosRopa, tipoRopa = 0;
    private boolean llenadoCompleto = false, lavadoCompleto = false,
                    secadoCompleto = false, error = false;

    public Funciones(int kilosRopa, int tipoRopa){
        this.kilosRopa = kilosRopa;
        this.tipoRopa = tipoRopa;
    }

    private void Comprobaciones(){
        if(kilosRopa <= 12){
            System.out.println("Todo correcto para iniciar...");
        }else{
            System.out.println("Ha excedido los kilos");
            error = true;
        }
    }

    private void LlenadoAgua(){
        if(kilosRopa <= 12){
            if(llenadoCompleto){
                System.out.println("La lavadora ya está llena de agua");
            }else {
                System.out.println("Llenando...");
                llenadoCompleto = true;
                System.out.println("Llenado Completo");
            }
        }else{
            System.out.println("Ha excedido los kilos");
            error = true;
            CicloFinalizado();
        }
    }

    private void Lavado(){
        LlenadoAgua();
        if(llenadoCompleto){
            if(tipoRopa == 1){
                System.out.println("Ropa Blanca / Lavado Suave");
                System.out.println("Lavando...");
                lavadoCompleto = true;
                System.out.println("Fin Lavado.");
            }else if(tipoRopa == 2){
                System.out.println("Ropa de Color / Lavado Intenso");
                System.out.println("Lavando...");
                lavadoCompleto = true;
                System.out.println("Fin Lavado.");
            }else{
                System.out.println("Visajoso, se la voy a lavar como ropa de color");
                tipoRopa = 2;
                Lavado();
            }
        }else{
            System.out.println("La lavadora no se ha llenado de agua");
        }
    }

    private void Secado(){
        Lavado();
        if(lavadoCompleto){
            System.out.println("Secando...");
            secadoCompleto = true;
            System.out.println("Secado Completo");
        }else{
            System.out.println("La ropa no ha podido lavarse");
        }
    }

    public void CicloFinalizado(){
        Comprobaciones();
        if(error){
            System.out.println("Hubo un error en el lavado");
        }else{
            Secado();
            if (secadoCompleto) {
                System.out.println("La ropa está lista");
            } else {
                System.out.println("La ropa no ha finalizado el ciclo correctamente");
            }
        }
    }

    // Setter y Getter //

    public int getTipoRopa(){
        return tipoRopa;
    }
    public void setTipoRopa(int tipoRopa){
        this.tipoRopa = tipoRopa;
    }
}
