public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    int paginaAtual = 0;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void abrirLivro() {
        System.out.println("O livro \"" + titulo + "\" foi aberto.");
        return;
    }

    public void lerPagina() {
        if (paginaAtual < numeroDePaginas) {
            paginaAtual++;
            System.out.println("Lendo a página " + paginaAtual + " de " + numeroDePaginas + ".");
        } else {
            System.out.println("Você já leu todas as páginas.");
        }
    }
}