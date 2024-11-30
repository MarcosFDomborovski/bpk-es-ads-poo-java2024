package ex_10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        setTipo(tipo);
        setPlaca(placa);
        setCor(cor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null) {
            this.placa = placa;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null) {
            this.cor = cor;
        }
    }

    public void abastecer() {
        System.out.println("Veículo abastecido.");
    }

    public void lavarVeiculo() {
        System.out.println("Veículo lavado.");
    }
}
