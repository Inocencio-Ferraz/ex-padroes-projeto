package Decorator;

public class ChantilyDecorator implements Bebida{

    private Bebida bebida;

    public ChantilyDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao(){
        return bebida.getDescricao() + "Com Chantily ";

    }

    @Override
    public double getPreco(){
        return bebida.getPreco() + 3.0;
    }
}
