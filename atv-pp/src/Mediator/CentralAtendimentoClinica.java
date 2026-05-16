package Mediator;

import java.util.ArrayList;
import java.util.List;

public class CentralAtendimentoClinica implements MediadorClinica {
    private List<Setor> setores = new ArrayList<>();

    public void registrarSetor(Setor setor) {
        setores.add(setor);
    }

    @Override
    public void enviarMensagem(String mensagem, Setor remetente) {
        for (Setor setor : setores) {
            if (setor != remetente) {
                setor.receberMensagem(mensagem);
            }
        }
    }
}
