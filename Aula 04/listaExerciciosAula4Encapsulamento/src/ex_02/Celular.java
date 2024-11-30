package ex_02;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        setMarca(marca);
        setModelo(modelo);
        setCapacidadeBateria(capacidadeBateria);
    }

    // Getters e Setters com validação
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser nula ou vazia.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser nulo ou vazio.");
        }
        this.modelo = modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        if (capacidadeBateria <= 0) {
            throw new IllegalArgumentException("A capacidade da bateria deve ser maior que zero.");
        }
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligar() {
        System.out.println("O celular " + getMarca() + " " + getModelo() + " foi ligado.");
    }

    public void desligar() {
        System.out.println("O celular " + getMarca() + " " + getModelo() + " foi desligado.");
    }
}
