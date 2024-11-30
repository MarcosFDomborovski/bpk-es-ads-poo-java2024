package ex_03;

public class Pessoa {
    private String nome;
    private int idade;
    private int altura;

    public Pessoa(String nome, int idade, int altura) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade deve ser maior que zero.");
        }
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public void apresentarPessoa() {
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nAltura: " + getAltura());
    }
}
