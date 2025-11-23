import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoSaldoTest {
    @Test
    void deveExecutarPagamentoSaldo() {
        IServico servico = ServicoFactory.obterServico("Saldo");
        assertEquals("Pagamento com saldo em conta.", servico.executar());
    }
    @Test
    void deveCancelarPagamentoSaldo() {
        IServico servico = ServicoFactory.obterServico("Saldo");
        assertEquals("Pagamento cancelado.", servico.cancelar());
    }
}