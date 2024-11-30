package ex_20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        setMarca(marca);
        setModelo(modelo);
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser nula ou vazia");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser nulo ou vazio");
        }
        this.modelo = modelo;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Bicicleta pedalando.");
    }

    public void frear() {
        System.out.println("Bicicleta freando.");
    }
}
