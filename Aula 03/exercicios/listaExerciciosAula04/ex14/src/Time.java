// 13 - Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores. Adicione métodos para adicionar e remover jogadores.
public class Time {
    String nome;
    String tecnico;
    int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador(int qtdJogadores) {
        if (numeroDeJogadores + qtdJogadores > 12) {
            System.out.println("\nVocê não pode adicionar mais jogadores, o time possui um máximo de 12 jogadores.");
            System.out.println("");
        } else {
            numeroDeJogadores += qtdJogadores;
            System.out.println("\nVocê adicionou " + qtdJogadores + " jogadores no time " + nome);
            System.out.println("");
        }
    }

    public void removerJogador(int qtdJogadores) {
        if (qtdJogadores > numeroDeJogadores) {
            numeroDeJogadores = 0;
            System.out.println("\nVocê removeu todos os jogadores do time " + nome);
            System.out.println("");
        } else {
            numeroDeJogadores -= qtdJogadores;
            System.out.println("\nVocê removeu " + qtdJogadores + " jogadores do time " + nome);
            System.out.println("");
        }
    }
}