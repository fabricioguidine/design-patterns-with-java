import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ServicoCartaoTest {
    @Test
    void deveExecutarPagamentoCartao() {
        IServico servico = ServicoFactory.obterServico("Cartao");
        assertEquals("Pagamento por Cartão de Crédito.", servico.executar());
    }
    @Test
    void deveCancelarPagamentoCartao() {
        IServico servico = ServicoFactory.obterServico("Cartao");
        assertEquals("Pagamento cancelado.", servico.cancelar());
    }
}
