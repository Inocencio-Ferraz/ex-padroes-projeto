package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- PROCESSANDO CLIENTES ---");
        ProcessadorArquivo procClientes = new ProcessadorClientes();
        procClientes.processarArquivo();

        System.out.println("\n--- PROCESSANDO PRODUTOS ---");
        ProcessadorArquivo procProdutos = new ProcessadorProdutos();
        procProdutos.processarArquivo();

        System.out.println("\n--- PROCESSANDO VENDAS ---");
        ProcessadorArquivo procVendas = new ProcessadorVendas();
        procVendas.processarArquivo();
    }
}
