package Mediator;

public abstract class Setor {
    protected MediadorClinica mediador;

    public Setor(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public abstract void receberMensagem(String mensagem);
}
