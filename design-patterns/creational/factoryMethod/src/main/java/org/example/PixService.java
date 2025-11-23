package org.example;

/**
 * Pix payment service implementation.
 * 
 * @version 1.0
 */
public class PixService implements IService {
    @Override
    public String execute() {
        return "Payment by Pix.";
    }
    
    @Override
    public String cancel() {
        return "Payment cancelled.";
    }
}

