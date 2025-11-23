package org.example;

/**
 * Represents the "Out of Stock" state of a product.
 * 
 * @version 1.0
 */
public class OutOfStockState implements ProductState {
    private OutOfStockState() {}
    
    private static final OutOfStockState instance = new OutOfStockState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static OutOfStockState getInstance() {
        return instance;
    }

    @Override
    public String getStateName() {
        return "Out of Stock";
    }
}

