package FactoryMethod.fabricas;

import FactoryMethod.documentos.Documentos;
import FactoryMethod.documentos.PDF;

public class FabricaPDF extends FabricaDocumentos {
    @Override
    public Documentos criarDocumentos(){
        return new PDF();
    }
}
