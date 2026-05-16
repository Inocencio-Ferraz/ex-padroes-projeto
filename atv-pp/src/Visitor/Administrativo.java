package Visitor;

public class Administrativo implements SetorElement {
    private String responsavel;
    private boolean possuiPendencias;

    public Administrativo(String responsavel, boolean possuiPendencias) {
        this.responsavel = responsavel;
        this.possuiPendencias = possuiPendencias;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public boolean isPossuiPendencias() {
        return possuiPendencias;
    }

    @Override
    public void aceitar(VisitorInspeccionador visitor) {
        visitor.visitar(this);
    }
}
