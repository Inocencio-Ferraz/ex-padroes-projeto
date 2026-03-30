package Abstract_Factory.fornecedorNacional;
import Abstract_Factory.Interface.NotaFiscal;

public class NotaFiscalNacional implements NotaFiscal {
    @Override
    public String emitir(String pedidoId, double valor){
        return "NF-NAC-<" + pedidoId +">";
    }
}
