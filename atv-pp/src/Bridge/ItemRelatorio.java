package Bridge;

public class ItemRelatorio {
    protected String descricao;
    protected double valor;

    public ItemRelatorio(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getValor(){
        return valor;
    }
}
