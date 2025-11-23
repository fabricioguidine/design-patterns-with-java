package org.example;

public class SalaConferencia extends Sala {

    @Override
    public Double getTempo() {
        return 2.0;
    }

    @Override
    public String getTipo() {
        return "Sala de Conferência";
    }
}
