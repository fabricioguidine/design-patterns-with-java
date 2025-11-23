package org.example;

/**
 * Race interface representing the implementation side of the Bridge pattern.
 * Different races provide different purchase values.
 * 
 * @version 1.0
 */
public interface Race {
    /**
     * Gets the purchase value for this race.
     * 
     * @return the purchase value
     */
    float getPurchaseValue();
}

