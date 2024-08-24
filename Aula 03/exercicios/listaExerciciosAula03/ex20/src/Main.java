// 21 - Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor. Adicione métodos para cozinhar e limpar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Cozinha cozinha = new Cozinha("Moderna", 52, "Branca");
        Scanner sc = new Scanner(System.in);
        int statusLimpeza = 0;
        int statusCozinha = 0;

        while (true) {
            System.out.println("Tipo da cozinha: " + cozinha.tipo + "\nCor predominante: " + cozinha.cor + "\n");
            System.out.println("O que deseja fazer ?\n1 - Cozinhar\n2 - Limpar a cozinha\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    statusCozinha = cozinha.cozinhar(statusCozinha);
                    statusLimpeza = 0;
                    break;
                case 2:
                    statusLimpeza = cozinha.limpar(statusLimpeza);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
