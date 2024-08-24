public class Cozinha {
     String tipo;
     int quantidadePessoas;
     String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public int cozinhar(int statusCozinha) {
        if (statusCozinha == 0) {
            System.out.println("\nVocê está e sua equipe estão cozinhando para " + quantidadePessoas + " pessoas.");
            statusCozinha = 1;
        } else if (statusCozinha == 1) {
            System.out.println("\nVocês ainda estão cozinhando, mas ainda não terminaram, ACELERA AÍ!!!.");
            statusCozinha = 2;
        } else {
            System.out.println("\nVocê e sua equipe terminaram de cozinhar. Já era hora!");
            statusCozinha = 0;
        }
        return statusCozinha;
    }

    public int limpar(int status) {
        if (status == 0) {
            System.out.println("\nA cozinha está sendo limpa.");
            status = 1;
        } else if (status == 1) {
            System.out.println("\nA cozinha está quase limpa!");
            status = 2;
        } else {
            System.out.println("\nA cozinha está limpa.");
            status = 3;
        }
        return status;
    }
}
