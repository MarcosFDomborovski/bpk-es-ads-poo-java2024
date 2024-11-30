package ex_05;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        setNome(nome);
        setRaca(raca);
        setIdade(idade);
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.trim().isEmpty()) {
            throw new IllegalArgumentException("A raça não pode ser nula ou vazia.");
        }
        this.raca = raca;
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

    public void latir() {
        System.out.println("Au au");
    }

    public void correr() {
        System.out.println("Correndo");
    }
}
