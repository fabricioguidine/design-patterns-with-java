import org.example.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversaoRealDolarTest {

    @Test
    void deveRetornarValorConvertido() {
        ConversaoRealDolar conversaoRealDolar = new ConversaoRealDolar();
        conversaoRealDolar.setValor(4.90);
        conversaoRealDolar.setTaxa(0.1);

        assertEquals(0.96  , Math.round(conversaoRealDolar.calcularNota()*100.0)/100.0);
    }
}