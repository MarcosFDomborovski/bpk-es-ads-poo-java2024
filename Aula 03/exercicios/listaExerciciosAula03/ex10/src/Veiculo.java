// 10 - Crie uma classe Veiculo com atributos tipo, placa, e cor. Adicione métodos para abastecer e lavar o veículo.
public class Veiculo {
    String tipo;
    String placa;
    String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }
    public int abastecer(int status){
        if (status == 0) {
            System.out.println("O veículo do tipo " + tipo + " com a placa " + placa + " e cor " + cor + " está sendo abastecido.");
            status = 1;
        } else if (status == 1) {
            System.out.println("O veículo do tipo " + tipo + " com a placa " + placa + " e cor " + cor + " está quase abastecido!");
            status = 2;
        } else {
            System.out.println("O veículo do tipo " + tipo + " com a placa " + placa + " e cor " + cor + " foi abastecido!");
            status = 3;
        }
        return status;
    }
    public int lavar(int status){
        if(status == 0){
            System.out.println("O veículo do tipo " + tipo + " com a placa " + placa + " está sendo lavado.");
            status = 1;
        } else if (status == 1){
            System.out.println("O veículo do tipo " + tipo + " com a placa " + placa + " está quase limpo!");
            status = 2;
        } else {
            System.out.println("O veículo do tipo " + tipo + " com a placa " + placa + " foi limpo!");
            status = 3;
        }
        return status;
    }
}