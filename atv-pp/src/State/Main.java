package State;

public class Main {
    public static void main(String[] args) {

        Chamado chamado1 = new Chamado(
                1,
                "Problema no sistema",
                "Carlos"
        );

        chamado1.resolver();

        chamado1.iniciarAtendimento();

        chamado1.aguardarCliente();

        chamado1.resolver();

        chamado1.responderCliente();

        chamado1.resolver();

        chamado1.cancelar();

        System.out.println();

        Chamado chamado2 = new Chamado(
                2,
                "Erro na impressora",
                "Marina"
        );

        chamado2.cancelar();

        chamado2.iniciarAtendimento();
    }
}