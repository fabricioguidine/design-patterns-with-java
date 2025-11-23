package org.example;

/**
 * Interface for payment types in the Visitor pattern.
 * 
 * @version 1.0
 */
public interface Payment {
    /**
     * Accepts a visitor and returns the result.
     * 
     * @param visitor the visitor to accept
     * @return the result string
     */
    String accept(Visitor visitor);
}

