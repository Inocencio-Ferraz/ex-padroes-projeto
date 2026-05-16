package Mediator;

public class Main {
    public static void main(String[] args) {
        CentralAtendimentoClinica central = new CentralAtendimentoClinica();

        Recepcao recepcao = new Recepcao(central);
        Medico medico = new Medico(central);
        Laboratorio laboratorio = new Laboratorio(central);

        central.registrarSetor(recepcao);
        central.registrarSetor(medico);
        central.registrarSetor(laboratorio);

        recepcao.iniciarAtendimento("Miquéias");
        System.out.println();

        medico.solicitarExame("Hemograma");
        System.out.println();

        laboratorio.informarResultado("Normal");
        System.out.println();

        recepcao.finalizarAtendimento("Miquéias");
    }
}
