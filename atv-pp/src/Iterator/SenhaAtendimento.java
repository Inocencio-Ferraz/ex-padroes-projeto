package Iterator;

public class SenhaAtendimento {
    private String identificacao;
    private String nomePessoa;
    private String tipoAtendimento;

    public SenhaAtendimento(String identificacao, String nomePessoa, String tipoAtendimento) {
        this.identificacao = identificacao;
        this.nomePessoa = nomePessoa;
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    @Override
    public String toString() {
        return identificacao + " - " + nomePessoa + " - " + tipoAtendimento;
    }
}
