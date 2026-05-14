package Mediator;

public class Laboratorio extends Setor {
    public Laboratorio(MediadorClinica mediador) {
        super(mediador);
    }

    public void informarResultado(String resultado) {
        System.out.println("LABORATÓRIO: Resultado pronto: " + resultado);
        mediador.enviarMensagem("Resultado de exame disponível: " + resultado, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("LABORATÓRIO recebeu: " + mensagem);
    }
}
