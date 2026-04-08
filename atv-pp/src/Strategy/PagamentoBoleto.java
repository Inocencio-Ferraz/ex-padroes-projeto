package Strategy;

public class PagamentoBoleto implements PagamentoStrategy{
    @Override
    public double calcular(double valorPedido){
        return  valorPedido - (valorPedido * 0.05) + 2;
    }
}
