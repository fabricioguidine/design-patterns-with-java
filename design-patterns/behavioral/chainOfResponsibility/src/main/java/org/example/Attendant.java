package org.example;

/**
 * Attendant department that handles registration procedures.
 * 
 * @version 1.0
 */
public class Attendant extends CustomerServiceDepartment {

    /**
     * Constructs an Attendant with a superior department.
     * 
     * @param superior the superior department
     */
    public Attendant(CustomerServiceDepartment superior) {
        procedureList.add(RegistrationServiceOrderCreation.getRegistrationProcedure());
        setSuperiorEmployee(superior);
    }

    @Override
    public String getJobDescription() {
        return "Attendant";
    }
}

