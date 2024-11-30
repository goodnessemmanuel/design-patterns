package com.designpattern.behavioural.strategy;

import com.designpattern.behavioural.strategy.demo.AmexStrategy;
import com.designpattern.behavioural.strategy.demo.CreditCard;
import com.designpattern.behavioural.strategy.demo.Person;
import com.designpattern.behavioural.strategy.demo.VisaStrategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyPatternDemo {
    public static void main(String[] args) {
//        strategyEverydayExample();

        // Custom strategy pattern implementation
        CreditCard amexCard1 = new CreditCard(new AmexStrategy());
        amexCard1.setNumber("371414786259824"); //valid auto generated amex. source: https://www.akto.io/tools/credit-card-generator
        amexCard1.setDate("05/25");
        amexCard1.setCvv("919");
        System.out.println("Is amex card valid: " + amexCard1.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());
        amexCard2.setNumber("371414786259825"); //invalid test number
        amexCard2.setDate("06/18");
        amexCard2.setCvv("103");
        System.out.println("Is amex card valid: " + amexCard2.isValid());

        //Adding another strategy for validation as below quite easy
        //due to the use of strategy design pattern
        CreditCard validVisaCardTest = new CreditCard(new VisaStrategy());
        validVisaCardTest.setNumber("4131358022056127"); //invalid test number
        validVisaCardTest.setDate("09/25");
        validVisaCardTest.setCvv("546");
        System.out.println("Is visa card valid: " + validVisaCardTest.isValid());

        CreditCard invalidVisaCardTest = new CreditCard(new VisaStrategy());
        invalidVisaCardTest.setNumber("4131358022056132"); //invalid test number
        invalidVisaCardTest.setDate("09/24");
        invalidVisaCardTest.setCvv("606");
        System.out.println("Is visa card valid: " + invalidVisaCardTest.isValid());

    }

    /**
     * Java collection sort method uses a strategy design
     * to compare and sort object at run time
     */
    public static void strategyEverydayExample() {
        List<Person> people = new ArrayList<>();

        var james = new Person("James", 18);
        var armstrong = new Person("Armstrong", 22);
        var bryan = new Person("bryan", 20);

        people.add(james);
        people.add(armstrong);
        people.add(bryan);

        //print without sorting
        System.out.println("\nPersons unsorted");
        printPeople(people);

        //sort people using age comparator strategy.
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge() > o2.getAge())
                    return 1;
                if(o1.getAge() < o2.getAge())
                    return -1;
                else return 0;
            }
        });
        System.out.println("\nPersons sorted by age");
        printPeople(people);

        //sort people using name comparator strategy.
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\nPersons sorted by name");
        printPeople(people);
    }

    private static void printPeople(List<Person> people) {
        for (Person person : people){
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
