package org.example;

/**
 * Interface for message recipients in the Mediator pattern.
 * 
 * @version 1.0
 */
public interface Recipient {
    /**
     * Receives a message.
     * 
     * @param message the message to receive
     */
    void receiveMessage(String message);
}

