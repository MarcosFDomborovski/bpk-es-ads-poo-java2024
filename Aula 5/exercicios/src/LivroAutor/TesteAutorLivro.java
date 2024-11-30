package LivroAutor;

public class TesteAutorLivro {
    public static void main(String[] args) {
        Autor autor = new Autor("Giovani", 19);
        autor.escreveLivro(new Livro("Java para leigos", 100, autor));
        System.out.println(autor);
    }
}
