import org.example.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaReuniaoTest {

    SalaReuniao sala;

    @BeforeEach
    void setUp(){
        sala = new SalaReuniao();
    }

    @Test
    void deveRetornarDiaria(){
        assertEquals(2.0, sala.getTempo());
    }

    @Test
    void deveRetornarTipoSala(){
        assertEquals("Sala de Reunião", sala.getTipo());
    }

    @Test
    void deveSimularValorEstadia(){
        Integer dias = 30;
        assertEquals(60.0, sala.simularEstadia(dias));
    }

    @Test
    void deveRetornarInformacoes(){
        sala.setNumero("2000");
        String respostaEsperada =
                "{\n" +
                        "   numero: 2000,\n" +
                        "   tempo: 2.0,\n" +
                        "   tipo: Sala de Reunião\n" +
                        "}";

        assertEquals(respostaEsperada, sala.getInfo());
    }
}