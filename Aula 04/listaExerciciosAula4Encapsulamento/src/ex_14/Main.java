package ex_14;

public class Main {
    public static void main(String[] args) {
        Time time = new Time("Santos", "Fabio Carille", 25);
        time.contratarJogador();
        time.demitirJogador();
        time.demitirJogador();
        System.out.println("O time " + time.getNome() + " tem " + time.getNumeroDeJogadores() + " jogadores.");
    }
}
