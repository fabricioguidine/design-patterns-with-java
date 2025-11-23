package org.example;

/**
 * User class that demonstrates the Strategy pattern.
 * This class uses different file saving strategies (HTML, PDF, TXT, XML)
 * without being tightly coupled to specific implementations.
 * 
 * <p>The Strategy pattern defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable. This allows the algorithm to vary independently
 * from clients that use it.
 * * @version 1.0
 */
public class User {
    
    /**
     * Saves a file in HTML format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if fileName is null or empty
     */
    public String saveHTML(String fileName) {
        return FileManager.save(new HTML(), fileName);
    }
    
    /**
     * Saves a file in PDF format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if fileName is null or empty
     */
    public String savePDF(String fileName) {
        return FileManager.save(new PDF(), fileName);
    }
    
    /**
     * Saves a file in TXT format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if fileName is null or empty
     */
    public String saveTXT(String fileName) {
        return FileManager.save(new TXT(), fileName);
    }
    
    /**
     * Saves a file in XML format.
     * 
     * @param fileName the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if fileName is null or empty
     */
    public String saveXML(String fileName) {
        return FileManager.save(new XML(), fileName);
    }
}
