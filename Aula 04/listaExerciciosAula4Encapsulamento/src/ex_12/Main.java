package ex_12;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("O Poderoso Chefão", "Francis Ford Coppola", 175.0);
        filme.iniciarFilme();
        filme.pausarFilme(30.0);
        filme.pausarFilme(47.5);
    }
}
