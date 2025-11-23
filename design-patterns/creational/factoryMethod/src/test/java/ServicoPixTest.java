import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ServicoPixTest {
    @Test
    void deveExecutarPagamentoPix() {
        IServico servico = ServicoFactory.obterServico("Pix");
        assertEquals("Pagamento por Pix.", servico.executar());
    }
    @Test
    void deveCancelarPagamentoPix() {
        IServico servico = ServicoFactory.obterServico("Pix");
        assertEquals("Pagamento cancelado.", servico.cancelar());
    }
}
