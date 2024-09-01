// 1 - Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas. Adicione métodos para abrir o livro e ler uma página.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("O Hobbit", "J.R.R. Tolkien", 310);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nNome do livro: " + meuLivro.titulo + "\nAutor: " + meuLivro.autor + "\nNúmero de páginas: " + meuLivro.numeroDePaginas + "\n");
            System.out.println("O que deseja fazer ?\n1 - Abrir o livro\n2 - Ler uma página");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    meuLivro.abrirLivro();
                    break;
                case 2:
                    meuLivro.lerPagina();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!\n");
                    break;
            }
        }
    }
}