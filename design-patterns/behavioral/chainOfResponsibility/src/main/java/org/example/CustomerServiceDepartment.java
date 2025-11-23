package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for customer service departments in the Chain of Responsibility pattern.
 * 
 * @version 1.0
 */
public abstract class CustomerServiceDepartment {
    protected List<ServiceOrderCreation> procedureList = new ArrayList<>();
    private CustomerServiceDepartment superiorEmployee;

    /**
     * Gets the superior employee/department.
     * 
     * @return the superior department
     */
    public CustomerServiceDepartment getSuperiorEmployee() {
        return superiorEmployee;
    }

    /**
     * Sets the superior employee/department.
     * 
     * @param superiorEmployee the superior department
     */
    public void setSuperiorEmployee(CustomerServiceDepartment superiorEmployee) {
        this.superiorEmployee = superiorEmployee;
    }

    /**
     * Gets the job description for this department.
     * 
     * @return the job description
     */
    public abstract String getJobDescription();

    /**
     * Registers a procedure by passing it through the chain of responsibility.
     * 
     * @param serviceOrder the service order to process
     * @return the department that handles the procedure, or "No Procedure" if none can handle it
     */
    public String registerProcedure(ServiceOrder serviceOrder) {
        if (serviceOrder == null) {
            return "No Procedure";
        }
        
        ServiceOrderCreation procedureType = ServiceOrder.getGeneratedProcedureType();
        if (procedureList.contains(procedureType)) {
            return getJobDescription();
        } else {
            if (superiorEmployee != null) {
                return superiorEmployee.registerProcedure(serviceOrder);
            } else {
                return "No Procedure";
            }
        }
    }
}

