package org.example;

/**
 * Service interface for the Factory Method pattern.
 * 
 * @version 1.0
 */
public interface IService {
    /**
     * Executes the service.
     * 
     * @return execution result message
     */
    String execute();
    
    /**
     * Cancels the service.
     * 
     * @return cancellation result message
     */
    String cancel();
}

