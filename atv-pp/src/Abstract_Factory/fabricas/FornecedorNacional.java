package Abstract_Factory.fabricas;
import Abstract_Factory.Interface.Frete;
import Abstract_Factory.Interface.NotaFiscal;
import Abstract_Factory.Interface.Pagamento;
import Abstract_Factory.fornecedorNacional.FreteNacional;
import Abstract_Factory.fornecedorNacional.NotaFiscalNacional;
import Abstract_Factory.fornecedorNacional.PagamentoNacional;

public class FornecedorNacional implements FornecedorFactory{
    @Override
    public Pagamento criarPagamento(){
        return new PagamentoNacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal(){
        return new NotaFiscalNacional();
    }

    @Override
    public Frete criarFrete(){
        return new FreteNacional();
    }
}
