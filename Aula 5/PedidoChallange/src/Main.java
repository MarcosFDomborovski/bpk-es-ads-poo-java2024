public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Giovani", "123.456.789-00");
        Endereco endereco = new Endereco("Toledo", "Rua dos programadores", 33);
        cliente.addEndereco(endereco);
        Produto produto = new Produto("Notebook", 2000.0);
        Produto produto2 = new Produto("bolacha", 2.0);
        Pedido pedido = new Pedido(cliente, endereco);
        pedido.adicionarItem(new ItemPedido(produto, 1));
        pedido.adicionarItem(new ItemPedido(produto2, 10));
        System.out.println(pedido);
    }
}