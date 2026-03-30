package Abstract_Factory.fornecedorInternacional;
import Abstract_Factory.Interface.Frete;
public class FreteInternacional implements Frete{
    @Override
    public double calcularFrete(double pesoKG, String cepDestino){
        return 40 + (pesoKG * 5);
    }
}
