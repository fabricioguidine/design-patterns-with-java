package org.example;

public class Gerente extends Setor {
    private static Gerente gerente = new Gerente();

    private Gerente(){};

    public static Gerente getInstancia(){
        return gerente;
    }
}
