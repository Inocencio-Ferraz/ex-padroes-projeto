package Singleton;

public class Alerta {
    public void tocar() {
        ControleVolume.getInstance().setVolume(80);
        System.out.println("Alerta tocando no volume " + ControleVolume.getInstance().getVolume());
    }

    public void parar() {
        System.out.println("Alerta parado");
    }
}
