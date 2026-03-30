package Facade.subsistemas;
import Facade.model.Cliente;
import Facade.model.Reserva;

public class NotificacaoService {
    public void enviarConfirmacao(Cliente cliente, Reserva reserva){
        System.out.printf("Confirmação enviada para %s com código de %s\n", cliente.getEmail(), reserva.getCodigo());
    }
}
