package ex_01;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(240, "Senhor dos Anéis", "J.R.R. Tolkien");

        livro.abrirLivro();
        livro.ler();
    }
}
