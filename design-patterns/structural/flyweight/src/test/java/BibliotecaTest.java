import org.example.Biblioteca;
import org.example.FornecedorFactory;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {

    @Test
    public void deveRetornarEstoque(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarLivro("A Morte de Ivan Illich", 1.9f, "Cia das Letras", "São Paulo", "SP");
        biblioteca.registrarLivro("A Gaia Ciência", 9.9f, "Cia das Letras", "São Paulo", "SP");
        biblioteca.registrarLivro("O Leviatã", 3.88f, "LeYa", "São Paulo", "SP");
        biblioteca.registrarLivro("O Capital", 1600.0f, "Penguim", "Rio Branco", "AC");

        List<String> saida = Arrays.asList(
                "Livro{nome=A Morte de Ivan Illich, preco=R$1.9, nomeFornecedor=Cia das Letras, cidadeFornecedor=São Paulo, estadoFornecedor=SP}",
                "Livro{nome=A Gaia Ciência, preco=R$9.9, nomeFornecedor=Cia das Letras, cidadeFornecedor=São Paulo, estadoFornecedor=SP}",
                "Livro{nome=O Leviatã, preco=R$3.88, nomeFornecedor=LeYa, cidadeFornecedor=São Paulo, estadoFornecedor=SP}",
                "Livro{nome=O Capital, preco=R$1600.0, nomeFornecedor=Penguim, cidadeFornecedor=Rio Branco, estadoFornecedor=AC}"
        );

        assertEquals(saida, biblioteca.listarEstoque());
    }

    @Test
    public void deveRetornarQuantidadeFornecedores(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarLivro("A Morte de Ivan Illich", 1.9f, "Cia das Letras", "São Paulo", "SP");
        biblioteca.registrarLivro("A Gaia Ciência", 9.9f, "Cia das Letras", "São Paulo", "SP");
        biblioteca.registrarLivro("O Leviatã", 3.88f, "LeYa", "São Paulo", "SP");
        biblioteca.registrarLivro("O Capital", 1600.0f, "Penguim", "Rio Branco", "AC");

        assertEquals(3, FornecedorFactory.getQuantidadeFornecedores());
    }
}