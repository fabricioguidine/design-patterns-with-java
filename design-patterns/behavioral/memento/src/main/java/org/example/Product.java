package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a product that can save and restore its state using the Memento pattern.
 * 
 * @version 1.0
 */
public class Product {
    private ProductState state;
    private List<ProductState> memento = new ArrayList<>();

    /**
     * Gets the current state.
     * 
     * @return the current state
     */
    public ProductState getState() {
        return this.state;
    }

    /**
     * Sets the product state and saves it to memento.
     * 
     * @param state the state to set
     */
    public void setState(ProductState state) {
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
        this.state = state;
        this.memento.add(this.state);
    }

    /**
     * Restores the state from memento at the given index.
     * 
     * @param index the index to restore
     * @throws IllegalArgumentException if index is invalid
     */
    public void restoreState(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }
        this.state = this.memento.get(index);
    }

    /**
     * Gets all saved states.
     * 
     * @return the list of saved states
     */
    public List<ProductState> getStates() {
        return new ArrayList<>(this.memento);
    }
}

