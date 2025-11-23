package org.example;

/**
 * Honda motorcycle implementation.
 * 
 * @version 1.0
 */
public class Honda implements Motorcycle {
    public float price;

    /**
     * Default constructor.
     */
    public Honda() {
        this.price = 0;
    }

    /**
     * Constructs a Honda motorcycle with the given price.
     * 
     * @param price the motorcycle price
     */
    public Honda(float price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getCustom() {
        return "Honda";
    }
}
