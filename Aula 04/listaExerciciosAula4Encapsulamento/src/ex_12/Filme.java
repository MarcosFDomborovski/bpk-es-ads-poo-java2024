package ex_12;

public class Filme {
    private String titulo;
    private String diretor;
    private double duracao;

    public Filme(String titulo, String diretor, double duracao) {
        setTitulo(titulo);
        setDiretor(diretor);
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null) {
            throw new IllegalArgumentException("Título não pode ser nulo.");
        }
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        if (diretor == null) {
            throw new IllegalArgumentException("Diretor não pode ser nulo.");
        }
        this.diretor = diretor;
    }

    public void iniciarFilme() {
        System.out.println("O filme " + titulo + " foi iniciado.");
    }

    public void pausarFilme(double minuto) {
        System.out.println("O filme " + titulo + " foi pausado no minuto: " + minuto);
    }
}
