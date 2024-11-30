import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Endereco enderecoEntrega;
    private Double total = 0.0;

    public Pedido(Cliente cliente, Endereco enderecoEntrega) {
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList();
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
        this.total = this.total + item.getProduto().getPreco() * (double)item.getQuantidade();
    }

    public void removerItem(ItemPedido item) {
        this.itens.remove(item);
    }

    public Double mostrarTotal() {
        return this.total;
    }

    public void adicionaEndereco(Endereco endereco) {
        this.enderecoEntrega = endereco;
    }

    public String toString() {
        String var10000 = this.cliente.getNome();
        String resultado = "===== Detalhes do Pedido =====\nCliente: " + var10000 + "\nCPF: " + this.cliente.getCpf() + "\nEndereço de Entrega: " + this.enderecoEntrega.getRua() + ", " + this.enderecoEntrega.getNumero() + " - " + this.enderecoEntrega.getCidade() + "\nItens do Pedido:\n";

        ItemPedido item;
        for(Iterator var2 = this.itens.iterator(); var2.hasNext(); resultado = resultado + " - Produto: " + item.getProduto().getNome() + ", Quantidade: " + item.getQuantidade() + ", Preço Unitário: R$" + item.getProduto().getPreco() + "\n") {
            item = (ItemPedido)var2.next();
        }

        resultado = resultado + "Total: R$" + this.total + "\n";
        return resultado;
    }
}
