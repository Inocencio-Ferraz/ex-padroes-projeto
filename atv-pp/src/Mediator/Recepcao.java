package Mediator;

public class Recepcao extends Setor {
    public Recepcao(MediadorClinica mediador) {
        super(mediador);
    }

    public void iniciarAtendimento(String paciente) {
        System.out.println("RECEPÇÃO: Iniciando atendimento do paciente " + paciente);
        mediador.enviarMensagem("Novo paciente aguardando: " + paciente, this);
    }

    public void finalizarAtendimento(String paciente) {
        System.out.println("RECEPÇÃO: Finalizando atendimento do paciente " + paciente);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("RECEPÇÃO recebeu: " + mensagem);
    }
}
