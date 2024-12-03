package com.designpattern.structural.adapter.demo;

/**
 * EmployeeLdap - assume this is an old legacy class
 * that shouldn't or cannot be changed maybe because of some
 * administrative or business reason.
 * NB: notice we did not implement the employee interface here at all
 */
public class EmployeeLdap {
    private String cn;
    private String firstname;
    private String surname;
    private String emailAddress;

    public EmployeeLdap(String cn, String firstname, String surname, String emailAddress) {
        this.cn = cn;
        this.firstname = firstname;
        this.surname = surname;
        this.emailAddress = emailAddress;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
