package Prototype;
public class Questao {
    private String id;
    private String enunciado;
    private int pontos;

    public Questao(String id, String enunciado, int pontos) {
        this.id = id;
        this.enunciado = enunciado;
        this.pontos = pontos;
    }

    public Questao copiar() {
        return new Questao(this.id, this.enunciado, this.pontos);
    }

    @Override
    public String toString() {
        int limite = Math.min(enunciado.length(), 25);
        return id + " (" + pontos + " pts) - " + enunciado.substring(0, limite) + "...";
    }

    public String getId() { return id; }
    public void setEnunciado(String enunciado) { this.enunciado = enunciado; }
    public int getPontos() { return pontos; }
    public void setPontos(int pontos) { this.pontos = pontos; }
}