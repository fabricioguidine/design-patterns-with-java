import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoVisitorTest {

    @Test
    void deveExibirPagamentoPix() {
        PagamentoPix pagamentoPix = new PagamentoPix("asdfghjkl", 900.0f);

        PagamentoVisitor visitor = new PagamentoVisitor();
        assertEquals("PagamentoPix{" +
                "chave Pix=asdfghjkl" +
                ", valor=900.0" +
                '}', visitor.exibir(pagamentoPix));
    }

    @Test
    void deveExibirPagamentoCartaoDeCredito() {
        PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito(1234567890, "10/10", 999, 500.0f);

        PagamentoVisitor visitor = new PagamentoVisitor();
        assertEquals("PagamentoCartaoCredito{" +
                "numero cartao=1234567890" +
                ", validade='10/10'" +
                ", codigo seguranca='999'" +
                ", valor=500.0" +
                '}', visitor.exibir(pagamentoCartaoCredito));
    }

    @Test
    void deveExibirPagamentoBoleto() {
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto("123456", 500.0f);

        PagamentoVisitor visitor = new PagamentoVisitor();
        assertEquals("PagamentoBoleto{" +
                "codigoBarras=123456" +
                ", valor=500.0" +
                '}', visitor.exibir(pagamentoBoleto));
    }
}
