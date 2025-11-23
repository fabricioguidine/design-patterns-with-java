import org.example.Declaracao;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FuncionarioTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario(9999, "Marco Antônio", new Declaracao("Juiz de Fora", 1));

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setMatricula(999);
        funcionarioClone.setNome("Funcionario clonado.");
        assertEquals("Funcionario{matricula=9999, nome='Marco Antônio', declaracao=declaracao{cidade='Juiz de Fora', matricula=1}}", funcionario.toString());
        assertEquals("Funcionario{matricula=999, nome='Funcionario clonado.', declaracao=declaracao{cidade='Juiz de Fora', matricula=1}}", funcionarioClone.toString());
    }
}