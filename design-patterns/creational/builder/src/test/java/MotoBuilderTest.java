import org.example.MotoBuilder;
import org.example.Moto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MotoBuilderTest {
    @Test
    void deveRetornarExcecaoParaSemMarca() {
        try{
            MotoBuilder motoBuilder = new MotoBuilder();
            Moto moto = motoBuilder
                    .setModelo("fan")
                    .setAno(2011)
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Marca inválida.", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaSemModelo() {
        try{
            MotoBuilder motoBuilder = new MotoBuilder();
            Moto moto = motoBuilder
                    .setMarca("honda")
                    .setAno(2011)
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido.", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaSemAno() {
        try{
            MotoBuilder motoBuilder = new MotoBuilder();
            Moto moto = motoBuilder
                    .setMarca("honda")
                    .setModelo("fan")
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Ano inválido.", e.getMessage());
        }
    }
    @Test
    void deveRetornarCarroValido() {
        MotoBuilder motoBuilder = new MotoBuilder();
        Moto moto = motoBuilder
                .setMarca("honda")
                .setModelo("fan")
                .setAno(2011)
                .build();
        assertNotNull(moto);
    }
}