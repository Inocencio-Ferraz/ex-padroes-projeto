package Bridge;

import java.util.List;

public class RelatorioFinanceiro extends Relatorio{
    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> filtrados = filtrarItensDetalhados(detalhado);
        double total = calcularTotal(filtrados);
        exportador.exportar("Relatório Financeiro", filtrados, total);
    }
}
