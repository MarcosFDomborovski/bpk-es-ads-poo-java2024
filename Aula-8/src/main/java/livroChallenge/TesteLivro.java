package livroChallenge;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        livro.adicionarPagina("No começo havia apenas escuridão...");
        livro.adicionarPagina("E então veio a luz...");
        livro.adicionarPagina("A jornada começou...");

        System.out.println(livro);
        livro.mostrarPaginas();
    }
}
