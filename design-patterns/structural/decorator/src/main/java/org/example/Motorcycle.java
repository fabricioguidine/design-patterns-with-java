package org.example;

/**
 * Interface for motorcycles in the Decorator pattern.
 * 
 * @version 1.0
 */
public interface Motorcycle {
    /**
     * Gets the price of the motorcycle.
     * 
     * @return the price
     */
    float getPrice();
    
    /**
     * Gets the customization description.
     * 
     * @return the customization string
     */
    String getCustom();
}

