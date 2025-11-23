package org.example;

public class Morse {

    INumero numero;
    NumeroAdapter persistencia;

    public Morse() {
        numero = new NumeroMorse();
        persistencia = new NumeroAdapter(numero);
    }

    public void setNumero(String morse) {
        numero.setNumero(morse);
        persistencia.salvarNumero();
    }

    public String getNumero() {
        return persistencia.recuperarNumero();
    }

    public float getNum() {
        return persistencia.getNum();
    }
}

