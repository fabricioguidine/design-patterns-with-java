package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Base department class for the Facade pattern.
 * 
 * @version 1.0
 */
public class Department {
    private List<Employee> employeesWithoutTraining = new ArrayList<>();

    /**
     * Adds an employee without training to this department.
     * 
     * @param employee the employee to add
     * @throws NullPointerException if employee is null
     */
    public void addEmployeeWithoutTraining(Employee employee) {
        if (employee == null) {
            throw new NullPointerException("Employee cannot be null.");
        }
        this.employeesWithoutTraining.add(employee);
    }

    /**
     * Verifies if an employee has a certificate (is in the list of employees without training).
     * 
     * @param employee the employee to check
     * @return true if employee is in the list (meaning they don't have training/certificate)
     */
    public boolean verifyCertificate(Employee employee) {
        return this.employeesWithoutTraining.contains(employee);
    }
}

