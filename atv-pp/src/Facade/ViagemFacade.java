package Facade;
import Facade.model.Cliente;
import Facade.model.Reserva;
import Facade.subsistemas.*;

public class ViagemFacade {
    private VooService vooService = new VooService();
    private HotelService hotelService = new HotelService();
    private TransportService transportService = new TransportService();
    private ComprovanteService comprovanteService = new ComprovanteService();
    private NotificacaoService notificacaoService = new NotificacaoService();

    public Reserva reservasViagem(Cliente cliente, String destino){
        vooService.reservarVoo(destino);
        hotelService.reservarHotel(destino);
        transportService.reservarTransporte(destino);
        Reserva reserva = comprovanteService.gerarComprovante(destino);
        notificacaoService.enviarConfirmacao(cliente, reserva);
        return reserva;
    }
}
