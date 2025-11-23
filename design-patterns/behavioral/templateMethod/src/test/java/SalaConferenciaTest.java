import org.example.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaConferenciaTest {

    SalaConferencia sala;

    @BeforeEach
    void setUp(){
        sala = new SalaConferencia();
    }

    @Test
    void deveRetornarTempo(){
        assertEquals(2.0, sala.getTempo());
    }

    @Test
    void deveRetornarTipoSala(){
        assertEquals("Sala de Conferência", sala.getTipo());
    }

    @Test
    void deveSimularValorEstadia(){
        Integer dias = 30;
        assertEquals(60.0, sala.simularEstadia(dias));
    }

    @Test
    void deveRetornarInformacoes(){
        sala.setNumero("1999");
        String respostaEsperada =
                "{\n" +
                        "   numero: 1999,\n" +
                        "   tempo: 2.0,\n" +
                        "   tipo: Sala de Conferência\n" +
                        "}";

        assertEquals(respostaEsperada, sala.getInfo());
    }
}