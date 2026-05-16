package Visitor;

public class Frota implements SetorElement {
    private int quantidadeVeiculos;
    private int nivelRisco;

    public Frota(int quantidadeVeiculos, int nivelRisco) {
        this.quantidadeVeiculos = quantidadeVeiculos;
        this.nivelRisco = nivelRisco;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    @Override
    public void aceitar(VisitorInspeccionador visitor) {
        visitor.visitar(this);
    }
}