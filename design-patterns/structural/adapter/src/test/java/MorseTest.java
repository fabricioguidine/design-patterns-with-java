import org.example.Morse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MorseTest {

    @Test
    void deveRetornarMorse() {
        Morse morse = new Morse();
        morse.setNumero("-----");
        assertEquals("-----", morse.getNumero());
    }

    @Test
    void deveRetornarInteiroParaMorse() {
        Morse morse = new Morse();
        morse.setNumero("5");
        assertEquals("-----", morse.getNumero());
    }

}
