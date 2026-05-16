package Visitor;

public class AvaliacaoLimpezaVisitor implements VisitorInspeccionador {
    @Override
    public void visitar(Armazem armazem) {
        System.out.println("Limpeza no Armazém: Status de organização atual é '" + armazem.getStatusOrganizacao() + "'. Verificando poeira e paletes.");
    }

    @Override
    public void visitar(Administrativo administrativo) {
        System.out.println("Limpeza no Administrativo: Conferindo descarte de papéis e organização das mesas.");
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println("Limpeza na Frota: Verificando lava-jato e resíduos de óleo na garagem.");
    }

    @Override
    public void visitar(Producao producao) {
        System.out.println("Limpeza na Produção: Coletando resíduos industriais ao redor dos " + producao.getQuantidadeEquipamentos() + " equipamentos.");
    }
}
