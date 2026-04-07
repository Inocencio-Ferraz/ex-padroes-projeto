package Bridge;
import java.util.List;
import java.util.ArrayList;

public abstract class Relatorio {
    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador){
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item){
        this.itens.add(item);
    }

    protected double calcularTotal(List<ItemRelatorio> itensParaSomar) {
        double total = 0;
        for (ItemRelatorio item : itensParaSomar) {
            total += item.getValor();
        }
        return total;
    }

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado) {
        if (detalhado) {
            return new ArrayList<>(this.itens);
        }
        List<ItemRelatorio> simples = new ArrayList<>();
        for (ItemRelatorio item : this.itens) {
            if (item.getValor() >= 100) {
                simples.add(item);
            }
        }
        return simples;
    }

    public abstract void gerar(boolean detalhado);
}

