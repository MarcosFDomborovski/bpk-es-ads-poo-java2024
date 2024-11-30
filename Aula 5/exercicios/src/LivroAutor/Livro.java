package LivroAutor;

public class Livro {
    private String nome;
    private Integer paginas;
    private Autor autor;


    public Livro(String nome, Integer paginas, Autor autor) {
        this.nome = nome;
        this.paginas = paginas;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                ", autor=" + autor.getNome() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public Autor getAutor() {
        return autor;
    }

}
