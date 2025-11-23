package org.example;

import java.util.Observable;

/**
 * Represents a scholarship that notifies observers when results are published.
 * 
 * @version 1.0
 */
public class Scholarship extends Observable {
    private String course;
    private Float value;
    private Integer quantity;

    /**
     * Constructs a Scholarship with the given details.
     * 
     * @param course the course name
     * @param value the scholarship value
     * @param quantity the number of available scholarships
     */
    public Scholarship(String course, Float value, Integer quantity) {
        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Course cannot be null or empty");
        }
        if (value == null || value < 0) {
            throw new IllegalArgumentException("Value cannot be null or negative");
        }
        if (quantity == null || quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be null or negative");
        }
        this.course = course;
        this.value = value;
        this.quantity = quantity;
    }

    /**
     * Publishes the scholarship results and notifies all observers.
     */
    public void publishResults() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Scholarship{" +
                "course='" + course + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}

