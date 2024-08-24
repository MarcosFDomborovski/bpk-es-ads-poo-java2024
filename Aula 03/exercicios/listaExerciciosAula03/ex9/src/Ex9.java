// 9 - Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque. Adicione métodos para aumentar e diminuir o estoque.
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) throws Exception {
        Produto prod = new Produto("Batata", 5.82, 0);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Aumentar estoque\n2 - Diminuir estoque\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Quantas unidades deseja adicionar ao estoque?");
                    int qtd = sc.nextInt();
                    prod.aumentarEstoque(qtd);
                    break;
                case 2:
                    System.out.println("Quantas unidades deseja remover do estoque ?");
                    int qtdRemove = sc.nextInt();
                    prod.diminuirEstoque(qtdRemove);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}
