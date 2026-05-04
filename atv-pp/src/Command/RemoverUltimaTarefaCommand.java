package Command;

public class RemoverUltimaTarefaCommand implements Command {
    private GerenciadorTarefas gerenciador;
    private Tarefa tarefaRemovida;

    public RemoverUltimaTarefaCommand(GerenciadorTarefas gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void execute() {
        tarefaRemovida = gerenciador.removerUltima();
    }

    @Override
    public void undo() {
        if (tarefaRemovida != null) {
            gerenciador.adicionarTarefa(tarefaRemovida);
        }
    }
}
