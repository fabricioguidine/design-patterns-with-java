import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class JogoTest {
    Jogo jogo;
    @BeforeEach
    public void setUp() {
        jogo = new Jogo();
    }
    @Test
    public void naoDeveStartarJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("JOGO NÃO INICIADO", jogo.comecar());
    }
    @Test
    public void devePlayJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("JOGO EM ANDAMENTO", jogo.jogar());
    }
    @Test
    public void NaoDevePerderJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("GAME OVER NÃO REALIZADO", jogo.perder());
    }
    @Test
    public void NaoDeveGanharJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("VITÓRIA NÃO REALIZADA", jogo.ganhar());
    }
    @Test
    public void NaoDevePausarJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("JOGO PAUSADO NÃO REALIZADO", jogo.pausar());
    }
    @Test
    public void naoDeveStartarJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("JOGO NÃO INICIADO", jogo.comecar());
    }
    @Test
    public void naoDevePlayJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("JOGO EM ANDAMENTO NÃO REALIZADO", jogo.jogar());
    }
    @Test
    public void devePerderJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("GAME OVER!", jogo.perder());
    }
    @Test
    public void deveGanharJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("VITÓRIA!", jogo.ganhar());
    }
    @Test
    public void devePausarJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("JOGO PAUSADO", jogo.pausar());
    }
    @Test
    public void naoDeveStartarJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("JOGO NÃO INICIADO", jogo.comecar());
    }
    @Test
    public void naoDevePlayJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("JOGO EM ANDAMENTO NÃO REALIZADO", jogo.jogar());
    }
    @Test
    public void NaoDevePerderJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("GAME OVER NÃO REALIZADO", jogo.perder());
    }
    @Test
    public void naoDeveGanharJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("VITÓRIA NÃO REALIZADA", jogo.ganhar());
    }
    @Test
    public void NaoDevePausarJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("JOGO PAUSADO NÃO REALIZADO", jogo.pausar());
    }
    @Test
    public void naoDeveStartarJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("JOGO NÃO INICIADO", jogo.comecar());
    }
    @Test
    public void naoDevePlayJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("JOGO EM ANDAMENTO NÃO REALIZADO", jogo.jogar());
    }
    @Test
    public void NaoDevePerderJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("GAME OVER NÃO REALIZADO", jogo.perder());
    }
    @Test
    public void naoDeveGanharJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("VITÓRIA NÃO REALIZADA", jogo.ganhar());
    }
    @Test
    public void NaoDevePausarJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("JOGO PAUSADO NÃO REALIZADO", jogo.pausar());
    }
    @Test
    public void DeveStartarJogoPausar() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("JOGO INICIADO", jogo.comecar());
    }
    @Test
    public void DevePlayJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("JOGO EM ANDAMENTO", jogo.jogar());
    }
    @Test
    public void NaoDevePerderJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("GAME OVER NÃO REALIZADO", jogo.perder());
    }
    @Test
    public void naoDeveGanharJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("VITÓRIA NÃO REALIZADA", jogo.ganhar());
    }
    @Test
    public void NaoDevePausarJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("JOGO PAUSADO NÃO REALIZADO", jogo.pausar());
    }
}