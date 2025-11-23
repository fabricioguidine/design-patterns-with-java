package org.example;

/**
 * Employee class that uses the Abstract Factory pattern to create related objects.
 * This class demonstrates how the Abstract Factory pattern allows creating families
 * of related objects (Payroll and Report) without knowing their concrete classes.
 * * @version 1.0
 */
public class Employee {
    
    private final Payroll payroll;
    private final Report report;
    
    /**
     * Constructs a new Employee using the provided factory to create
     * related objects (payroll and report).
     * 
     * @param factory the abstract factory to use for creating objects
     * @throws IllegalArgumentException if factory is null
     */
    public Employee(AbstractFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("Factory cannot be null");
        }
        this.payroll = factory.createPayroll();
        this.report = factory.createReport();
    }
    
    /**
     * Generates and returns the payroll information.
     * 
     * @return a string containing the payroll information
     */
    public String generatePayroll() {
        return this.payroll.generate();
    }
    
    /**
     * Generates and returns the report information.
     * 
     * @return a string containing the report information
     */
    public String generateReport() {
        return this.report.generate();
    }
}