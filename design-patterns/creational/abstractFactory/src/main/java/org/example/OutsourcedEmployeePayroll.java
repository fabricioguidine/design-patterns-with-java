package org.example;

/**
 * Concrete implementation of Payroll for outsourced employees.
 * This class provides payroll information specific to outsourced employees.
 * * @version 1.0
 */
public class OutsourcedEmployeePayroll implements Payroll {
    
    /**
     * Generates and returns the payroll information for outsourced employees.
     * 
     * @return a string containing the payroll information for outsourced employees
     */
    @Override
    public String generate() {
        return "Payroll for Employee: Outsourced.";
    }
}

