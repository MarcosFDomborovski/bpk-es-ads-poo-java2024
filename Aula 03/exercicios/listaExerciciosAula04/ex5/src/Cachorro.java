// 5 - Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.
public class Cachorro {
    String nome;
    String raca;
    int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public int latir(int status) {
        if (status == 0) {
            System.out.println("O cachorro está latindo!");
            status = 1;
        } else {
            System.out.println("O cachorro parou de latir!");
            status = 0;
        }
        return status;
    }

    public int correr(int status) {
        if (status == 0) {
            System.out.println("O cachorro começou a correr!");
            status = 1;
        } else {
            System.out.println("O cachorro está parado!");
            status = 0;
        }
        return status;
    }

}
