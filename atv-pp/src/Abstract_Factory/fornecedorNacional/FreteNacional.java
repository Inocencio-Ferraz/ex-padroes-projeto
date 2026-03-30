package Abstract_Factory.fornecedorNacional;
import Abstract_Factory.Interface.Frete;

public class FreteNacional implements Frete {
    @Override
    public double calcularFrete(double pesoKG, String cepDestino) {
        return 15 + (pesoKG * 2);
    }
}