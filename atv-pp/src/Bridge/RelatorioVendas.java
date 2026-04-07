package Bridge;
import java.util.List;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> filtrados = filtrarItensDetalhados(detalhado);

        double total = calcularTotal(filtrados);

        exportador.exportar("Relatório de Vendas", filtrados, total);
    }
}