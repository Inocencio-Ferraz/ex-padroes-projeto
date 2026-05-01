package ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Middleware auth = new AuthMiddleware();
        Middleware permissao = new PermissaoMiddleware();
        Middleware validacao = new ValidacaoMiddleware();
        Middleware log = new LogMiddleware();
        Middleware controller = new ControllerMiddleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        System.out.println("CENÁRIO 1");
        Requisicao req1 = new Requisicao("admin", "valido", "ADMIN", true);
        auth.processar(req1);

        System.out.println();

        System.out.println("CENÁRIO 2");
        Requisicao req2 = new Requisicao("admin", "invalido", "ADMIN", true);
        auth.processar(req2);

        System.out.println();

        System.out.println("CENÁRIO 3");
        Requisicao req3 = new Requisicao("usuario", "valido", "USER", true);
        auth.processar(req3);

        System.out.println();

        System.out.println("CENÁRIO 4");
        Requisicao req4 = new Requisicao("admin", "valido", "ADMIN", false);
        auth.processar(req4);
    }
}
