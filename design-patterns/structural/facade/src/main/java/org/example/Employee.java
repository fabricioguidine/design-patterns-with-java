package org.example;

/**
 * Employee class that uses the Facade pattern to check for pending issues.
 * 
 * @version 1.0
 */
public class Employee {
    /**
     * Checks if the employee is cleared (has no pending issues).
     * 
     * @return true if employee is cleared, false otherwise
     */
    public boolean isCleared() {
        return EmployeeFacade.checkEmployeePendingIssues(this);
    }
}

