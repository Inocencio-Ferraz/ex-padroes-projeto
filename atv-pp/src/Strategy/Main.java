package Strategy;

public class Main {
    public static void main(String [] args){
        Pedido p1 = new Pedido(new PagamentoCartao(), 200);
        System.out.println("Pagamento com Cartão: R$ " + p1.calcularTotal());

        Pedido p2 = new Pedido(new PagamentoPix(), 200);
        System.out.println("Pagamento com Pix: R$ " + p2.calcularTotal());

        Pedido p3 = new Pedido(new PagamentoBoleto(), 200);
        System.out.println("Pagamento com Boleto: R$ " + p3.calcularTotal());

        Pedido p4 = new Pedido(new PagamentoCartao(), 200);
        pedido p5 = pedido p4;
        pedido p5 = new Pedido(new PagamentoPix(), 200);
        System.out.println("Novo total com Pix: R$ " + p4.calcularTotal());
    }
}
