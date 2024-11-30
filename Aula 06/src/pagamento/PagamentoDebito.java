package pagamento;

public class PagamentoDebito implements Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("Pagando com debito");
    }
}
