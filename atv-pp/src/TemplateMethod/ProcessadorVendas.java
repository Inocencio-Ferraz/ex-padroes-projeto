package TemplateMethod;

public class ProcessadorVendas extends ProcessadorArquivo {

    @Override
    protected void validarEstrutura() {
        System.out.println("Validando campos: Data, Produto, Quantidade e Valor Total.");
    }

    @Override
    protected void lerDados() {
        System.out.println("Lendo transações de vendas do arquivo XML.");
    }

    @Override
    protected void processarDados() {
        System.out.println("Calculando comissões sobre o valor total das vendas.");
    }
}
