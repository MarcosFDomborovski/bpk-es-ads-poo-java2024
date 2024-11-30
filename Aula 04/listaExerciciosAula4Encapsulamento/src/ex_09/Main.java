package ex_09;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Computador", 1000, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
        System.out.println("O produto " + produto.getNome() + " tem " + produto.getQuantidade() + " unidades em estoque.");
    }
}
