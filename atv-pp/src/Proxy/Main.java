package Proxy;

public class Main {
    public static void main(String[] args){
    Conteudo conteudo = new FilmePremiumProxy();

    conteudo.assistir(new Usuario("Carlos","Premium"));
    conteudo.assistir(new Usuario("Ana", "Basico"));
    conteudo.assistir(new Usuario("Mariana", "Premium"));
    conteudo.assistir(new Usuario("Pedro", "Basico"));

    try {
        conteudo.assistir(null);
    } catch (IllegalArgumentException e) {
        System.out.println("Erro esperado: Usuário inválido " );
    }
        }
            }

