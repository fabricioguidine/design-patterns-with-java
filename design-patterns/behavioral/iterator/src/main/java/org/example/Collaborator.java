package org.example;

/**
 * Represents a collaborator/employee in the organization.
 * 
 * @version 1.0
 */
public class Collaborator {
    private String name;
    private boolean active;

    /**
     * Constructs a Collaborator with the given name and active status.
     * 
     * @param name the collaborator's name
     * @param active whether the collaborator is active
     */
    public Collaborator(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

