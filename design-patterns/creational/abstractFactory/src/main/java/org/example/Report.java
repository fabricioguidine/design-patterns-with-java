package org.example;

/**
 * Interface representing a report document.
 * Different implementations provide report information for different employee types.
 * 
 * @version 1.0
 */
public interface Report {
    
    /**
     * Generates and returns the report information as a string.
     * 
     * @return a string representation of the report information
     */
    String generate();
}

