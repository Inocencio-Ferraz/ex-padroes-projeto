package Adapter;

public class MiRemoteApp {

    private ControleUniversal dispositivo;

    public MiRemoteApp(ControleUniversal dispositivo){
        this.dispositivo = dispositivo;
    }


    public void assistir(){
        dispositivo.ligar();
        dispositivo.aumentarVolume();
        System.out.println("Bem vindo!");
    }


    public void xau(){
        dispositivo.diminuirVolume();
        dispositivo.desligar();
        System.out.println("Até mais...");
    }


}

