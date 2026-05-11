package TemplateMethod;

public abstract class ProcessadorArquivo {

    public final void processarArquivo() {
        abrirArquivo();
        validarEstrutura();
        lerDados();
        processarDados();
        salvarResultado();
        fecharArquivo();
    }

    private void abrirArquivo() {
        System.out.println("Abrindo arquivo...");
    }

    protected abstract void validarEstrutura();

    protected abstract void lerDados();

    protected abstract void processarDados();

    private void salvarResultado() {
        System.out.println("Salvando resultado no banco de dados...");
    }

    private void fecharArquivo() {
        System.out.println("Fechando arquivo.");
    }
}
