package Abstract_Factory.fornecedorInternacional;
import Abstract_Factory.Interface.NotaFiscal;
public class NotaFiscalInternacional implements NotaFiscal {
    @Override
    public String emitir(String pedidoId, double valor){
        return "NF-INT-<" + pedidoId + ">";
    }
}
