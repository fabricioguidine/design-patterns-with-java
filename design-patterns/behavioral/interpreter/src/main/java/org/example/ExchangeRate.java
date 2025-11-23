package org.example;

/**
 * Utility class for calculating exchange rates using the Interpreter pattern.
 * 
 * @version 1.0
 */
public class ExchangeRate {
    public static String formula = "real / 5.2 + rate";

    /**
     * Calculates the exchange value using the formula.
     * 
     * @param real the amount in Brazilian Real
     * @param rate the exchange rate
     * @return the calculated value
     */
    public static double calculateValue(double real, double rate) {
        String expression;
        expression = formula.replace("real", Double.toString(real));
        expression = expression.replace("rate", Double.toString(rate));
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter(expression);
        return interpreter.interpret();
    }
}

