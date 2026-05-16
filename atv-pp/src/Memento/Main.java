package Memento;

public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento("Trabalho de Padrões", "Conteúdo inicial do arquivo.", "Miquéias");
        HistoricoDocumento historico = new HistoricoDocumento();

        System.out.println("ESTADO INICIAL:");
        doc.exibir();

        historico.adicionar(doc.salvar());

        doc.setTitulo("Trabalho de Padrões - v2");
        doc.setConteudo("Conteúdo alterado pela primeira vez.");

        historico.adicionar(doc.salvar());

        doc.setConteudo("Nova alteração realizada sem salvar ainda.");

        System.out.println("\nESTADO ATUAL (ANTES DE RESTAURAR):");
        doc.exibir();

        doc.restaurar(historico.desfazer());
        System.out.println("\nESTADO APÓS PRIMEIRA RESTAURAÇÃO:");
        doc.exibir();

        doc.restaurar(historico.desfazer());
        System.out.println("\nESTADO APÓS SEGUNDA RESTAURAÇÃO (VERSÃO ANTIGA):");
        doc.exibir();
    }
}
