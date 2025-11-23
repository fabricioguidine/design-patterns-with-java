package org.example;

/**
 * Context class that uses a Strategy to perform file saving operations.
 * This class delegates the actual saving logic to the strategy object,
 * allowing different algorithms to be used interchangeably.
 * * @version 1.0
 */
public class FileManager {
    
    /**
     * Saves a file using the provided strategy.
     * 
     * @param fileFormat the strategy to use for saving the file
     * @param fileName the name of the file to save
     * @return a confirmation message from the strategy
     * @throws IllegalArgumentException if fileFormat is null or fileName is null/empty
     */
    public static String save(FileFormat fileFormat, String fileName) {
        if (fileFormat == null) {
            throw new IllegalArgumentException("File format strategy cannot be null");
        }
        if (fileName == null || fileName.trim().isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty");
        }
        return fileFormat.save(fileName);
    }
}
