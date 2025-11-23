package org.example;

/**
 * Client class that uses the Adapter pattern to work with Morse code numbers.
 * 
 * @version 1.0
 */
public class Morse {
    private INumber number;
    private NumberAdapter adapter;

    /**
     * Constructs a new Morse instance with default adapter setup.
     */
    public Morse() {
        number = new MorseNumber();
        adapter = new NumberAdapter(number);
    }

    /**
     * Sets the number in Morse code format.
     * 
     * @param morse the Morse code string
     */
    public void setNumber(String morse) {
        number.setNumber(morse);
        adapter.saveNumber();
    }

    /**
     * Gets the number in Morse code format.
     * 
     * @return the Morse code string representation
     */
    public String getNumber() {
        return adapter.retrieveNumber();
    }

    /**
     * Gets the integer value of the number.
     * 
     * @return the integer value
     */
    public int getNum() {
        return adapter.getNum();
    }
}
