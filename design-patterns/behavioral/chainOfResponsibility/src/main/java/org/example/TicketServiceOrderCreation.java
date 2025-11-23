package org.example;

/**
 * Singleton representing a ticket service order creation.
 * 
 * @version 1.0
 */
public class TicketServiceOrderCreation implements ServiceOrderCreation {
    private static final TicketServiceOrderCreation ticketProcedure = 
        new TicketServiceOrderCreation();

    private TicketServiceOrderCreation() {}

    /**
     * Gets the singleton instance of ticket procedure.
     * 
     * @return the ticket procedure instance
     */
    public static TicketServiceOrderCreation getTicketProcedure() {
        return ticketProcedure;
    }
}

