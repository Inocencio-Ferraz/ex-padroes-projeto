package Bridge;
import java.util.List;

public class ExportadorPDF implements Exportador{

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO PDF ===" + "\nTítulo: " + titulo + "\nItens: ");
        for (ItemRelatorio item : itens) {
            System.out.println(item.getDescricao() + " | R$ " + item.getValor());
        }
        System.out.println("Total: R$ " + total);
    }
}
