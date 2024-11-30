package ex_19;

public class Main {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("O Senhor dos Anéis", "J. R. R. Tolkien", 10.0);
        livro.abrirLivro();
        livro.fecharLivro();
    }
}
