package org.example;

/**
 * Represents a supplier in the Flyweight pattern.
 * 
 * @version 1.0
 */
public class Supplier {
    private String name;
    private String city;
    private String state;

    /**
     * Constructs a Supplier with the given information.
     * 
     * @param name the supplier name
     * @param city the supplier city
     * @param state the supplier state
     */
    public Supplier(String name, String city, String state) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }
        if (state == null || state.trim().isEmpty()) {
            throw new IllegalArgumentException("State cannot be null or empty");
        }
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

