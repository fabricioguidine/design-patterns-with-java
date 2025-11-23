package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a composite node in the Composite pattern - a manager with subordinates.
 * 
 * @version 1.0
 */
public class Manager extends Person {
    private List<Person> subordinates;

    /**
     * Constructs a Manager with the given information.
     * 
     * @param name the manager's name
     * @param registrationNumber the registration number
     * @param position the job position
     */
    public Manager(String name, String registrationNumber, String position) {
        super(name, registrationNumber, position);
        this.subordinates = new ArrayList<>();
    }

    /**
     * Adds a subordinate to this manager.
     * 
     * @param person the person to add as subordinate
     */
    public void addSubordinate(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        this.subordinates.add(person);
    }

    @Override
    public String getInfo() {
        StringBuilder output = new StringBuilder();
        output.append("Manager: ").append(this.getName())
              .append(" / ").append(this.getPosition())
              .append(" / ").append(this.getRegistrationNumber())
              .append("\n");
        
        for (Person person : subordinates) {
            output.append(person.getInfo());
        }
        
        return output.toString();
    }
}

