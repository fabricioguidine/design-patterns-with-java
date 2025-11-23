package org.example;

/**
 * Concrete factory implementation for creating objects related to internal employees.
 * This factory creates a family of products (Payroll and Report) specifically
 * designed for internal employees.
 * * @version 1.0
 */
public class InternalEmployeeFactory implements AbstractFactory {
    
    /**
     * Creates a payroll document for internal employees.
     * 
     * @return a new InternalEmployeePayroll instance
     */
    @Override
    public Payroll createPayroll() {
        return new InternalEmployeePayroll();
    }
    
    /**
     * Creates a report document for internal employees.
     * 
     * @return a new InternalEmployeeReport instance
     */
    @Override
    public Report createReport() {
        return new InternalEmployeeReport();
    }
}

