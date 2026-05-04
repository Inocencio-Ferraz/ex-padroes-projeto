package Command;

public class ConcluirTarefaCommand implements Command {
    private GerenciadorTarefas gerenciador;
    private String descricao;
    private Tarefa tarefa;

    public ConcluirTarefaCommand(GerenciadorTarefas gerenciador, String descricao) {
        this.gerenciador = gerenciador;
        this.descricao = descricao;
    }

    @Override
    public void execute() {
        tarefa = gerenciador.buscarPorDescricao(descricao);
        if (tarefa != null) {
            tarefa.setConcluida(true);
            System.out.println("Tarefa concluída: " + descricao);
        }
    }

    @Override
    public void undo() {
        if (tarefa != null) {
            tarefa.setConcluida(false);
            System.out.println("Tarefa voltou para pendente: " + descricao);
        }
    }
}
