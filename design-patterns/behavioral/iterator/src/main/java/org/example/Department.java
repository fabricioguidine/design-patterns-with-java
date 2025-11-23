package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a department that implements Iterable for the Iterator pattern.
 * 
 * @version 1.0
 */
public class Department implements Iterable<Collaborator> {
    private List<Collaborator> collaborators = new ArrayList<>();

    /**
     * Constructs a Department with the given collaborators.
     * 
     * @param collaborators the collaborators to add
     */
    public Department(Collaborator... collaborators) {
        this.collaborators = Arrays.asList(collaborators);
    }

    @Override
    public Iterator<Collaborator> iterator() {
        return collaborators.iterator();
    }
}

