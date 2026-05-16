package Visitor;

public class Producao implements SetorElement {
    private int quantidadeEquipamentos;
    private int nivelRisco;

    public Producao(int quantidadeEquipamentos, int nivelRisco) {
        this.quantidadeEquipamentos = quantidadeEquipamentos;
        this.nivelRisco = nivelRisco;
    }

    public int getQuantidadeEquipamentos() {
        return quantidadeEquipamentos;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    @Override
    public void aceitar(VisitorInspeccionador visitor) {
        visitor.visitar(this);
    }
}