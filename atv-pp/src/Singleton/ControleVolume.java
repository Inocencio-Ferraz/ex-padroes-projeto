package Singleton;

public class ControleVolume {
    private static final ControleVolume INSTANCE = new ControleVolume();
    private int volume;

    private ControleVolume() {
        this.volume = 50;
    }

    public static ControleVolume getInstance() {
        return INSTANCE;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentar(int passo) {
        if (passo < 0) {
            throw new IllegalArgumentException("Passo deve ser > 0");
        }
        setVolume(this.volume + passo);
    }

    public void diminuir(int passo) {
        if (passo < 0) {
            throw new IllegalArgumentException("Passo deve ser > 0");
        }
        setVolume(this.volume - passo);
    }

    public void mutar() {
        this.volume = 0;
    }

    public void setVolume(int novoVolume) {
        if (novoVolume > 100) {
            this.volume = 100;
        } else if (novoVolume < 0) {
            this.volume = 0;
        } else {
            this.volume = novoVolume;
        }
    }
}
