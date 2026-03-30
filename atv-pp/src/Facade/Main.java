package Facade;

import Facade.model.Cliente;

public class Main {
    public static void main(String[] args) {
    ViagemFacade viajar = new ViagemFacade();

    Cliente v1 = new Cliente("João", "joao@hotmail.com");
    viajar.reservasViagem(v1,"Caribe");
    System.out.println();
    Cliente v2 = new Cliente("Maria", "Maria@hotmail.com");
    viajar.reservasViagem(v2,"Ilhas galapagos");
    }
}