package Adapter;

public class ArCondicionadoAdapter implements ControleUniversal {
    private ArCondicionadoApi Ar;

    public ArCondicionadoAdapter(ArCondicionadoApi Ar){
        this.Ar = Ar;
    }

    public void ligar(){
        Ar.LigarAr();
    }

    public void desligar() {
        Ar.DesligarAr();
    }

    public void aumentarVolume(){
        Ar.AumentarTemp();
    }

    public void diminuirVolume(){
        Ar.DiminuirTemp();
    }
}
