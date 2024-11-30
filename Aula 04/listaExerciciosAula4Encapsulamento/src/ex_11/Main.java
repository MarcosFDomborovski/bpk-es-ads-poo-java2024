package ex_11;

public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Toledo", 150000, "SP");
        cidade.aumentarPopulacao(1000);
        cidade.diminuirPopulacao(500);
        System.out.println("A cidade de " + cidade.getNome() + " tem " + cidade.getPopulacao() + " habitantes.");
    }
}
