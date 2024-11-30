package ex_16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo.");
        }
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço não pode ser nulo.");
        }
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null) {
            throw new IllegalArgumentException("Telefone não pode ser nulo.");
        }
        this.telefone = telefone;
    }

    public void abrirLoja() {
        System.out.println("Loja aberta.");
    }

    public void fecharLoja() {
        System.out.println("Loja fechada.");
    }
}
