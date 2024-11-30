import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<ContaCorrente> contas = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ContaCorrente> getContas() {
        return contas;
    }

    public void setContas(List<ContaCorrente> contas) {
        this.contas = contas;
    }

    public void adicionarConta(ContaCorrente conta) {
        contas.add(conta);
    }


}