package LivroAutor;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private Integer idade;
    private List<Livro> livros;

    public Autor(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.livros = new ArrayList<>();
    }

    public List<Livro> escreveLivro(Livro livro){
        this.livros.add(livro);
        return livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", livros=" + livros +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
