package org.example;

/**
 * Abstract Factory interface for creating families of related objects.
 * This pattern provides an interface for creating families of related or dependent
 * objects without specifying their concrete classes.
 * 
 * @version 1.0
 */
public interface AbstractFactory {
    
    /**
     * Creates a payroll object.
     * 
     * @return a new Payroll instance
     */
    Payroll createPayroll();
    
    /**
     * Creates a report object.
     * 
     * @return a new Report instance
     */
    Report createReport();
}

