package Observer;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Miquéias", "miqueias@email.com");
        Pedido pedido = new Pedido("PED-001", "CRIADO", cliente);

        pedido.adicionarObserver(new EmailService());
        pedido.adicionarObserver(new LogService());
        pedido.adicionarObserver(new DashboardService());
        pedido.adicionarObserver(new EstoqueService());
        pedido.adicionarObserver(new FaturamentoService());

        pedido.atualizarStatus("PAGO");
        System.out.println();
        pedido.atualizarStatus("EM_SEPARACAO");
        System.out.println();
        pedido.atualizarStatus("ENVIADO");
        System.out.println();
        pedido.atualizarStatus("CANCELADO");

    }
}
