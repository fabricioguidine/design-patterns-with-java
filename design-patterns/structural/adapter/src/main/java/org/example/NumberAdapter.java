package org.example;

/**
 * Adapter class that converts between integer numbers and Morse code representation.
 * This class implements the Adapter pattern by allowing incompatible interfaces
 * (IntegerNumber and INumber/MorseNumber) to work together.
 * 
 * @version 1.0
 */
public class NumberAdapter extends IntegerNumber {
    private INumber morseNumber;

    /**
     * Constructs a NumberAdapter with the given Morse number.
     * 
     * @param morseNumber the Morse number to adapt
     */
    public NumberAdapter(INumber morseNumber) {
        this.morseNumber = morseNumber;
    }

    /**
     * Retrieves the number in Morse code format.
     * 
     * @return the number as Morse code string
     */
    public String retrieveNumber() {
        int num = this.getNum();
        switch (num) {
            case 0:
                morseNumber.setNumber("-----");
                break;
            case 1:
                morseNumber.setNumber(".----");
                break;
            case 2:
                morseNumber.setNumber("..---");
                break;
            case 3:
                morseNumber.setNumber("...--");
                break;
            case 4:
                morseNumber.setNumber("....-");
                break;
            case 5:
                morseNumber.setNumber(".....");
                break;
            default:
                morseNumber.setNumber("");
        }
        return morseNumber.getNumber();
    }

    /**
     * Saves the Morse code number as an integer.
     */
    public void saveNumber() {
        String morse = morseNumber.getNumber();
        switch (morse) {
            case "-----":
                this.setNum(0);
                break;
            case ".----":
                this.setNum(1);
                break;
            case "..---":
                this.setNum(2);
                break;
            case "...--":
                this.setNum(3);
                break;
            case "....-":
                this.setNum(4);
                break;
            case ".....":
                this.setNum(5);
                break;
            default:
                this.setNum(-1);
        }
    }
}

