package org.example;

/**
 * Strategy interface for file saving operations.
 * This interface defines the contract for different file format saving strategies.
 * The Strategy pattern allows selecting algorithms at runtime, making the system
 * more flexible and extensible.
 * * @version 1.0
 */
public interface FileFormat {
    
    /**
     * Saves a file with the given name using the specific format strategy.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message indicating the file was saved
     * @throws IllegalArgumentException if fileName is null or empty
     */
    String save(String fileName);
}