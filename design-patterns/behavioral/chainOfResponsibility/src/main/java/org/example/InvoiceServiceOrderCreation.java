package org.example;

/**
 * Singleton representing an invoice service order creation.
 * 
 * @version 1.0
 */
public class InvoiceServiceOrderCreation implements ServiceOrderCreation {
    private static final InvoiceServiceOrderCreation invoiceProcedure = 
        new InvoiceServiceOrderCreation();

    private InvoiceServiceOrderCreation() {}

    /**
     * Gets the singleton instance of invoice procedure.
     * 
     * @return the invoice procedure instance
     */
    public static InvoiceServiceOrderCreation getInvoiceProcedure() {
        return invoiceProcedure;
    }
}

