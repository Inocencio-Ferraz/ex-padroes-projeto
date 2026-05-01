package ChainOfResponsability;

class PermissaoMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if (!req.getPermissao().equals("ADMIN")) {
            System.out.println("PERMISSÃO: Acesso negado");
            return false;
        }
        return proximo(req);
    }
}