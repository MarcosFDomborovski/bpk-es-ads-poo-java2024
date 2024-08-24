// 14 - Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.
public class Jogo {
    String nome;
    String genero;
    double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public int iniciarJogo(int status) {
        if (status == 0) {
            System.out.println("\nVocê iniciou o jogo " + nome);
            status = 1;
        } else {
            System.out.println("\nVocê já está jogando!");
        }
        return status;
    }

    public int pausarJogo(int status) {
        if (status == 0) {
            System.out.println("Você pausou o jogo " + nome);
            status = 1;
        } else {
            System.out.println("Você despausou o jogo " + nome);
            status = 0;
        }
        return status;
    }
}