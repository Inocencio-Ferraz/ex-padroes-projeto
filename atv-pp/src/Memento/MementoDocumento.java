package Memento;

public class MementoDocumento {
    private final String titulo;
    private final String conteudo;
    private final String autor;

    public MementoDocumento(String titulo, String conteudo, String autor) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAutor() {
        return autor;
    }
}
