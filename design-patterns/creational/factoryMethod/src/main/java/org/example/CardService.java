package org.example;

/**
 * Credit card payment service implementation.
 * 
 * @version 1.0
 */
public class CardService implements IService {
    @Override
    public String execute() {
        return "Payment by Credit Card.";
    }
    
    @Override
    public String cancel() {
        return "Payment cancelled.";
    }
}

