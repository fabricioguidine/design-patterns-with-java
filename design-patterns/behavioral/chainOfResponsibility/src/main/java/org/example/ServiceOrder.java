package org.example;

/**
 * Represents a service order with a specific creation type.
 * 
 * @version 1.0
 */
public class ServiceOrder {
    private static ServiceOrderCreation generatedProcedureType;
    
    /**
     * Constructs a ServiceOrder with the given creation type.
     * 
     * @param procedure the service order creation type
     */
    public ServiceOrder(ServiceOrderCreation procedure) {
        this.generatedProcedureType = procedure;
    }

    /**
     * Gets the generated procedure type.
     * 
     * @return the procedure type
     */
    public static ServiceOrderCreation getGeneratedProcedureType() {
        return generatedProcedureType;
    }

    /**
     * Sets the generated procedure type.
     * 
     * @param generatedProcedureType the procedure type to set
     */
    public void setGeneratedProcedureType(ServiceOrderCreation generatedProcedureType) {
        this.generatedProcedureType = generatedProcedureType;
    }
}

