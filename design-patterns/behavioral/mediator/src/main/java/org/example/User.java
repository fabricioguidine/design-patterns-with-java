package org.example;

/**
 * Represents a user that can receive messages through the mediator.
 * 
 * @version 1.0
 */
public class User implements Recipient {
    private String name;

    /**
     * Constructs a User with the given name.
     * 
     * @param name the user's name
     */
    public User(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received a new message: " + message);
    }
}

