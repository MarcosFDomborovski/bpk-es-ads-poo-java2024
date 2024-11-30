package pagamento;

public class PagamentoCredito implements Pagamento{


    @Override
    public void realizarPagamento() {
        System.out.println("pagando com credito");
    }
}
