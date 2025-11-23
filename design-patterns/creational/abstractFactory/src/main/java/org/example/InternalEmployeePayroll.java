package org.example;

/**
 * Concrete implementation of Payroll for internal employees.
 * This class provides payroll information specific to internal employees.
 * * @version 1.0
 */
public class InternalEmployeePayroll implements Payroll {
    
    /**
     * Generates and returns the payroll information for internal employees.
     * 
     * @return a string containing the payroll information for internal employees
     */
    @Override
    public String generate() {
        return "Payroll for Employee: Internal.";
    }
}

