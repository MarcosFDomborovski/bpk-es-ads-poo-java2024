// 2 - Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria. Adicione métodos para ligar e desligar o celular.
public class Celular {
    String marca;
    String modelo;
    int capacidadeBateria;
    int status = 0;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public int ligar(int status) {
        if (status == 0) {
            System.out.println("\nVocê ligou o celular.\n");
            status = 1;
        } else {
            System.out.println("\nO celular já está ligado!\n");
        }
        return status;
    }

    public int desligar(int status) {
        if (status != 0) {
            System.out.println("\nVocê desligou o celular\n");
            status = 0;
        } else {
            System.out.println("\nO celular já está desligado!\n");
        }
        return status;
    }

}