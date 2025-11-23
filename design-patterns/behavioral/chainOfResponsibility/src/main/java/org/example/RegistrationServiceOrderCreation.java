package org.example;

/**
 * Singleton representing a registration service order creation.
 * 
 * @version 1.0
 */
public class RegistrationServiceOrderCreation implements ServiceOrderCreation {
    private static final RegistrationServiceOrderCreation registrationProcedure = 
        new RegistrationServiceOrderCreation();

    private RegistrationServiceOrderCreation() {}

    /**
     * Gets the singleton instance of registration procedure.
     * 
     * @return the registration procedure instance
     */
    public static RegistrationServiceOrderCreation getRegistrationProcedure() {
        return registrationProcedure;
    }
}

