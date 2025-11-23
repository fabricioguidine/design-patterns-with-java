package org.example;

/**
 * Represents an employee that can be cloned using the Prototype pattern.
 * 
 * @version 1.0
 */
public class Employee implements Cloneable {
    private int registrationNumber;
    private String name;
    private Declaration declaration;

    /**
     * Constructs an Employee with the given information.
     * 
     * @param registrationNumber the registration number
     * @param name the employee name
     * @param declaration the declaration
     */
    public Employee(int registrationNumber, String name, Declaration declaration) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (declaration == null) {
            throw new IllegalArgumentException("Declaration cannot be null");
        }
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.declaration = declaration;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        if (declaration == null) {
            throw new IllegalArgumentException("Declaration cannot be null");
        }
        this.declaration = declaration;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee employeeClone = (Employee) super.clone();
        employeeClone.declaration = (Declaration) employeeClone.declaration.clone();
        return employeeClone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "registrationNumber=" + registrationNumber +
                ", name='" + name + '\'' +
                ", declaration=" + declaration +
                '}';
    }
}

