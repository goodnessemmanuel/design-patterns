package com.designpattern.structural.adapter.demo;

/**
 * EmployeeLdapAdapter - this class adapts the legacy EmployeeLdap
 * to the new Employee with the help of the contract from the
 * employee interface
 *
 */
public class EmployeeLdapAdapter implements Employee {
    private String cn;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeLdapAdapter(String cn, String firstname, String lastname, String emailAddress) {
        this.cn = cn;
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = emailAddress;
    }

    @Override
    public String getId() {
        return cn;
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
        return email;
    }


    /**
     * Usually an object address is printed in place of to string to
     * maintain the pattern implementation as an adapter.
     * When you add below to string method, it violates adapter pattern
     * because we now have a toString function hence the entire implementation
     * would be seen as a Decorator instead of an adapter
     * @return - String
     */

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id:'" + cn + '\'' +
//                ", first name:'" + firstName + '\'' +
//                ", last name:'" + lastName + '\'' +
//                ", email:'" + email + '\'' +
//                '}';
//    }

}
