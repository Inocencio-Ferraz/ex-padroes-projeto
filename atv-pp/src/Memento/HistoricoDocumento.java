package Memento;
import java.util.Stack;

public class HistoricoDocumento {
    private Stack<MementoDocumento> estados = new Stack<>();

    public void adicionar(MementoDocumento memento) {
        estados.push(memento);
    }

    public MementoDocumento desfazer() {
        if (!estados.isEmpty()) {
            return estados.pop();
        }
        return null;
    }
}
