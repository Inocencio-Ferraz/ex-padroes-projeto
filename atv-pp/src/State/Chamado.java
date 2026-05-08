package State;

public class Chamado {
    private int codigo;
    private String descricao;
    private String solicitante;
    private EstadoChamado estadoAtual;

    public Chamado(int codigo, String descricao, String solicitante) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.solicitante = solicitante;
        this.estadoAtual = new EstadoAberto();
    }

    public void iniciarAtendimento() {
        estadoAtual.iniciarAtendimento(this);
    }

    public void aguardarCliente() {
        estadoAtual.aguardarCliente(this);
    }

    public void responderCliente() {
        estadoAtual.responderCliente(this);
    }

    public void resolver() {
        estadoAtual.resolver(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public void setEstado(EstadoChamado estado) {
        this.estadoAtual = estado;
    }

    public EstadoChamado getEstadoAtual() {
        return estadoAtual;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSolicitante() {
        return solicitante;
    }
}
