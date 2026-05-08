package State;

public class EstadoAberto implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        chamado.setEstado(new EstadoEmAtendimento());
        System.out.println("Chamado em atendimento.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar cliente com o chamado aberto.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não há resposta de cliente para um chamado aberto.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver um chamado que ainda está aberto.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        chamado.setEstado(new EstadoCancelado());
        System.out.println("Chamado cancelado.");
    }
}
