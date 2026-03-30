package Abstract_Factory;

import Abstract_Factory.fabricas.FornecedorInternacional;
import Abstract_Factory.fabricas.FornecedorNacional;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutNacional = new CheckoutService(new FornecedorNacional());
        checkoutNacional.finalizarCompra("PED-10", 99.0, 2.0, "01000-000");

        System.out.println("----------------------------------------------------------------------------------------");

        CheckoutService checkoutInternacional = new CheckoutService(new FornecedorInternacional());
        checkoutInternacional.finalizarCompra("PED-10", 99.0, 3.0, "90210");
    }
}