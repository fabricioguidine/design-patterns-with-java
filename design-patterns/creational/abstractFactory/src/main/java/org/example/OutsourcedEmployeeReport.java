package org.example;

/**
 * Concrete implementation of Report for outsourced employees.
 * This class provides report information specific to outsourced employees.
 * * @version 1.0
 */
public class OutsourcedEmployeeReport implements Report {
    
    /**
     * Generates and returns the report information for outsourced employees.
     * 
     * @return a string containing the report information for outsourced employees
     */
    @Override
    public String generate() {
        return "Report for Employee: Outsourced.";
    }
}

