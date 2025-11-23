package org.example;
public class Pausa implements JogoEstado{
    private Pausa() {};
    private static Pausa instance = new Pausa();
    public static Pausa getInstance() {
        return instance;
    }
    public String getEstado() {
        return "PAUSA";
    }
    public String comecar(Jogo jogo) {
        jogo.setEstado(Start.getInstance());
        return "JOGO INICIADO";
    }
    public String jogar(Jogo jogo) {
        jogo.setEstado(Play.getInstance());
        return "JOGO EM ANDAMENTO";
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
