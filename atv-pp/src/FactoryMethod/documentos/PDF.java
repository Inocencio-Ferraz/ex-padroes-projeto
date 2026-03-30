package FactoryMethod.documentos;

public class PDF implements Documentos{
    @Override
    public void gerar(){
        System.out.print("Gerando pdf...");
    }
}
