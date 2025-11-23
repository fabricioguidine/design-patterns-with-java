package org.example;
public interface JogoEstado {
    String getEstado();
    String comecar(Jogo jogo);
    String jogar(Jogo jogo);
    String perder(Jogo jogo);
    String ganhar(Jogo jogo);
    String pausar(Jogo jogo);
}
