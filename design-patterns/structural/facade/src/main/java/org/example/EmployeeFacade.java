package org.example;

/**
 * Facade class that simplifies checking employee pending issues across multiple departments.
 * 
 * @version 1.0
 */
public class EmployeeFacade {
    /**
     * Checks if an employee has any pending issues across all departments.
     * 
     * @param employee the employee to check
     * @return true if employee has no pending issues, false otherwise
     */
    public static boolean checkEmployeePendingIssues(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        
        if (Certificate.getInstance().verifyCertificate(employee)) {
            return false;
        }
        if (Manager.getInstance().verifyCertificate(employee)) {
            return false;
        }
        if (Training.getInstance().verifyCertificate(employee)) {
            return false;
        }

        return true;
    }
}

