package State;

public class EstadoEmAtendimento implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("O chamado já está em atendimento.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        chamado.setEstado(new EstadoAguardandoCliente());
        System.out.println("Chamado aguardando cliente.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("O cliente ainda não precisa responder.");
    }

    @Override
    public void resolver(Chamado chamado) {
        chamado.setEstado(new EstadoResolvido());
        System.out.println("Chamado resolvido.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        chamado.setEstado(new EstadoCancelado());
        System.out.println("Chamado cancelado.");
    }
}
