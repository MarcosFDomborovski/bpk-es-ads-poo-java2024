// 14 - Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Jogo jogo = new Jogo("Red Dead Redemption 2", "Aventura/Ação", 119.99);
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogo: " + jogo.nome + "\nGênero: " + jogo.genero + "\nPreço: R$" + jogo.preco);
        System.out.println("");
        int statusInicio = 0;
        int statusPause = 0;
        while (true) {
            System.out.println("O que você deseja fazer ?\n1 - Iniciar o jogo\n2 - Pausar/Despausar o jogo\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    statusInicio = jogo.iniciarJogo(statusInicio);
                    break;
                case 2:
                    if(statusInicio == 0){
                        System.out.println("Você precisa iniciar o jogo primeiro!");
                        break;
                    }
                    statusPause = jogo.pausarJogo(statusPause);
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
