package org.example;

/**
 * Represents the "In Stock" state of a product.
 * 
 * @version 1.0
 */
public class InStockState implements ProductState {
    private InStockState() {}
    
    private static final InStockState instance = new InStockState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static InStockState getInstance() {
        return instance;
    }

    @Override
    public String getStateName() {
        return "In Stock";
    }
}

