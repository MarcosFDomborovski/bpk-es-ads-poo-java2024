// 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura. Adicione um método que imprime uma apresentação da pessoa.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Marcos", 18, 178);
        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Iniciar apresentação\n2 - Sair");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    pessoa.apresentacao();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!\n");
            }
        }

    }
}
