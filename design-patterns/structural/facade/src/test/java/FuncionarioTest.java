import org.example.Treinamento;
import org.example.Certificado;
import org.example.Gerente;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
public class FuncionarioTest {
    @Test
    void deveRetornarFuncionarioLiberado(){
        Funcionario funcionario = new Funcionario();
        assertEquals(true, funcionario.liberado());
    }

    @Test
    void deveRetornarFalsoPorTreinamento(){
        Funcionario funcionario = new Funcionario();
        Treinamento.getInstancia().adicionarFuncionarioSemTreinamento(funcionario);
        assertEquals(false, funcionario.liberado());
    }

    @Test
    void deveRetornarFalsoPorGerente(){
        Funcionario funcionario = new Funcionario();
        Gerente.getInstancia().adicionarFuncionarioSemTreinamento(funcionario);
        assertEquals(false, funcionario.liberado());
    }

    @Test
    void deveRetornarFalsoPorCertificado(){
        Funcionario funcionario = new Funcionario();
        Certificado.getInstancia().adicionarFuncionarioSemTreinamento(funcionario);
        assertEquals(false, funcionario.liberado());
    }

    @Test
    void deveRetornarExcecaoCorreta(){
        try {
            Treinamento.getInstancia().adicionarFuncionarioSemTreinamento(null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Funcionário não pode ser nulo.", e.getMessage());
        }

    }
}