// 5 - Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Cachorro dog = new Cachorro("Rato", "Chihuahua", 3);
        Scanner sc = new Scanner(System.in);
        int statusLatindo = 0;
        int statusCorrendo = 0;
        while (true) {
            System.out.println("\nNome: " + dog.nome + "\nRaça: " + dog.raca + "\nIdade: " + dog.idade + "\n");
            System.out.println("O que deseja fazer ?\n1 - Mandar o cachorro latir\n2 - Mandar o cachorro correr\n3 - Sair");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    statusLatindo = dog.latir(statusLatindo);
                    break;
                case 2:
                    statusCorrendo = dog.correr(statusCorrendo);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Insira uma opção válida!");
            }
        }
    }
}
