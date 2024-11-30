package EnderecoPessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Pessoa pai;
    private Pessoa mae;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<>();
    }

    public List<Endereco> incluirEndereco(Endereco endereco) {
        this.enderecos.add(endereco);

        return this.enderecos;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "EnderecoPessoa.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", enderecos=" + enderecos +
                '}';
    }
}
