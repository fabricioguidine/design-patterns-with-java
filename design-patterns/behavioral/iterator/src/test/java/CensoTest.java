
import org.example.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Setor setor = new Setor(
                new Colaborador("Fabrício 1", true),
                new Colaborador("Fabrício 2", false),
                new Colaborador("Fabrício 3", false),
                new Colaborador("Fabrício 4", true)
        );
        assertEquals(2, Censo.contarColaboradoresAtivosSetor(setor));
    }

    @Test
    void contarTotalFuncionariosSetor() {
        Setor setor = new Setor(
                new Colaborador("Fabrício 1", true),
                new Colaborador("Fabrício 2", false),
                new Colaborador("Fabrício 3", false),
                new Colaborador("Fabrício 4", false)
        );
        assertEquals(4, Censo.contarTotalColaboradoresSetor(setor));
    }
}