package org.example;

/**
 * Represents a number in the expression tree.
 * 
 * @version 1.0
 */
public class Number implements ExpressionInterpreter {
    private double number;

    /**
     * Constructs a Number with the given value.
     * 
     * @param number the numeric value
     */
    public Number(double number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return number;
    }

    /**
     * Gets the numeric value.
     * 
     * @return the number value
     */
    public double getNumber() {
        return this.number;
    }
}

