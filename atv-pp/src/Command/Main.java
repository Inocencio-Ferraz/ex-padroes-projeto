package Command;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        PainelControle painel = new PainelControle();

        System.out.println("\n");
        painel.executarComando(new AdicionarTarefaCommand(gerenciador, "Estudar Command"));
        painel.executarComando(new AdicionarTarefaCommand(gerenciador, "Implementar exercício"));
        painel.executarComando(new ConcluirTarefaCommand(gerenciador, "Estudar Command"));

        System.out.println("\n");
        painel.desfazerUltimoComando();

        painel.adicionarNaFila(new AdicionarTarefaCommand(gerenciador, "Revisar Observer"));
        painel.adicionarNaFila(new AdicionarTarefaCommand(gerenciador, "Estudar Chain of Responsibility"));
        painel.adicionarNaFila(new ConcluirTarefaCommand(gerenciador, "Implementar exercício"));
        System.out.println("\n");

        painel.processarFila();

        gerenciador.exibirTarefas();
    }
}
