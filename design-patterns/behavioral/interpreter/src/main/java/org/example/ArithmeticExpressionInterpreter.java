package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Interprets arithmetic expressions using the Interpreter pattern.
 * Supports addition (+), subtraction (-), multiplication (*), and division (/).
 * 
 * @version 1.0
 */
public class ArithmeticExpressionInterpreter implements ExpressionInterpreter {
    private ExpressionInterpreter initialInterpreter;

    /**
     * Constructs an interpreter for the given arithmetic expression.
     * 
     * @param context the arithmetic expression as a string (e.g., "5 + 10")
     */
    public ArithmeticExpressionInterpreter(String context) {
        if (context == null || context.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be null or empty");
        }

        Stack<ExpressionInterpreter> interpreterStack = new Stack<>();
        List<String> elements = Arrays.asList(context.split(" "));
        Iterator<String> iterator = elements.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.matches("\\d+(\\.\\d*)?")) {
                interpreterStack.push(new Number(Double.parseDouble(element)));
            } else if (element.equals("+")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Addition interpreter = new Addition(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("-")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Subtraction interpreter = new Subtraction(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("*")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Multiplication interpreter = new Multiplication(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("/")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Division interpreter = new Division(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else {
                throw new IllegalArgumentException("Expression contains invalid element");
            }
        }
        
        if (interpreterStack.isEmpty()) {
            throw new IllegalArgumentException("Empty expression");
        }
        
        initialInterpreter = interpreterStack.pop();
    }

    @Override
    public double interpret() {
        return initialInterpreter.interpret();
    }
}

