package org.example;

/**
 * Certificate department singleton in the Facade pattern.
 * 
 * @version 1.0
 */
public class Certificate extends Department {
    private static Certificate certificate = new Certificate();

    private Certificate() {}

    /**
     * Gets the singleton instance.
     * 
     * @return the Certificate instance
     */
    public static Certificate getInstance() {
        return certificate;
    }
}

