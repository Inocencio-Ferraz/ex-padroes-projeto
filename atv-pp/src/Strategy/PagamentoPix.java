package Strategy;

public class PagamentoPix implements PagamentoStrategy{
    @Override
    public double calcular(double valorPedido){
        return valorPedido - (valorPedido / 10);
    }
}
