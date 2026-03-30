package Decorator;

public class LeiteExtraDecorator implements Bebida{

    private Bebida bebida;

    public LeiteExtraDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao(){
        return bebida.getDescricao() + "Com Leite Extra ";

    }

    @Override
    public double getPreco(){
        return bebida.getPreco() + 2.0;
    }

}
