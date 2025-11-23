package org.example;

/**
 * Financial department that handles invoice procedures.
 * 
 * @version 1.0
 */
public class FinancialDepartment extends CustomerServiceDepartment {

    /**
     * Constructs a FinancialDepartment with a superior department.
     * 
     * @param superior the superior department
     */
    public FinancialDepartment(CustomerServiceDepartment superior) {
        procedureList.add(InvoiceServiceOrderCreation.getInvoiceProcedure());
        setSuperiorEmployee(superior);
    }

    @Override
    public String getJobDescription() {
        return "Financial";
    }
}

