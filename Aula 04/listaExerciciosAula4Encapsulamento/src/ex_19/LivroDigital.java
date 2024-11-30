package ex_19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        setTitulo(titulo);
        setAutor(autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser nulo ou vazio");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser nulo ou vazio");
        }
        this.autor = autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void abrirLivro() {
        System.out.println("Livro aberto.");
    }

    public void fecharLivro() {
        System.out.println("Livro fechado.");
    }
}
