package com.src;

import com.src.mailservice.MailService;

public class Main {

    public static void main(String[] args) {
//        var taxCalculator = getCalculator();
//        taxCalculator.calculateTax();

        //through abstraction methods like connection to
        //to server in the MailService class has been hidden
        //from this main class
        var mailService = new MailService();
        mailService.sendEmail();
    }

    /**programming to interface
     * TaxCalculator type here is an interface
     * which is used to achieve loose coupling
     * you can decide which particular implementation
     * of tax calculator you want to use e.g. 2019, 2020
     * @return
     */
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
