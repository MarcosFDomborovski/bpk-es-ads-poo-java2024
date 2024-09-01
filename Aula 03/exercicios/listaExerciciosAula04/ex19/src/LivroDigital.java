// 19 - Defina uma classe LivroDigital com atributos como titulo, autor, e tamanhoArquivo. Adicione métodos para abrir e fechar o livro.
public class LivroDigital {
    String titulo;
    String autor;
    double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int abrirLivro(int status) {
        if (status == 0) {
            System.out.println("Você abriu o livro " + titulo + " .");
            status = 1;
        } else {
            System.out.println("Livro já está aberto!");
        }
        return status;
    }

    public int fecharLivro(int status) {
        if (status == 0) {
            System.out.println("Você fechou o livro " + titulo + ".");
            status = 1;
        } else {
            System.out.println("Livro já está fechado!");
        }
        return status;
    }

}