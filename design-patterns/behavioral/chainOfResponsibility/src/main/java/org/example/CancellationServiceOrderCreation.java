package org.example;

/**
 * Singleton representing a cancellation service order creation.
 * 
 * @version 1.0
 */
public class CancellationServiceOrderCreation implements ServiceOrderCreation {
    private static final CancellationServiceOrderCreation cancellationProcedure = 
        new CancellationServiceOrderCreation();

    private CancellationServiceOrderCreation() {}

    /**
     * Gets the singleton instance of cancellation procedure.
     * 
     * @return the cancellation procedure instance
     */
    public static CancellationServiceOrderCreation getCancellationProcedure() {
        return cancellationProcedure;
    }
}

