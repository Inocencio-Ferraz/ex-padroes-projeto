package TemplateMethod;

public class ProcessadorProdutos extends ProcessadorArquivo {

    @Override
    protected void validarEstrutura() {
        System.out.println("Validando campos: Código, Descrição, Preço e Estoque.");
    }

    @Override
    protected void lerDados() {
        System.out.println("Lendo lista de produtos do arquivo JSON.");
    }

    @Override
    protected void processarDados() {
        System.out.println("Atualizando margem de lucro nos preços dos produtos.");
    }
}
