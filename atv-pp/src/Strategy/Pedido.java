package Strategy;

public class Pedido {
    private PagamentoStrategy pagamentoStrategy;
    private double valor;

    public Pedido(PagamentoStrategy pagamentoStrategy, double valor){
        this.pagamentoStrategy = pagamentoStrategy;
        this.valor = valor;
    }

    public double calcularTotal(){
        return pagamentoStrategy.calcular(valor);
    }

    public void alterarEstrategia(PagamentoStrategy novaEstrategia){
        this.pagamentoStrategy = novaEstrategia;
    }
}
