package ex_11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        setNome(nome);
        this.populacao = populacao;
        setEstado(estado);
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

    public int getPopulacao() {
        return populacao;
    }

    public void aumentarPopulacao(int populacao) {
        this.populacao += populacao;
    }

    public void diminuirPopulacao(int populacao) {
        this.populacao -= populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado não pode ser nulo.");
        }
        this.estado = estado;
    }
}
