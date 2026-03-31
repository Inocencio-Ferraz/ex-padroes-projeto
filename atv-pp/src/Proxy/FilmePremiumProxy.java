package Proxy;

public class FilmePremiumProxy implements Conteudo{

    private FilmePremium servicoReal;

    public FilmePremiumProxy(){
        this.servicoReal = new FilmePremium();
    }
    @Override
    public void assistir(Usuario usuario){
        if (usuario.getPlano().equalsIgnoreCase("Premium")){
            System.out.println("Acesso autorizado para " + usuario.getNome());
            servicoReal.assistir(usuario);
        }
        else if(usuario.getPlano().equalsIgnoreCase("Básico")){
            System.out.println("Acesso negado para " + usuario.getNome() + " Conteúdo disponível apenas para usuários premium.");
        }
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário inválido.");
        }
    }
}
