package org.example;

/**
 * Concrete strategy for saving files in TXT format.
 * This class implements the FileFormat interface to provide TXT-specific
 * file saving functionality.
 * * @version 1.0
 */
public class TXT implements FileFormat {
    
    /**
     * Saves a file in TXT format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message indicating the TXT file was saved
     */
    @Override
    public String save(String fileName) {
        return "File saved with *.TXT extension!";
    }
}