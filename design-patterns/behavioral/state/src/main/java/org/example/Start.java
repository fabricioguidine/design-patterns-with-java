package org.example;
public class Start implements JogoEstado{
    private Start() {};
    private static Start instance = new Start();
    public static Start getInstance() {
        return instance;
    }
    public String getEstado() {
        return "START";
    }
    public String comecar(Jogo jogo) {
        return "JOGO NÃO INICIADO";
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