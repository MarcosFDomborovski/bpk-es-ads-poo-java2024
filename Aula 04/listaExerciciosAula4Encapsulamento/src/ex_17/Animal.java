package ex_17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        setEspecie(especie);
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie não pode ser nula ou vazia");
        }
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void alimentar() {
        System.out.println("Animal alimentado.");
    }

    public void dormir() {
        System.out.println("Animal dormindo.");
    }
}
