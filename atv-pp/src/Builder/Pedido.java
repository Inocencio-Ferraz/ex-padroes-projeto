package Builder;
import java.util.List;

public abstract class Pedido {
    protected final String tipo;
    protected final String tamanho;
    protected final String pagamento;
    protected final List<String> itens;
    protected final String entrega;
    protected final String enderecoEntrega;
    protected final String cupom;
    protected final String observacao;
    protected final Double trocoPara;

    protected Pedido(PedidoBuilder builder) {
        this.tipo = builder.tipo;
        this.tamanho = builder.tamanho;
        this.pagamento = builder.pagamento;
        this.itens = List.copyOf(builder.itens);
        this.entrega = builder.entrega;
        this.enderecoEntrega = builder.enderecoEntrega;
        this.cupom = builder.cupom;
        this.observacao = builder.observacao;
        this.trocoPara = builder.trocoPara;
    }

    public abstract void printResumo();

    protected void printDadosComuns() {
        System.out.println("TIPO: " + tipo + " | TAMANHO: " + tamanho);
        System.out.println("ITENS: " + String.join(", ", itens));
        System.out.print("PAGAMENTO: " + pagamento);
        if (trocoPara != null) System.out.print(" (Troco para R$" + trocoPara + ")");
        System.out.println("\nENTREGA: " + entrega + (enderecoEntrega != null ? " --->>>> " + enderecoEntrega : ""));
    }
}
