package com.designpattern.structural.adapter.demo;

import java.util.StringTokenizer;

/**
 * EmployeeCsv - assume this is an old legacy class.  it does not implement the Employee interface
 * that shouldn't or cannot be changed maybe because of some
 * administrative or business reason. hence it cannot implement
 * the employee interface.
 * NB: notice some of the fields are not in sync with the expected
 * new employee interface signatures.
 */
public class EmployeeCsv {
    private int id;
    private String firstName;
    private String lastname;
    private String mail;

    public EmployeeCsv(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if(tokenizer.hasMoreElements()){
            id = Integer.parseInt(tokenizer.nextToken());
        }

        if(tokenizer.hasMoreElements()){
            firstName = tokenizer.nextToken();
        }

        if(tokenizer.hasMoreElements()){
            lastname = tokenizer.nextToken();
        }

        if(tokenizer.hasMoreElements()){
            mail = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
