package org.example;

/**
 * Invoice (Boleto) payment service implementation.
 * 
 * @version 1.0
 */
public class InvoiceService implements IService {
    @Override
    public String execute() {
        return "Payment by Bank Invoice.";
    }
    
    @Override
    public String cancel() {
        return "Payment cancelled.";
    }
}

