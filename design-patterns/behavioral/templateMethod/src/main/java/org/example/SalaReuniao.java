package org.example;

public class SalaReuniao extends Sala {

    @Override
    public Double getTempo() {
        return 2.0;
    }

    @Override
    public String getTipo() {
        return "Sala de Reunião";
    }
}
