package org.example;

/**
 * Represents a number in Morse code format.
 * 
 * @version 1.0
 */
public class MorseNumber implements INumber {
    private String morse;

    @Override
    public String getNumber() {
        return this.morse;
    }

    @Override
    public void setNumber(String morse) {
        this.morse = morse;
    }
}

