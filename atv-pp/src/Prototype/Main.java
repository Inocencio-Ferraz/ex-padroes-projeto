package Prototype;
public class Main {
    public static void main(String[] args) {
        Prova template = new Prova("Prova SQL - Template", "TEMPLATE", "2026-03-10", "BASE");
        template.adicionarQuestao(new Questao("Q1", "O que é um JOIN em SQL?", 3));
        template.adicionarQuestao(new Questao("Q2", "Explique a utilidade da Primary Key.", 3));
        template.adicionarQuestao(new Questao("Q3", "Escreva um comando SELECT simples.", 4));

        System.out.println("--- TEMPLATE ---");
        template.printResumo();

        Prova prova1 = template.copiar();
        prova1.setTurma("2o INFO A");
        prova1.setData("2026-03-20");
        prova1.setVersao("V1");
        prova1.substituirQuestao("Q2", new Questao("Q2", "Diferencie INNER JOIN de LEFT JOIN.", 3));

        System.out.println("\n--- PROVA TURMA A ---");
        prova1.printResumo();

        Prova prova2 = template.copiar();
        prova2.setTurma("2o INFO B");
        prova2.setData("2026-03-21");
        prova2.setVersao("V1");
        prova2.substituirQuestao("Q3", new Questao("Q3", "Escreva um comando SELECT simples.", 5));

        System.out.println("\n--- PROVA TURMA B ---");
        prova2.printResumo();

        System.out.println("\n\n>>> INICIANDO TESTE DE COPIA PROFUNDA <<<");
        prova1.substituirQuestao("Q1", new Questao("Q1", "ENUNCIADO ALTERADO NA TURMA A", 10));

        System.out.println("\nVERIFICAÇÃO TEMPLATE:");
        template.printResumo();

        System.out.println("\nVERIFICAÇÃO PROVA 1:");
        prova1.printResumo();
    }
}