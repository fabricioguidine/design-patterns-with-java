package org.example;

/**
 * Administrative department that handles cancellation procedures.
 * 
 * @version 1.0
 */
public class AdministrativeDepartment extends CustomerServiceDepartment {

    /**
     * Constructs an AdministrativeDepartment with a superior department.
     * 
     * @param superior the superior department (can be null if this is the top of the chain)
     */
    public AdministrativeDepartment(CustomerServiceDepartment superior) {
        procedureList.add(CancellationServiceOrderCreation.getCancellationProcedure());
        setSuperiorEmployee(superior);
    }

    @Override
    public String getJobDescription() {
        return "Administrative";
    }
}

