package Builder;
import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    protected String tipo, tamanho, pagamento, tipoPao, tipoMassa, entrega, enderecoEntrega, cupom, observacao;
    protected List<String> itens = new ArrayList<>();
    protected boolean bordaRecheada;
    protected Double trocoPara;

    public PedidoBuilder tipoHamburguer() { this.tipo = "HAMBURGUER"; return this; }
    public PedidoBuilder tipoPizza() { this.tipo = "PIZZA"; return this; }
    public PedidoBuilder tamanhoP() { this.tamanho = "P"; return this; }
    public PedidoBuilder tamanhoM() { this.tamanho = "M"; return this; }
    public PedidoBuilder tamanhoG() { this.tamanho = "G"; return this; }
    public PedidoBuilder pagarComPix() { this.pagamento = "PIX"; return this; }
    public PedidoBuilder pagarComCartao() { this.pagamento = "CARTAO"; return this; }
    public PedidoBuilder pagarComDinheiro() { this.pagamento = "DINHEIRO"; return this; }
    public PedidoBuilder comTrocoPara(double valor) { this.trocoPara = valor; return this; }
    public PedidoBuilder entregaDelivery(String endereco) { this.entrega = "DELIVERY"; this.enderecoEntrega = endereco; return this; }
    public PedidoBuilder entregaRetirada() { this.entrega = "RETIRADA"; return this; }
    public PedidoBuilder tipoPao(String pao) { this.tipoPao = pao; return this; }
    public PedidoBuilder tipoMassa(String massa) { this.tipoMassa = massa; return this; }
    public PedidoBuilder comBordaRecheada() { this.bordaRecheada = true; return this; }
    public PedidoBuilder semBordaRecheada() { this.bordaRecheada = false; return this; }
    public PedidoBuilder addItem(String item) { this.itens.add(item); return this; }
    public PedidoBuilder comCupom(String cupom) { this.cupom = cupom; return this; }
    public PedidoBuilder comObservacao(String obs) { this.observacao = obs; return this; }

    public Pedido build() {
        validarGeral();
        if ("HAMBURGUER".equals(tipo)) {
            validarHamburguer();
            return new Hamburguer(this);
        } else {
            validarPizza();
            return new Pizza(this);
        }
    }

    private void validarGeral() {
        if (tipo == null) throw new IllegalStateException("Tipo obrigatório.");
        if (tamanho == null) throw new IllegalStateException("Tamanho obrigatório.");
        if (pagamento == null) throw new IllegalStateException("Pagamento obrigatório.");
        if (itens.isEmpty()) throw new IllegalStateException("Mínimo 1 item.");
        if ("DELIVERY".equals(entrega) && (enderecoEntrega == null || enderecoEntrega.isBlank()))
            throw new IllegalStateException("Endereço obrigatório para delivery.");
        if (!"DINHEIRO".equals(pagamento) && trocoPara != null)
            throw new IllegalStateException("Troco apenas para dinheiro.");
    }

    private void validarHamburguer() {
        if (tipoPao == null) throw new IllegalStateException("Pão obrigatório.");
        if (bordaRecheada) throw new IllegalStateException("Hambúrguer não tem borda.");
    }

    private void validarPizza() {
        if (tipoMassa == null) throw new IllegalStateException("Massa obrigatória.");
    }
}
