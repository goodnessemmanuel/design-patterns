package com.designpattern.behavioural.memento;

import com.designpattern.behavioural.memento.demo.CareTaker;
import com.designpattern.behavioural.memento.demo.Employee;
import com.designpattern.behavioural.memento.example.MementoEverydayExample;

public class MementoPatternDemo {
    public static void main(String[] args) {
       // mementoEverydayExample();
        mementoCustomImplementationDemo();
    }

    public static void mementoCustomImplementationDemo(){
        CareTaker careTaker = new CareTaker();

        Employee employee = new Employee();
        employee.setName("John doe");
        employee.setPhone("99-8888-7777");
        employee.setAddress("34 Main street block 2");

        System.out.println("Employee before save:                                    " + employee);

        careTaker.save(employee);

        employee.setPhone("88-6666-5555");
        careTaker.save(employee);

        System.out.println("Employee after changed phone and save:                    " + employee);

        employee.setPhone("33-9999-4444"); //phone is changed and not saved!

        careTaker.revert(employee); //although phone was newly set but not saved, I want to revert to previous phone

        System.out.println("Employee reverted to the last save point:                  " + employee);

        careTaker.revert(employee);

        System.out.println("Employee reverted to original:                             " + employee);

    }

    /**
     * mementoEverydayExample - the employee object used for this example
     * was achieved via the serializable interface.
     * Example memento with the java serializable interface
     * implemented in the Employee class
     */
    public static void mementoEverydayExample() {
        new MementoEverydayExample().demo();
    }
}
