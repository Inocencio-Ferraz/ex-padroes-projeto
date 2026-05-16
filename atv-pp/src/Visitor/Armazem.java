package Visitor;

public class Armazem implements SetorElement {
    private int quantidadeColaboradores;
    private String statusOrganizacao;

    public Armazem(int quantidadeColaboradores, String statusOrganizacao) {
        this.quantidadeColaboradores = quantidadeColaboradores;
        this.statusOrganizacao = statusOrganizacao;
    }

    public int getQuantidadeColaboradores() {
        return quantidadeColaboradores;
    }

    public String getStatusOrganizacao() {
        return statusOrganizacao;
    }

    @Override
    public void aceitar(VisitorInspeccionador visitor) {
        visitor.visitar(this);
    }
}
