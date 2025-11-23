package org.example;
public class Vitoria implements JogoEstado{
    private Vitoria() {};
    private static Vitoria instance = new Vitoria();
    public static Vitoria getInstance() {
        return instance;
    }
    public String getEstado() {
        return "VITÓRIA!";
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