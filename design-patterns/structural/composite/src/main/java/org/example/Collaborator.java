package org.example;

/**
 * Represents a leaf node in the Composite pattern - a regular employee.
 * 
 * @version 1.0
 */
public class Collaborator extends Person {
    /**
     * Constructs a Collaborator with the given information.
     * 
     * @param name the collaborator's name
     * @param registrationNumber the registration number
     * @param position the job position
     */
    public Collaborator(String name, String registrationNumber, String position) {
        super(name, registrationNumber, position);
    }

    @Override
    public String getInfo() {
        return "Collaborator: " + this.getName() + " / " + this.getPosition() + " / " + this.getRegistrationNumber() + "\n";
    }
}

