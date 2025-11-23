package org.example;

/**
 * Represents a division operation in the expression tree.
 * 
 * @version 1.0
 */
public class Division implements ExpressionInterpreter {
    private double x;
    private double y;

    /**
     * Constructs a Division operation with left and right operands.
     * 
     * @param leftElement the left operand
     * @param rightElement the right operand
     */
    public Division(Number leftElement, Number rightElement) {
        if (leftElement == null || rightElement == null) {
            throw new IllegalArgumentException("Operands cannot be null");
        }
        x = leftElement.getNumber();
        y = rightElement.getNumber();
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
    }

    @Override
    public double interpret() {
        return x / y;
    }
}

