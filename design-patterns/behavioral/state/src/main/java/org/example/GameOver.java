package org.example;
public class GameOver implements JogoEstado{
    private GameOver() {};
    private static GameOver instance = new GameOver();
    public static GameOver getInstance() {
        return instance;
    }
    public String getEstado() {
        return "GAME OVER";
    }
    public String comecar(Jogo jogo) {
        return "JOGO NÃO INICIADO";
    }
    public String jogar(Jogo jogo) {
        return "JOGO EM ANDAMENTO NÃO REALIZADO";
    }
    public String perder(Jogo jogo) {
        return "GAME OVER NÃO REALIZADO";
    }
    public String ganhar(Jogo jogo) {
        return "VITÓRIA NÃO REALIZADA";
    }
    public String pausar(Jogo jogo) {
        return "JOGO PAUSADO NÃO REALIZADO";
    }
}
