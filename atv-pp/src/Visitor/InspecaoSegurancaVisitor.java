package Visitor;

public class InspecaoSegurancaVisitor implements VisitorInspeccionador {
    @Override
    public void visitar(Armazem armazem) {
        System.out.println("Segurança no Armazém: Avaliando rotas de fuga para " + armazem.getQuantidadeColaboradores() + " colaboradores.");
    }

    @Override
    public void visitar(Administrativo administrativo) {
        System.out.println("Segurança no Administrativo: Avaliando ergonomia e extintores de incêndio.");
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println("Segurança na Frota: Risco nível " + frota.getNivelRisco() + ". Verificando manutenção preventiva de " + frota.getQuantidadeVeiculos() + " veículos.");
    }

    @Override
    public void visitar(Producao producao) {
        if (producao.getNivelRisco() > 3) {
            System.out.println("Segurança na Produção: ALERTA! Risco alto (" + producao.getNivelRisco() + "). Inspecionando EPIs e " + producao.getQuantidadeEquipamentos() + " máquinas pesadas.");
        } else {
            System.out.println("Segurança na Produção: Inspeção de rotina nas máquinas.");
        }
    }
}