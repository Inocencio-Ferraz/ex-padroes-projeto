package Singleton;

public class Main {
    public static void main(String[] args) {

        ControleVolume a = ControleVolume.getInstance();
        ControleVolume b = ControleVolume.getInstance();
        System.out.println("Mesma instância? " + (a == b));

        BotaoFisicoVolume botao = new BotaoFisicoVolume();
        PlayerMusica player = new PlayerMusica();
        Alerta alerta = new Alerta();

        player.mostrarVolume();
        botao.pressionarMais();
        botao.pressionarMais();
        player.mostrarVolume();

        alerta.tocar();
        player.mostrarVolume();

        ControleVolume.getInstance().mutar();
        player.mostrarVolume();

        ControleVolume.getInstance().setVolume(95);
        botao.pressionarMais();
        botao.pressionarMais();
        player.mostrarVolume();
    }
}
