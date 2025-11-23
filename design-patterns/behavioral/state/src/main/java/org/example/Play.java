package org.example;
public class Play implements JogoEstado{
    private Play() {};
    private static Play instance = new Play();
    public static Play getInstance() {
        return instance;
    }
    public String getEstado() {
        return "PLAY";
    }
    public String comecar(Jogo jogo) {
        return "JOGO NÃO INICIADO";
    }
    public String jogar(Jogo jogo) {
        return "JOGO EM ANDAMENTO NÃO REALIZADO";
    }
    public String perder(Jogo jogo) {
        jogo.setEstado(GameOver.getInstance());
        return "GAME OVER!";
    }
    public String ganhar(Jogo jogo) {
        jogo.setEstado(Vitoria.getInstance());
        return "VITÓRIA!";
    }
    public String pausar(Jogo jogo) {
        jogo.setEstado(Pausa.getInstance());
        return "JOGO PAUSADO";
    }
}
