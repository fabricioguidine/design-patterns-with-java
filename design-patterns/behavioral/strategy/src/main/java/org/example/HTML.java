package org.example;

/**
 * Concrete strategy for saving files in HTML format.
 * This class implements the FileFormat interface to provide HTML-specific
 * file saving functionality.
 * * @version 1.0
 */
public class HTML implements FileFormat {
    
    /**
     * Saves a file in HTML format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message indicating the HTML file was saved
     */
    @Override
    public String save(String fileName) {
        return "File saved with *.HTML extension!";
    }
}