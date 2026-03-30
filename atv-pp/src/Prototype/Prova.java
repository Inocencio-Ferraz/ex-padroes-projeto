package Prototype;
import java.util.ArrayList;
import java.util.List;

public class Prova {
    private String titulo;
    private String turma;
    private String data;
    private String versao;
    private List<Questao> questoes;

    public Prova(String titulo, String turma, String data, String versao) {
        this.titulo = titulo;
        this.turma = turma;
        this.data = data;
        this.versao = versao;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao q) {
        this.questoes.add(q);
    }

    public Prova copiar() {
        Prova clone = new Prova(this.titulo, this.turma, this.data, this.versao);
        for (Questao q : this.questoes) {
            clone.adicionarQuestao(q.copiar());
        }
        return clone;
    }

    public int totalPontos() {
        int soma = 0;
        for (Questao q : questoes) {
            soma += q.getPontos();
        }
        return soma;
    }

    public void substituirQuestao(String id, Questao nova) {
        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getId().equals(id)) {
                questoes.set(i, nova);
                break;
            }
        }
    }

    public void printResumo() {
        System.out.println("==========================================");
        System.out.println("Prova: " + titulo);
        System.out.println("Turma: " + turma + " | Data: " + data + " | Versão: " + versao);
        System.out.println("Pontuação Total: " + totalPontos());
        System.out.println("Questões:");
        for (Questao q : questoes) {
            System.out.println("  " + q);
        }
    }

    public void setTurma(String turma) { this.turma = turma; }
    public void setData(String data) { this.data = data; }
    public void setVersao(String versao) { this.versao = versao; }
}