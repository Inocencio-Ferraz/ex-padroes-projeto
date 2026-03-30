package Builder;

public class Hamburguer extends Pedido{
    private final String tipoPao;

    public Hamburguer(PedidoBuilder builder) {
        super(builder);
        this.tipoPao = builder.tipoPao;
    }

    @Override
    public void printResumo() {
        System.out.println("[RECIBO HAMBÚRGUER]");
        printDadosComuns();
        System.out.println("PÃO: " + tipoPao);
        System.out.println("=======================================\n");
    }
}
