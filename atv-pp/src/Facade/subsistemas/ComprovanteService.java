package Facade.subsistemas;
import Facade.model.Reserva;

public class ComprovanteService {

        public Reserva gerarComprovante(String destino) {
            System.out.print("Comprovante gerado \n");
            return new Reserva(destino, "Reserva 98765");
        }
}
