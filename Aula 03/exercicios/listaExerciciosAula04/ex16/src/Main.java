// 16 - Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja("Lojinha do marquinhos", "Jardim Gisela, Rua 13 de Maio 152, próximo ao barracão",
                "(45) 99941-6812");
        System.out.println(
                "Nome da loja: " + loja.nome + "\nEndereço: " + loja.endereco + "\nTelefone: " + loja.telefone);
        System.out.println("");

        int statusA = 0;
        int statusB = 0;

        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Abrir a loja\n2 - Fechar a loja\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    statusA = loja.abrirLoja(statusA);
                    statusB = 0;
                    break;
                case 2:
                    statusB = loja.fecharLoja(statusB);
                    statusA = 0;
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida!\n\n");
                    break;
            }
        }

    }
}
