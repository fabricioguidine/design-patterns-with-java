package org.example;

/**
 * Concrete implementation of Report for internal employees.
 * This class provides report information specific to internal employees.
 * * @version 1.0
 */
public class InternalEmployeeReport implements Report {
    
    /**
     * Generates and returns the report information for internal employees.
     * 
     * @return a string containing the report information for internal employees
     */
    @Override
    public String generate() {
        return "Report for Employee: Internal.";
    }
}

