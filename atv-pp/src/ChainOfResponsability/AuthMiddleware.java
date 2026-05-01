package ChainOfResponsability;

class AuthMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if (!req.getToken().equals("valido")) {
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
        }
        return proximo(req);
    }
}