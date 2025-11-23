package org.example;

/**
 * Represents the "Lost" state of a product.
 * 
 * @version 1.0
 */
public class LostState implements ProductState {
    private LostState() {}
    
    private static final LostState instance = new LostState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static LostState getInstance() {
        return instance;
    }

    @Override
    public String getStateName() {
        return "Lost";
    }
}

