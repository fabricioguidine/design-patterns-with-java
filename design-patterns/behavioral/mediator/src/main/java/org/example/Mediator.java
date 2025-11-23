package org.example;

/**
 * Mediator interface for communication between objects.
 * 
 * @version 1.0
 */
public interface Mediator {
    /**
     * Sends a message to all recipients except the sender.
     * 
     * @param message the message to send
     * @param sender the sender of the message
     */
    void send(String message, Recipient sender);
    
    /**
     * Adds a recipient to the mediator.
     * 
     * @param recipient the recipient to add
     */
    void addRecipient(Recipient recipient);
}
