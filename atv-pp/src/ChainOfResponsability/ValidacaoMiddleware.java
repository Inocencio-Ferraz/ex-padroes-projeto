package ChainOfResponsability;

class ValidacaoMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if (!req.isDadosValidos()) {
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }
        return proximo(req);
    }
}