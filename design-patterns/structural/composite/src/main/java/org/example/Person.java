package org.example;

/**
 * Abstract base class representing a person in the organization.
 * Implements the Component interface in the Composite pattern.
 * 
 * @version 1.0
 */
public abstract class Person {
    private String name;
    private String registrationNumber;
    private String position;

    /**
     * Constructs a Person with the given information.
     * 
     * @param name the person's name
     * @param registrationNumber the registration number
     * @param position the job position
     */
    public Person(String name, String registrationNumber, String position) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets information about this person.
     * 
     * @return a string containing person information
     */
    public abstract String getInfo();
}

