package ex_21;

public class Cozinha {
    private String tipo;
    private int quantPessoas;
    private String cor;

    public Cozinha(String tipo, int quantPessoas, String cor) {
        setTipo(tipo);
        this.quantPessoas = quantPessoas;
        setCor(cor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo não pode ser nulo ou vazio");
        }
        this.tipo = tipo;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("Cor não pode ser nula ou vazia");
        }
        this.cor = cor;
    }

    public void prepararComida() {
        System.out.println("Preparando comida na cozinha");
    }

    public void limparCozinha() {
        System.out.println("Limpando a cozinha");
    }
}
