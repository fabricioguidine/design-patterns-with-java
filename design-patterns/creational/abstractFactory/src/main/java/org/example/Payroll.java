package org.example;

/**
 * Interface representing a payroll document.
 * Different implementations provide payroll information for different employee types.
 * 
 * @version 1.0
 */
public interface Payroll {
    
    /**
     * Generates and returns the payroll information as a string.
     * 
     * @return a string representation of the payroll information
     */
    String generate();
}

