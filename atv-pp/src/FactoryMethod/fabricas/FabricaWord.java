package FactoryMethod.fabricas;

import FactoryMethod.documentos.Documentos;
import FactoryMethod.documentos.Word;

public class FabricaWord extends FabricaDocumentos{
    @Override
    public Documentos criarDocumentos(){
        return new Word();
    }
}
