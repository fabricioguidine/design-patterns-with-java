package org.example;

/**
 * Training department singleton in the Facade pattern.
 * 
 * @version 1.0
 */
public class Training extends Department {
    private static Training training = new Training();

    private Training() {}

    /**
     * Gets the singleton instance.
     * 
     * @return the Training instance
     */
    public static Training getInstance() {
        return training;
    }
}

