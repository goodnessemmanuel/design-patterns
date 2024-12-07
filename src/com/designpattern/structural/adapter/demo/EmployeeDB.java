package com.designpattern.structural.adapter.demo;

/**
 * EmployeeDB - class with unique field names
 * with the Employee interface it is force
 * to adapt to the common contract
 * i.e. getId, getFirstName, getLastName, and getEmail
 */
public class EmployeeDB implements Employee{
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeDB(String id, String firstName, String lastName, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id:'" + id + '\'' +
                ", first name:'" + firstName + '\'' +
                ", last name:'" + lastName + '\'' +
                ", email:'" + emailAddress + '\'' +
                '}';
    }
}
