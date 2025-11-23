package org.example;

/**
 * Account balance payment service implementation.
 * 
 * @version 1.0
 */
public class BalanceService implements IService {
    @Override
    public String execute() {
        return "Payment with account balance.";
    }
    
    @Override
    public String cancel() {
        return "Payment cancelled.";
    }
}

