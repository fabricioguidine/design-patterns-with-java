package org.example;

/**
 * Technical support department that handles ticket procedures.
 * 
 * @version 1.0
 */
public class TechnicalSupportDepartment extends CustomerServiceDepartment {

    /**
     * Constructs a TechnicalSupportDepartment with a superior department.
     * 
     * @param superior the superior department
     */
    public TechnicalSupportDepartment(CustomerServiceDepartment superior) {
        procedureList.add(TicketServiceOrderCreation.getTicketProcedure());
        setSuperiorEmployee(superior);
    }

    @Override
    public String getJobDescription() {
        return "Technical Support";
    }
}

