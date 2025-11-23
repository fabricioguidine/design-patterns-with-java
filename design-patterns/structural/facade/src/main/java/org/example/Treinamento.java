package org.example;

public class Treinamento extends Setor {
    private static Treinamento treinamento = new Treinamento();

    private Treinamento(){};

    public static Treinamento getInstancia(){
        return treinamento;
    }
}
