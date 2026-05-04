package Command;

public class AdicionarTarefaCommand implements Command {
    private GerenciadorTarefas gerenciador;
    private Tarefa tarefa;

    public AdicionarTarefaCommand(GerenciadorTarefas gerenciador, String descricao) {
        this.gerenciador = gerenciador;
        this.tarefa = new Tarefa(descricao);
    }

    @Override
    public void execute() {
        gerenciador.adicionarTarefa(tarefa);
    }

    @Override
    public void undo() {
        gerenciador.removerTarefa(tarefa);
    }
}
