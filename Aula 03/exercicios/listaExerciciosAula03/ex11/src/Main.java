// 11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cidade cidade = new Cidade("Toledo", 32512, "Paraná");
        int populacao = cidade.populacao;
        while (true) {
            System.out.println("O que deseja fazer ? (População atual " + populacao + ")\n1 - Aumentar população\n2 - Diminuir população\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Quantos habitantes deseja adicionar?");
                int habitantes = sc.nextInt();
                    populacao = cidade.aumentarPopulacao(habitantes);
                    break;
                case 2:
                    System.out.println("Quantos habitantes deseja remover?");
                    int habitantes2 = sc.nextInt();
                    populacao =cidade.diminuirPopulacao(habitantes2);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}