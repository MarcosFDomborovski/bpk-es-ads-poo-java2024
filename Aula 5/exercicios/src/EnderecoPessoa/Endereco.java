package EnderecoPessoa;

public class Endereco {
    private String logradouro;
    private String cep;
    private String cidade;

    public Endereco(String logradouro, String cep, String cidade) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "EnderecoPessoa.Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
