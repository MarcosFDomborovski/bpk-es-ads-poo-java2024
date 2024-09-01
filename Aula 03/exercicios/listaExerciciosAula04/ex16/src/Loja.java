// 16 - Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.
public class Loja {
    String nome;
    String endereco;
    String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int abrirLoja(int status) {
        if (status == 0) {
            status = 1;
            System.out.println("Você abriu a loja!");
        } else {
            System.out.println("A loja já está aberta!");
        }
        return status;
    }

    public int fecharLoja(int status) {
        if (status == 0) {
            status = 1;
            System.out.println("Você fechou a loja!");
        } else {
            System.out.println("A loja já está fechada!");
        }
        return status;
    }
}