package Mediator;

public class Medico extends Setor {
    public Medico(MediadorClinica mediador) {
        super(mediador);
    }

    public void solicitarExame(String exame) {
        System.out.println("MÉDICO: Solicitando exame: " + exame);
        mediador.enviarMensagem("Exame solicitado: " + exame, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("MÉDICO recebeu: " + mensagem);
    }
}
