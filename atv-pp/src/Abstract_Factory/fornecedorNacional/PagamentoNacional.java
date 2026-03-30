package Abstract_Factory.fornecedorNacional;

import Abstract_Factory.Interface.Pagamento;

public class PagamentoNacional implements Pagamento {
    @Override
    public boolean pagar(double valor){
        System.out.println("[NACIONAL] Pagamento aprovado.");
        return true;
    }
}
