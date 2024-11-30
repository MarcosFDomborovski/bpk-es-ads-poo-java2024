package ex_14;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        setNome(nome);
        setTecnico(tecnico);
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo.");
        }
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        if (tecnico == null) {
            throw new IllegalArgumentException("Técnico não pode ser nulo.");
        }
        this.tecnico = tecnico;
    }

    public void contratarJogador() {
        System.out.println("Jogador contratado.");
        numeroDeJogadores += 1;
    }

    public void demitirJogador() {
        System.out.println("Jogador demitido.");
        numeroDeJogadores -= 1;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }
}
