package FactoryMethod.fabricas;

import FactoryMethod.documentos.Documentos;
import FactoryMethod.documentos.Planilha;

public class FabricaPlanilha extends FabricaDocumentos {
    @Override
    public Documentos criarDocumentos(){
        return new Planilha();
    }
}
