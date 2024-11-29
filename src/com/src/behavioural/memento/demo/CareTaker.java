package com.src.behavioural.memento.demo;

import java.util.Stack;

//Caretaker
public class CareTaker {
    private final Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee){
        employeeHistory.push(employee.save());
    }
    public void revert(Employee employee){
      if(!employeeHistory.isEmpty())
          employee.revert(employeeHistory.pop());
    }
}
