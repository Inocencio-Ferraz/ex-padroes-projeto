package Builder;

public class Pizza extends Pedido{
    private final String tipoMassa;
    private final boolean bordaRecheada;

    public Pizza(PedidoBuilder builder) {
        super(builder);
        this.tipoMassa = builder.tipoMassa;
        this.bordaRecheada = builder.bordaRecheada;
    }

    @Override
    public void printResumo() {
        System.out.println("========= [RECIBO PIZZA] =========");
        printDadosComuns();
        System.out.println("MASSA: " + tipoMassa);
        System.out.println("BORDA RECHEADA: " + (bordaRecheada ? "SIM" : "NÃO"));
        System.out.println("==================================\n");
    }
}
