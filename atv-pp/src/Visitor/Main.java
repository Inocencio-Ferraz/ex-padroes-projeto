package Visitor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SetorElement> setores = new ArrayList<>();
        setores.add(new Armazem(25, "Organizado"));
        setores.add(new Administrativo("Carlos Souza", true));
        setores.add(new Frota(12, 2));
        setores.add(new Producao(8, 5));

        VisitorInspeccionador seguranca = new InspecaoSegurancaVisitor();
        VisitorInspeccionador limpeza = new AvaliacaoLimpezaVisitor();

        System.out.println("--- INICIANDO INSPEÇÃO DE SEGURANÇA ---");
        for (SetorElement setor : setores) {
            setor.aceitar(seguranca);
        }

        System.out.println("\n--- INICIANDO AVALIAÇÃO DE LIMPEZA ---");
        for (SetorElement setor : setores) {
            setor.aceitar(limpeza);
        }
    }
}
