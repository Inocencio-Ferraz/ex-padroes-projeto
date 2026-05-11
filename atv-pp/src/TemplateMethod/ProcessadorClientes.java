package TemplateMethod;

public class ProcessadorClientes extends ProcessadorArquivo {

    @Override
    protected void validarEstrutura() {
        System.out.println("Validando campos: Nome, CPF, E-mail e Telefone.");
    }

    @Override
    protected void lerDados() {
        System.out.println("Lendo registros de clientes do arquivo CSV.");
    }

    @Override
    protected void processarDados() {
        System.out.println("Verificando se os CPFs dos clientes são válidos.");
    }
}
