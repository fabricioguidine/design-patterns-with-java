package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * SMS mediator implementation for the Mediator pattern.
 * 
 * @version 1.0
 */
public class SMS implements Mediator {
    private List<Recipient> recipients;

    /**
     * Constructs a new SMS mediator.
     */
    public SMS() {
        this.recipients = new ArrayList<>();
    }

    @Override
    public void send(String message, Recipient sender) {
        if (message == null) {
            throw new IllegalArgumentException("Message cannot be null");
        }
        for (Recipient recipient : recipients) {
            if (recipient != sender) {
                recipient.receiveMessage(message);
            }
        }
    }

    @Override
    public void addRecipient(Recipient recipient) {
        if (recipient == null) {
            throw new IllegalArgumentException("Recipient cannot be null");
        }
        this.recipients.add(recipient);
    }
}
