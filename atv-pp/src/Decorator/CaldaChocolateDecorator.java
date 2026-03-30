package Decorator;

public class CaldaChocolateDecorator implements Bebida{
    private Bebida bebida;

    public CaldaChocolateDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao(){
        return bebida.getDescricao() + "Com Calda de Chocolate. ";

    }

    @Override
    public double getPreco(){
        return bebida.getPreco() + 2.50;
    }
}
