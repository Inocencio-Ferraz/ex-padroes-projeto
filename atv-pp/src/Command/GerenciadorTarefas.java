package Command;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getDescricao());
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
        System.out.println("Tarefa removida: " + tarefa.getDescricao());
    }

    public Tarefa removerUltima() {
        if (!tarefas.isEmpty()) {
            Tarefa t = tarefas.remove(tarefas.size() - 1);
            System.out.println("Tarefa removida: " + t.getDescricao());
            return t;
        }
        return null;
    }

    public Tarefa buscarPorDescricao(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                return t;
            }
        }
        return null;
    }

    public void exibirTarefas() {
        System.out.println("\n--- LISTA DE TAREFAS ---");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
        System.out.println("------------------------");
    }
}
