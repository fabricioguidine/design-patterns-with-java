package org.example;

/**
 * Represents an addition operation in the expression tree.
 * 
 * @version 1.0
 */
public class Addition implements ExpressionInterpreter {
    private double x;
    private double y;

    /**
     * Constructs an Addition operation with left and right operands.
     * 
     * @param leftElement the left operand
     * @param rightElement the right operand
     */
    public Addition(Number leftElement, Number rightElement) {
        if (leftElement == null || rightElement == null) {
            throw new IllegalArgumentException("Operands cannot be null");
        }
        x = leftElement.getNumber();
        y = rightElement.getNumber();
    }

    @Override
    public double interpret() {
        return x + y;
    }
}

