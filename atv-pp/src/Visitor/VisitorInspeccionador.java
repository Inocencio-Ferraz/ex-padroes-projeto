package Visitor;

public interface VisitorInspeccionador {
    void visitar(Armazem armazem);
    void visitar(Administrativo administrativo);
    void visitar(Frota frota);
    void visitar(Producao producao);
}
