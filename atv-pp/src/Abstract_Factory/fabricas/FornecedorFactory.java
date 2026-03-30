package Abstract_Factory.fabricas;
import Abstract_Factory.Interface.*;

public interface FornecedorFactory {
    Pagamento criarPagamento();
    Frete criarFrete();
    NotaFiscal criarNotaFiscal();
}
