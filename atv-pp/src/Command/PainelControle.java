package Command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PainelControle {
    private Stack<Command> historico = new Stack<>();
    private Queue<Command> filaComandos = new LinkedList<>();

    public void executarComando(Command command) {
        command.execute();
        historico.push(command);
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            System.out.println("Desfazendo último comando...");
            Command command = historico.pop();
            command.undo();
        }
    }

    public void adicionarNaFila(Command command) {
        filaComandos.add(command);
        System.out.println("Comando adicionado na fila.");
    }

    public void processarFila() {
        System.out.println("Processando fila...");
        while (!filaComandos.isEmpty()) {
            Command command = filaComandos.poll();
            command.execute();
            historico.push(command);
        }
    }
}
