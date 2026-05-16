package Memento;

public class Documento {
    private String titulo;
    private String conteudo;
    private String autor;

    public Documento(String titulo, String conteudo, String autor) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public MementoDocumento salvar() {
        System.out.println("Salvando versão do documento...");
        return new MementoDocumento(titulo, conteudo, autor);
    }

    public void restaurar(MementoDocumento memento) {
        if (memento != null) {
            this.titulo = memento.getTitulo();
            this.conteudo = memento.getConteudo();
            this.autor = memento.getAutor();
            System.out.println("Estado do documento restaurado.");
        }
    }

    public void exibir() {
        System.out.println("--------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("--------------------------");
    }
}
