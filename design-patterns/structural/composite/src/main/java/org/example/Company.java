package org.example;

/**
 * Represents a company that uses the Composite pattern to organize employees.
 * 
 * @version 1.0
 */
public class Company {
    private String name;
    private String cnpj;
    private Person employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Gets information about all employees in the company hierarchy.
     * 
     * @return a string containing all employee information
     * @throws NullPointerException if no employees are registered
     */
    public String getEmployees() {
        if (this.employees == null) {
            throw new NullPointerException("No employees registered.");
        }
        return this.employees.getInfo();
    }

    /**
     * Sets the root employee (typically a CEO or top manager).
     * 
     * @param employees the root person in the hierarchy
     */
    public void setEmployees(Person employees) {
        this.employees = employees;
    }
}

