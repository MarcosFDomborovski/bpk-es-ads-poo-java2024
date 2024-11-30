package ex_15;

public class Jogo {
    private String jogo;
    private String genero;
    private double preco;

    public Jogo(String jogo, String genero, double preco) {
        setJogo(jogo);
        setGenero(genero);
        this.preco = preco;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        if (jogo == null) {
            throw new IllegalArgumentException("Nome do jogo não pode ser nulo.");
        }
        this.jogo = jogo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null) {
            throw new IllegalArgumentException("Gênero não pode ser nulo.");
        }
        this.genero = genero;
    }

    public void iniciarJogo() {
        System.out.println("Jogo " + jogo + " iniciado.");
    }

    public void pausarJogo() {
        System.out.println("Jogo " + jogo + " pausado.");
    }
}
