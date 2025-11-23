package org.example;

/**
 * Command implementation for opening a ticket.
 * 
 * @version 1.0
 */
public class OpenTicketTask implements Task {
    private Ticket ticket;

    /**
     * Constructs an OpenTicketTask for the given ticket.
     * 
     * @param ticket the ticket to open
     */
    public OpenTicketTask(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.openTicket();
    }

    @Override
    public void cancel() {
        ticket.closeTicket();
    }
}

