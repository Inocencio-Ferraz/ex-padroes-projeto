package Abstract_Factory.fabricas;

import Abstract_Factory.Interface.Frete;
import Abstract_Factory.Interface.NotaFiscal;
import Abstract_Factory.Interface.Pagamento;
import Abstract_Factory.fornecedorInternacional.FreteInternacional;
import Abstract_Factory.fornecedorInternacional.PagamentoInternacional;
import Abstract_Factory.fornecedorInternacional.NotaFiscalInternacional;

public class FornecedorInternacional implements FornecedorFactory{
    @Override
    public Pagamento criarPagamento(){
        return new PagamentoInternacional();
    }

    @Override
    public Frete criarFrete(){
        return new FreteInternacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal(){
        return new NotaFiscalInternacional();
    }
}
