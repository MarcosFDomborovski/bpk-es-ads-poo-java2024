// 9 - Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque. Adicione métodos para aumentar e diminuir o estoque.
public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        String precoFormatado = String.format("%.2f", preco * quantidade);
        quantidadeEstoque += quantidade;
        String precoTotalFormatado = String.format("%.2f", quantidadeEstoque * preco);
        System.out.println("Você aumentou a quantidade do produto " + nome + " em estoque em " + quantidade + " unidades, no valor de " + precoFormatado);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque + "\nValor em estoque: " + precoTotalFormatado);
    }

    public void diminuirEstoque(int quantidade) {
        String precoFormatado;
        String precoTotalFormatado;
        if (quantidade > quantidadeEstoque) {
            quantidadeEstoque = 0;
            precoFormatado = String.format("%.2f", preco * quantidade);
            precoTotalFormatado = "0.00";
            System.out.println("O estoque está vazio!");
        } else {
            quantidadeEstoque -= quantidade;
            precoFormatado = String.format("%.2f", preco * quantidade);
            precoTotalFormatado = String.format("%.2f", quantidadeEstoque * preco);
        }
        System.out.println("Você diminuiu a quantidade do produto " + nome + " em estoque em " + quantidade + " unidades, no valor de R$ " + precoFormatado);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque + "\nValor em estoque: R$ " + precoTotalFormatado);
    }
}