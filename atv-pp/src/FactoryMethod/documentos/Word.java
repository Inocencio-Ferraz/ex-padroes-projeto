package FactoryMethod.documentos;

public class Word implements Documentos{
    @Override
    public void gerar()
    {
        System.out.println("Gerando word...");
    }
}
