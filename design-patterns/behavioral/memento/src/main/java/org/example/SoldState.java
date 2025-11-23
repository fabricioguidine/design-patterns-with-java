package org.example;

/**
 * Represents the "Sold" state of a product.
 * 
 * @version 1.0
 */
public class SoldState implements ProductState {
    private SoldState() {}
    
    private static final SoldState instance = new SoldState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static SoldState getInstance() {
        return instance;
    }

    @Override
    public String getStateName() {
        return "Sold";
    }
}

