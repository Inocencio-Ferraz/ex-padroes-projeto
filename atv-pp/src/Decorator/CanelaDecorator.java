package Decorator;

public class CanelaDecorator implements Bebida{
    private Bebida bebida;

    public CanelaDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao(){
        return bebida.getDescricao() + "Com Canela ";
    }

    @Override
    public double getPreco(){
        return bebida.getPreco() + 1.50;
    }
}