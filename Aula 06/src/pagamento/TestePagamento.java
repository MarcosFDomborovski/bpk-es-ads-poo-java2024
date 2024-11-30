package pagamento;

import java.util.ArrayList;
import java.util.List;

public class TestePagamento {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoCredito());
        pagamentos.add(new PagamentoDebito());
    }
}
