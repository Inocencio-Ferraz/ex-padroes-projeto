package Builder;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new PedidoBuilder().tipoHamburguer().tipoPao("BRIOCHE").tamanhoM().addItem("X-Bacon").pagarComPix().entregaDelivery("Rua A, 1").comObservacao("Sem cebola").build();
        p1.printResumo();

        Pedido p2 = new PedidoBuilder().tipoPizza().tipoMassa("FINA").tamanhoG().addItem("Calabresa").comBordaRecheada().pagarComCartao().entregaRetirada().comCupom("10OFF").build();
        p2.printResumo();

        Pedido p3 = new PedidoBuilder().tipoHamburguer().tipoPao("INTEGRAL").tamanhoP().addItem("Veggie").pagarComDinheiro().comTrocoPara(50.0).entregaRetirada().build();
        p3.printResumo();

        try {
            new PedidoBuilder().tipoPizza().tamanhoM().addItem("Mussarela").pagarComPix().entregaRetirada().build();
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
