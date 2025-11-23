package org.example;

import java.util.Iterator;

/**
 * Utility class for counting collaborators in departments using the Iterator pattern.
 * 
 * @version 1.0
 */
public class Census {

    /**
     * Counts the number of active collaborators in a department.
     * 
     * @param department the department to count
     * @return the number of active collaborators
     */
    public static Integer countActiveCollaboratorsInDepartment(Department department) {
        if (department == null) {
            return 0;
        }
        int count = 0;
        for (Collaborator collaborator : department) {
            if (collaborator.isActive()) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts the total number of collaborators in a department.
     * 
     * @param department the department to count
     * @return the total number of collaborators
     */
    public static Integer countTotalCollaboratorsInDepartment(Department department) {
        if (department == null) {
            return 0;
        }
        int count = 0;
        for (Iterator<Collaborator> iterator = department.iterator(); iterator.hasNext(); ) {
            count++;
            iterator.next();
        }
        return count;
    }
}

