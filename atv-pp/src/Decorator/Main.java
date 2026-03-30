package Decorator;

public class Main {
    public static void main(String[] args) {

        Bebida Cafe = new Cafe();
        Cafe = new LeiteExtraDecorator(Cafe);
        System.out.println(Cafe.getDescricao());
        System.out.println("Preço: R$ " + Cafe.getPreco());
        System.out.println();

        Bebida Capuccino = new Capuccino();
        Capuccino = new ChantilyDecorator(Capuccino);
        Capuccino = new CanelaDecorator(Capuccino);
        System.out.println(Capuccino.getDescricao());
        System.out.println("Preço: R$ " + Capuccino.getPreco());
        System.out.println();

        Bebida ChocolateQuente = new ChocolateQuente();
        ChocolateQuente = new LeiteExtraDecorator(ChocolateQuente);
        ChocolateQuente = new ChantilyDecorator(ChocolateQuente);
        ChocolateQuente = new CaldaChocolateDecorator(ChocolateQuente);
        System.out.println(ChocolateQuente.getDescricao());
        System.out.println("Preço: R$ " + ChocolateQuente.getPreco());
    }
}

