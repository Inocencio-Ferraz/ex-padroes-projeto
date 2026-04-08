package Strategy;

public class PagamentoCartao implements PagamentoStrategy{
    @Override
    public double calcular(double valorPedido){
        return valorPedido + (valorPedido * 0.05);
    }
}
