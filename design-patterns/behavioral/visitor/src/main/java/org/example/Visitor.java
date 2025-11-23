package org.example;

/**
 * Visitor interface for the Visitor pattern.
 * 
 * @version 1.0
 */
public interface Visitor {
    /**
     * Visits a Pix payment.
     * 
     * @param pixPayment the Pix payment
     * @return formatted information
     */
    String displayPixPayment(PixPayment pixPayment);
    
    /**
     * Visits a credit card payment.
     * 
     * @param creditCardPayment the credit card payment
     * @return formatted information
     */
    String displayCreditCardPayment(CreditCardPayment creditCardPayment);
    
    /**
     * Visits an invoice payment.
     * 
     * @param invoicePayment the invoice payment
     * @return formatted information
     */
    String displayInvoicePayment(InvoicePayment invoicePayment);
}
