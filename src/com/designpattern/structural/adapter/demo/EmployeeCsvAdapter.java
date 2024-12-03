package com.designpattern.structural.adapter.demo;

/**
 * EmployeeCsvAdapter - this class adapts the legacy EmployeeCsv
 * to the new Employee with the help of the contract from the
 * employee interface
 */
public class EmployeeCsvAdapter implements Employee {
    private final EmployeeCsv employeeFromCsv;

    public EmployeeCsvAdapter(EmployeeCsv employeeCsv) {
        this.employeeFromCsv = employeeCsv;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeFromCsv.getId());
    }

    @Override
    public String getFirstName() {
        return employeeFromCsv.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeFromCsv.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeFromCsv.getMail();
    }

    /**
     * When you add below to string method, it violates adapter pattern
     * because we now have a toString function hence the entire implementation
     * would be seen as a Decorator instead of an adapter
     * @return - String
     */
    @Override
    public String toString() {
        return "Employee{ID: " + getId() + "}";
    }
}
