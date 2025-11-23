package org.example;

/**
 * Concrete strategy for saving files in PDF format.
 * This class implements the FileFormat interface to provide PDF-specific
 * file saving functionality.
 * * @version 1.0
 */
public class PDF implements FileFormat {
    
    /**
     * Saves a file in PDF format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message indicating the PDF file was saved
     */
    @Override
    public String save(String fileName) {
        return "File saved with *.PDF extension!";
    }
}