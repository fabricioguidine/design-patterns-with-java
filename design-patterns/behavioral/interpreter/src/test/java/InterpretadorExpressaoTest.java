import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressaoTest {

    @Test
    void deveCalcularExpressaoSoma() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("5 + 10");
        assertEquals(15.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 - 5");
        assertEquals(5.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 * 3 * 4");
        assertEquals(24.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("20 / 5");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("8 / 2 * 3 + 1 - 2");
        assertEquals(11.0, interpretador.interpretar());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("5 ^ 2");
            interpretador.interpretar();
            fail("Exceção esperada");
        } catch (IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 +");
            interpretador.interpretar();
            fail("Exceção esperada");
        } catch (IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }
}
