package org.example;

/**
 * Concrete factory implementation for creating objects related to outsourced employees.
 * This factory creates a family of products (Payroll and Report) specifically
 * designed for outsourced employees.
 * * @version 1.0
 */
public class OutsourcedEmployeeFactory implements AbstractFactory {
    
    /**
     * Creates a payroll document for outsourced employees.
     * 
     * @return a new OutsourcedEmployeePayroll instance
     */
    @Override
    public Payroll createPayroll() {
        return new OutsourcedEmployeePayroll();
    }
    
    /**
     * Creates a report document for outsourced employees.
     * 
     * @return a new OutsourcedEmployeeReport instance
     */
    @Override
    public Report createReport() {
        return new OutsourcedEmployeeReport();
    }
}

