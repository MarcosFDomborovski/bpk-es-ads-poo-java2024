// 12 - Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.
public class Filme {
    String titulo;
    String diretor;
    int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public int iniciarFilme(int statusInicio) {
        System.out.println(
                "Iniciando filme: " + titulo + "\nDiretor: " + diretor + "\nDuracao: " + duracao + " segundos.\n");
        if (statusInicio == 0) {
            System.out.println("O filme iniciou!");
            statusInicio = 1;
        } else
            System.out.println("O filme já iniciou!");

        return statusInicio;
    }

    public int pararFilme(int statusParar) {
        if (statusParar == 0) {
            System.out.println("O filme parou!");
            statusParar = 1;
        } else {
            System.out.println("O filme já parou!");
        }

        return statusParar;
    }

    public int pararFilme2(int statusInicio) {
        if (statusInicio == 1) {
            statusInicio = 0;
        } else {
        }
        return statusInicio;
    }

}
