package org.example;

public class NumeroMorse implements INumero {

    private String morse;

    @Override
    public String getNumero() {
        return this.morse;
    }

    @Override
    public void setNumero(String morse) {
        this.morse = morse;
    }
}
