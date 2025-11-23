package org.example;

/**
 * Concrete strategy for saving files in XML format.
 * This class implements the FileFormat interface to provide XML-specific
 * file saving functionality.
 * * @version 1.0
 */
public class XML implements FileFormat {
    
    /**
     * Saves a file in XML format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message indicating the XML file was saved
     */
    @Override
    public String save(String fileName) {
        return "File saved with *.XML extension!";
    }
}