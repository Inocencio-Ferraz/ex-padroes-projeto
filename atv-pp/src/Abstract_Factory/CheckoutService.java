package Abstract_Factory;
import Abstract_Factory.Interface.Frete;
import Abstract_Factory.Interface.NotaFiscal;
import Abstract_Factory.Interface.Pagamento;
import Abstract_Factory.fabricas.FornecedorFactory;

public class CheckoutService {
    private Pagamento pagamento;
    private Frete frete;
    private NotaFiscal notaFiscal;

    public CheckoutService(FornecedorFactory factory){
        this.pagamento = factory.criarPagamento();
        this.frete = factory.criarFrete();
        this.notaFiscal = factory.criarNotaFiscal();
    }

    public void finalizarCompra(String pedidoId, double valorProdutos, double pesoKg,
                                String cepDestino){

        System.out.println("== CHECKOUT pedido " + pedidoId + " ==");

        double valorFrete = frete.calcularFrete(pesoKg, cepDestino);
        System.out.println("Frete calculado: " + valorFrete);

        double valorTotal = valorProdutos + valorFrete;
        System.out.println("Total: " + valorTotal);
        pagamento.pagar(valorTotal);

        String nfCodigo = notaFiscal.emitir(pedidoId, valorTotal);
        System.out.println("NF gerada: " + nfCodigo);
        System.out.println("Compra finalizada!");
    }
}
