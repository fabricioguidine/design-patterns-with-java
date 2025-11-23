import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EmpresaTest {
    @Test
    void deveRetornarColaboradoresEmpresa() {
        Gerente gerente123 = new Gerente("Alice Silva", "111.222.333-44", "Diretora de Recursos Humanos");
        Colaborador colaborador789 = new Colaborador("João da Silva", "222.333.444-55", "Analista de RH");
        Colaborador colaborador012 = new Colaborador("Maria Santos", "333.444.555-66", "Analista de Recrutamento e Seleção");
        gerente123.addSubordinado(colaborador789);
        gerente123.addSubordinado(colaborador012);
        Gerente gerente456 = new Gerente("Carlos Pereira", "444.555.666-77", "Diretor de Comunicações");
        Gerente gerente789 = new Gerente("Laura Ferreira", "555.666.777-88", "Diretora de Marketing");
        Colaborador colaborador234 = new Colaborador("Rafael Oliveira", "666.777.888-99", "Propagandista");
        Colaborador colaborador567 = new Colaborador("Mariana Lima", "777.888.999-00", "Social Media");
        gerente789.addSubordinado(colaborador234);
        gerente789.addSubordinado(colaborador567);
        gerente456.addSubordinado(gerente789);
        Gerente ceo = new Gerente("Pedro Souza", "888.999.000-11", "CEO");
        ceo.addSubordinado(gerente123);
        ceo.addSubordinado(gerente456);
        Empresa empresa = new Empresa();
        empresa.setColaboradores(ceo);
        assertEquals("Gerente: Pedro Souza / CEO / 888.999.000-11\n" +
                "Gerente: Alice Silva / Diretora de Recursos Humanos / 111.222.333-44\n" +
                "Colaborador: João da Silva / Analista de RH / 222.333.444-55\n" +
                "Colaborador: Maria Santos / Analista de Recrutamento e Seleção / 333.444.555-66\n" +
                "Gerente: Carlos Pereira / Diretor de Comunicações / 444.555.666-77\n" +
                "Gerente: Laura Ferreira / Diretora de Marketing / 555.666.777-88\n" +
                "Colaborador: Rafael Oliveira / Propagandista / 666.777.888-99\n" +
                "Colaborador: Mariana Lima / Social Media / 777.888.999-00\n", empresa.getColaboradores());
    }

    @Test
    void deveRetornarExcecaoEmpresaSemColaboradores() {
        try {
            Empresa empresa = new Empresa();
            empresa.getColaboradores();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Não há colaboradores registrados.", e.getMessage());
        }
    }
}
