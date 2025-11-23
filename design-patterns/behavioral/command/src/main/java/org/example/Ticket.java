package org.example;

/**
 * Represents a support ticket with protocol, subject, and client information.
 * 
 * @version 1.0
 */
public class Ticket {
    private int protocol;
    private String subject;
    private String clientName;
    private String status;

    /**
     * Constructs a new Ticket.
     * 
     * @param protocol the ticket protocol number
     * @param subject the ticket subject
     * @param clientName the client name
     */
    public Ticket(int protocol, String subject, String clientName) {
        this.protocol = protocol;
        this.subject = subject;
        this.clientName = clientName;
    }

    /**
     * Gets the ticket status.
     * 
     * @return the current status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Opens the ticket.
     */
    public void openTicket() {
        this.status = "Complaint opened";
    }

    /**
     * Closes the ticket.
     */
    public void closeTicket() {
        this.status = "Complaint closed";
    }

    public int getProtocol() {
        return protocol;
    }

    public String getSubject() {
        return subject;
    }

    public String getClientName() {
        return clientName;
    }
}
