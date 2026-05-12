package Iterator;

import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {
    private List<SenhaAtendimento> senhas = new ArrayList<>();

    public void adicionarSenha(SenhaAtendimento senha) {
        senhas.add(senha);
    }

    public IteratorSenha criarIterator() {
        return new FilaAtendimentoIterator(this.senhas);
    }
}

class FilaAtendimentoIterator implements IteratorSenha {
    private List<SenhaAtendimento> lista;
    private int posicao = 0;

    public FilaAtendimentoIterator(List<SenhaAtendimento> lista) {
        this.lista = lista;
    }

    @Override
    public boolean temProximo() {
        return posicao < lista.size();
    }

    @Override
    public SenhaAtendimento proximo() {
        if (temProximo()) {
            return lista.get(posicao++);
        }
        return null;
    }
}