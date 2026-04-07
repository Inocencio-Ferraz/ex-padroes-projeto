package Bridge;

public class Main {
    public static void main(String[] args) {
        ItemRelatorio p1 = new ItemRelatorio("Produto A", 50);
        ItemRelatorio p2 = new ItemRelatorio("Produto B", 200);
        ItemRelatorio p3 = new ItemRelatorio("Produto C", 150);

        Relatorio rf1 = new RelatorioFinanceiro(new ExportadorPDF());
        rf1.adicionarItem(p1);
        rf1.adicionarItem(p2);
        rf1.adicionarItem(p3);
        rf1.gerar(false);

        Relatorio rf2 = new RelatorioFinanceiro(new ExportadorExcel());
        rf2.adicionarItem(p1);
        rf2.adicionarItem(p2);
        rf2.adicionarItem(p3);
        rf2.gerar(true);

        Relatorio rv1 = new RelatorioVendas(new ExportadorPDF());
        rv1.adicionarItem(p1);
        rv1.adicionarItem(p2);
        rv1.adicionarItem(p3);
        rv1.gerar(true);

        Relatorio rv2 = new RelatorioVendas(new ExportadorExcel());
        rv2.adicionarItem(p1);
        rv2.adicionarItem(p2);
        rv2.adicionarItem(p3);
        rv2.gerar(false);
    }
}

//7. Classe Main — testes obrigatórios
//
//Dados obrigatórios
//Crie os seguintes itens:
//        "Produto A" → 50
//        "Produto B" → 200
//        "Produto C" → 150
//
//Cenários obrigatórios
//
//Cenário 1
//Relatório Financeiro — PDF — Simples
//Cenário 2
//Relatório Financeiro — Excel — Detalhado
//Cenário 3
//Relatório de Vendas — PDF — Detalhado
//Cenário 4
//Relatório de Vendas — Excel — Simples
