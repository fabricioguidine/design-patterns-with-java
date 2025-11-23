package org.example;

/**
 * Command implementation for closing a ticket.
 * 
 * @version 1.0
 */
public class CloseTicketTask implements Task {
    private Ticket ticket;

    /**
     * Constructs a CloseTicketTask for the given ticket.
     * 
     * @param ticket the ticket to close
     */
    public CloseTicketTask(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.closeTicket();
    }

    @Override
    public void cancel() {
        ticket.openTicket();
    }
}

