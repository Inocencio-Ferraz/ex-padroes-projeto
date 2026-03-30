package FactoryMethod.documentos;

public class Planilha implements Documentos {
    @Override
    public void gerar(){
        System.out.print("Gerando excell...");
    }
}
