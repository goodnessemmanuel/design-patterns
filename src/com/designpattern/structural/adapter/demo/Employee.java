package com.designpattern.structural.adapter.demo;

/**
 * Employee - interface adapter with contract
 * that unifies all employees irrespective of
 * their difference so they become uniform
 */
public interface Employee {
    String getId();
    String getFirstName();
    String getLastName();
    String getEmail();
}
