// 12 - Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Filme melhorDaTrilogia = new Filme("O senhor dos anéis\nO retorno do rei", "J.K. Rowling", 1920000);
        int status1 = 0; // filme ta parado
        int status2 = 0; // filme ta rodando
        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Iniciar o filme\n2 - Parar o filme\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    status1 = melhorDaTrilogia.iniciarFilme(status1);
                    break;
                case 2:
                    if (status1 == 0) {
                        System.out.println("O filme precisa iniciar primeiro para poder parar!");
                    } else {
                        status2 = melhorDaTrilogia.pararFilme(status2);
                        status1 = melhorDaTrilogia.pararFilme2(status1);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
