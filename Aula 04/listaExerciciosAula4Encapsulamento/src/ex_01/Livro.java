package ex_01;

public class Livro {
    private String titulo;
    private String autor;
    private int nrPaginas;

    public Livro(int nrPaginas, String titulo, String autor) {
        setNrPaginas(nrPaginas);
        setTitulo(titulo);
        setAutor(autor);
    }

    // Getters e Setters com validação
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("O autor não pode ser nulo ou vazio.");
        }
        this.autor = autor;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        if (nrPaginas <= 0) {
            throw new IllegalArgumentException("O número de páginas deve ser maior que zero.");
        }
        this.nrPaginas = nrPaginas;
    }

    public void abrirLivro() {
        System.out.println("O livro " + getTitulo() + " foi aberto");
    }

    public void ler() {
        System.out.println("Você está na página " + getNrPaginas());
    }
}
