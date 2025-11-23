package org.example;

/**
 * Manager department singleton in the Facade pattern.
 * 
 * @version 1.0
 */
public class Manager extends Department {
    private static Manager manager = new Manager();

    private Manager() {}

    /**
     * Gets the singleton instance.
     * 
     * @return the Manager instance
     */
    public static Manager getInstance() {
        return manager;
    }
}

