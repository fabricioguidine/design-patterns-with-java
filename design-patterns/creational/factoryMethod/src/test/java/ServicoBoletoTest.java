import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoBoletoTest {
    @Test
    void deveExecutarPagamentoBoleto() {
        IServico servico = ServicoFactory.obterServico("Boleto");
        assertEquals("Pagamento por Boleto Bancário.", servico.executar());
    }
    @Test
    void deveCancelarPagamentoBoleto() {
        IServico servico = ServicoFactory.obterServico("Boleto");
        assertEquals("Pagamento cancelado.", servico.cancelar());
    }
}
