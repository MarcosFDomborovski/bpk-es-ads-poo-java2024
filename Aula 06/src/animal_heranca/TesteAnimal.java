package animal_heranca;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorrao = new Cachorro("Gustavo", 18, "Grande");

        System.out.println(cachorrao);

        Gato gatao = new Gato("Joao", 20, "Preto");
        System.out.println(gatao);
    }
}
