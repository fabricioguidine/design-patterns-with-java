package org.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Represents a student that observes scholarship updates.
 * 
 * @version 1.0
 */
public class Student implements Observer {
    private String name;
    private String lastNotification;

    /**
     * Constructs a Student with the given name.
     * 
     * @param name the student's name
     */
    public Student(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    /**
     * Gets the last notification received.
     * 
     * @return the last notification
     */
    public String getLastNotification() {
        return this.lastNotification;
    }

    /**
     * Applies for a scholarship and registers as an observer.
     * 
     * @param scholarship the scholarship to apply for
     */
    public void apply(Scholarship scholarship) {
        if (scholarship == null) {
            throw new IllegalArgumentException("Scholarship cannot be null");
        }
        scholarship.addObserver(this);
    }

    @Override
    public void update(Observable vacancy, Object arg1) {
        this.lastNotification = this.name + ", application updated for: " + vacancy.toString();
    }
}

