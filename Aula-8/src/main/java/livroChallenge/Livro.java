package livroChallenge;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;
    private int numeroPaginaAtual = 1;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo) {
        Pagina novaPagina = new Pagina(numeroPaginaAtual++, conteudo);
        paginas.add(novaPagina);
    }

    public void mostrarPaginas() {
        for (Pagina pagina : paginas) {
            System.out.println(pagina);
        }
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas.size();
    }
}
