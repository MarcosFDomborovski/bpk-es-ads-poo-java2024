public class Endereco {
    private String cidade;
    private String rua;
    private Integer numero;
    private Cliente cliente;

    public Endereco(String cidade, String rua, Integer numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
